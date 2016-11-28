package com.bb.apps.myapp.server.cache;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bb.apps.myapp.server.connection.DBConnecetionFactory;
import com.bb.apps.myapp.server.mapper.IMyAppServiceMapper;
import com.bb.apps.myapp.shared.ReferenceCacheBean;;

public class CacheHelper {

	private static Logger logger = LoggerFactory.getLogger(CacheHelper.class);
	SqlSession session = null;
	
	public List<ReferenceCacheBean> getReferenceDetails(){
		
		List<ReferenceCacheBean> resultList = new ArrayList<ReferenceCacheBean>();
		
		{
			ReferenceCacheBean cacheBean = new ReferenceCacheBean();
			cacheBean.setRefereneceKey("COUNTRY");
			resultList.add(cacheBean);
			
			try{
				
				session = DBConnecetionFactory.getDBSession().openSession();
				IMyAppServiceMapper mapper = session.getMapper(IMyAppServiceMapper.class);
				List<String> result = mapper.getCountryList();
				if(result!=null){
					session.commit();
				}
				cacheBean.setReferenceValueList(result);
			}catch (Exception ex){
				cacheBean.setReferenceValueList(new ArrayList<String>());
			}
			finally {
				 DBConnecetionFactory.closeSqlSession(session);
			}
		}
		
		{
			ReferenceCacheBean cacheBean = new ReferenceCacheBean();
			cacheBean.setRefereneceKey("CURRENCY");
			resultList.add(cacheBean);
			
			try{
				
				session = DBConnecetionFactory.getDBSession().openSession();
				IMyAppServiceMapper mapper = session.getMapper(IMyAppServiceMapper.class);
				List<String> result = mapper.getCountryList();
				if(result!=null){
					session.commit();
				}
				cacheBean.setReferenceValueList(result);
			}catch (Exception ex){
				cacheBean.setReferenceValueList(new ArrayList<String>());
			}
			finally {
				 DBConnecetionFactory.closeSqlSession(session);
			}
		}
		
		return resultList;
	}
}
