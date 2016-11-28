package com.bb.apps.myapp.client.ui.navigation;

import com.bb.apps.myapp.client.MyAppEventBus;
import com.bb.apps.myapp.client.Tabs;
import com.bb.apps.myapp.client.ui.navigation.INavBarView.INavBarPresenter;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = INavBarView.class)
public class NavBarPresenter extends BasePresenter<INavBarView, MyAppEventBus>
implements INavBarPresenter{

	public void onPrepareNavBarView()
	{
		view.initializeView(false);
		eventBus.setNavBarView(view.asWidget());
	}
	
	public void onPrepareAdminNavBarView(){
		
		view.initializeView(true);
		eventBus.setNavBarView(view.asWidget());
	}
	
	public void onSetSelectedTab(Tabs tab){
		
		view.selectTab(tab);
	}
}
