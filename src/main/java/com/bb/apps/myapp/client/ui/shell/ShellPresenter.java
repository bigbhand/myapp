package com.bb.apps.myapp.client.ui.shell;

import com.bb.apps.myapp.client.MyAppEventBus;
import com.bb.apps.myapp.client.Tabs;
import com.bb.apps.myapp.shared.User;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = IShellView.class)
public class ShellPresenter extends BasePresenter<IShellView, MyAppEventBus>
implements IShellView.IShellPresenter{

	public void onDoSelectLoginPage(){
		
		eventBus.getLoginView();
		eventBus.setRooContentBodyView(view.asWidget());
	}
	
	public void onDoSelectHomeView(){
		
		eventBus.prepareHeaderView();
		eventBus.prepareFooterView();
		eventBus.prepareNavBarView();
		
		eventBus.setSelectedTabText("Home");
		eventBus.setSelectedTab(Tabs.HOME);
		
		eventBus.getHomeView();
		eventBus.setRooContentBodyView(view.asWidget());
	}
	
	public void onDoSelectAdminHomeScreen(){
		
		eventBus.prepareHeaderView();
		eventBus.prepareFooterView();
		eventBus.prepareAdminNavBarView();
		
		eventBus.setSelectedTabText("Home");
		eventBus.setSelectedTab(Tabs.HOME);
		
		eventBus.getAdminHomeView();
		eventBus.setRooContentBodyView(view.asWidget());
	}
	
	public void onSetSelectedTabText(String tabText){
		
		view.setSelectedTabText(tabText);
	}
	
	public void onSetCeneterBodyView(Widget widget){
		
		view.setCenterBodyView(widget);
	}
}
