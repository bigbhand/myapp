package com.bb.apps.myapp.client.ui.header;

import com.bb.apps.myapp.client.MyAppEventBus;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = IHeaderView.class)
public class HeaderPresenter extends BasePresenter<IHeaderView, MyAppEventBus> 
implements IHeaderView.IHeaderPresenter{

	public void onPrepareHeaderView(){
		
		view.initializeView();
		eventBus.setHeaderView(view.asWidget());
	}
	
}
