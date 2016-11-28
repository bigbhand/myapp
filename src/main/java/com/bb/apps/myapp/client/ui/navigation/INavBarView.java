package com.bb.apps.myapp.client.ui.navigation;

import com.bb.apps.myapp.client.Tabs;
import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.ReverseViewInterface;

public interface INavBarView extends IsWidget, ReverseViewInterface<INavBarView.INavBarPresenter>{

	public interface INavBarPresenter{
		
	}

	void selectTab(Tabs tab);

	void initializeView(boolean isAdminView);
}
