package com.bb.apps.myapp.server.cache;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bb.apps.myapp.client.ICacheService;
import com.bb.apps.myapp.shared.ReferenceCacheBean;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import net.sf.ehcache.config.CacheConfiguration;
import net.sf.ehcache.search.Attribute;
import net.sf.ehcache.search.Query;
import net.sf.ehcache.search.Result;
import net.sf.ehcache.search.Results;

public class CacheServiceImpl extends RemoteServiceServlet implements ICacheService{

	private static Logger logger = LoggerFactory.getLogger(CacheServiceImpl.class);
	private static CacheManager cacheManager = null;
	
	@Override
	public void init() throws ServletException
	{
		super.init();
		CacheHelper helper = new CacheHelper();
		URL url = Thread.currentThread().getContextClassLoader().getResource("/ehcache.xml");
		cacheManager = CacheManager.create(url);
		CacheConfiguration cacheConfiguration = cacheManager.getConfiguration().getCacheConfigurations().get("referenceCache");
		cacheConfiguration.setupFor(cacheManager);
		
		Cache referenceCache = cacheManager.getCache("referenceCache");
		List<ReferenceCacheBean> cacheResult = helper.getReferenceDetails();
		int i=0;
		for(ReferenceCacheBean refBean : cacheResult)
		{
			Element element = new Element("KEY"+i, refBean);
			referenceCache.put(element);
			i++;
		}
		
	}
	
	public Map<String, List<String>> getReferenceMap(List<String> refAttributes) {
		
		Map<String, List<String>> refMap = new HashMap<String, List<String>>();
		
		Cache cache = cacheManager.getCache("referenceCache");
		Attribute<String> reference =  cache.getSearchAttribute("referenceInput");
		Query query =  null;
		List<String> refList = null;
		
		for(String refName : refAttributes){
			query = cache.createQuery().addCriteria(reference.eq(refName)).includeValues().end();
			Results results = query.execute();
			List<Result> resultList = results.all();
			refList = new ArrayList<String>();
			
			for(Result result : resultList){
				
				ReferenceCacheBean cacheBean = (ReferenceCacheBean) result.getValue();
				List<String> refDetailsList = cacheBean.getReferenceValueList();
				refList.addAll(refDetailsList);
			}
			
			refMap.put(refName, refList);
		}
		
		return refMap;
	}
	
	
}
