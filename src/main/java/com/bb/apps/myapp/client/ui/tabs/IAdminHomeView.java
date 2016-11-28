package com.bb.apps.myapp.client.ui.tabs;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.ReverseViewInterface;

public interface IAdminHomeView extends IsWidget, ReverseViewInterface<IAdminHomeView.IAdminHomePresenter>{

	public interface IAdminHomePresenter{
		
	}

	void initializeFields();
}
