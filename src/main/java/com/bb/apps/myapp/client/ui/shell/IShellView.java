package com.bb.apps.myapp.client.ui.shell;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.view.ReverseViewInterface;

public interface IShellView extends IsWidget, ReverseViewInterface<IShellView.IShellPresenter>{

	public interface IShellPresenter{
		
	}

	void setCenterBodyView(Widget widget);

	void setSelectedTabText(String tabText);
}
