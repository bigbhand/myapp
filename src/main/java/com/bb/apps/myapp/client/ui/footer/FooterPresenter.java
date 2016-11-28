package com.bb.apps.myapp.client.ui.footer;

import com.bb.apps.myapp.client.MyAppEventBus;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = IFooterView.class)
public class FooterPresenter extends BasePresenter<IFooterView, MyAppEventBus>
implements IFooterView.IFooterPresenter{

	public void onPrepareFooterView(){
		
		eventBus.setFooterView(view.asWidget());
	}
}
