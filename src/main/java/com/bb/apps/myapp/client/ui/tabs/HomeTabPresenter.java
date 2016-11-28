package com.bb.apps.myapp.client.ui.tabs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bb.apps.myapp.client.GreetingServiceAsync;
import com.bb.apps.myapp.client.ICacheServiceAsync;
import com.bb.apps.myapp.client.IMyAppConstants;
import com.bb.apps.myapp.client.MyAppEventBus;
import com.bb.apps.myapp.client.ui.tabs.IHomeTabView.IHomeTabPresenter;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = IHomeTabView.class)
public class HomeTabPresenter extends BasePresenter<IHomeTabView, MyAppEventBus>
implements IHomeTabPresenter{

	@Inject
	ICacheServiceAsync service;
	
	Map<String,List<String>> combomap = null;
	
	public void onGetHomeView(){
		
		if(combomap==null){
			eventBus.getReferenceMap();
		}
		view.setCacheAttributes(combomap);
		
		view.initializeFields();
		eventBus.setCeneterBodyView(view.asWidget());
	}
	
	public void onGetComboMap(){
		
		if(combomap!=null){
			eventBus.setComboMap(combomap);
		}
		else{
			onGetReferenceMap();
		}
	}
	
	public void onSetComboMap(Map<String, List<String>> comboMap){
		
		this.combomap = comboMap;
		view.setCacheAttributes(comboMap);
	}
	
	public void onGetReferenceMap(){
		
		List<String> refereneceKeys = new ArrayList<String>();
		refereneceKeys.add(IMyAppConstants.CACHE_COUNTRY);
		
		service.getReferenceMap(refereneceKeys, new AsyncCallback<Map<String, List<String>>>() {

			public void onFailure(Throwable caught) {
				
			}

			public void onSuccess(Map<String, List<String>> result) {
				
				if(result!=null)
				{
					combomap = result;
					eventBus.setComboMap(combomap);
				}
				
			}
		});
	}
}
