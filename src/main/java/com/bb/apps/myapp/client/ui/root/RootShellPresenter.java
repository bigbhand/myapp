package com.bb.apps.myapp.client.ui.root;

import com.bb.apps.myapp.client.MyAppEventBus;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view  = IRootShellView.class)
public class RootShellPresenter extends BasePresenter<IRootShellView, MyAppEventBus>
implements IRootShellView.IRootShellPresenter{

	public RootShellPresenter(){
		System.out.println("Root shell constructed..");
	}
	
	public void onSetHeaderView(Widget widget){
		
		view.setHeaderView(widget);
	}
	
	public void onSetFooterView(Widget widget){
		
		view.setFooterView(widget);
	}
	
	public void onSetNavBarView(Widget widget){
		
		view.setNavBarView(widget);
	}
	
	public void onSetRooContentBodyView(Widget widget){
		
		view.setContent(widget);
	}
	
}
