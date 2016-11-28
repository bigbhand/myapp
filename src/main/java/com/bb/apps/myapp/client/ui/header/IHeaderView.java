package com.bb.apps.myapp.client.ui.header;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.ReverseViewInterface;

public interface IHeaderView extends IsWidget, ReverseViewInterface<IHeaderView.IHeaderPresenter>{

	public interface IHeaderPresenter{
		
	}

	void initializeView();
}
