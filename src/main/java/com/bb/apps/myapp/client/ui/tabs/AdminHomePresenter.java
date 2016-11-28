package com.bb.apps.myapp.client.ui.tabs;

import java.util.List;
import java.util.Map;

import com.bb.apps.myapp.client.MyAppEventBus;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = IAdminHomeView.class)
public class AdminHomePresenter extends BasePresenter<IAdminHomeView, MyAppEventBus>
implements IAdminHomeView.IAdminHomePresenter{

	Map<String,List<String>> comboMap = null;
	
	public void onGetAdminHomeView(){
	
		view.initializeFields();
		eventBus.setCeneterBodyView(view.asWidget());
	}
	
	public void onSetComboMap(Map<String, List<String>> comboMap){
		
		this.comboMap = comboMap;
	}
}
