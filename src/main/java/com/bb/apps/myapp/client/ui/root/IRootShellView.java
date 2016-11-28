package com.bb.apps.myapp.client.ui.root;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.view.ReverseViewInterface;

public interface IRootShellView extends IsWidget,ReverseViewInterface<IRootShellView.IRootShellPresenter>{

	public interface IRootShellPresenter{
		
	}

	void setContent(Widget widget);

	void setHeaderView(Widget widget);

	void setFooterView(Widget widget);

	void setNavBarView(Widget widget);
}
