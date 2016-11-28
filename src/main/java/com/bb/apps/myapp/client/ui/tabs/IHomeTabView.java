package com.bb.apps.myapp.client.ui.tabs;

import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.ReverseViewInterface;

public interface IHomeTabView extends IsWidget, ReverseViewInterface<IHomeTabView.IHomeTabPresenter>{

	public interface IHomeTabPresenter{
		
	}

	void initializeFields();

	void setCacheAttributes(Map<String, List<String>> combomap);
}
