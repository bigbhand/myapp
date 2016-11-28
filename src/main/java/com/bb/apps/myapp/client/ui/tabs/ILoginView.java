package com.bb.apps.myapp.client.ui.tabs;

import com.bb.apps.myapp.shared.User;
import com.google.gwt.user.client.ui.IsWidget;
import com.mvp4g.client.view.ReverseViewInterface;

public interface ILoginView extends IsWidget, ReverseViewInterface<ILoginView.ILoginPresenter>{

	public interface ILoginPresenter{

		void doSelectHomeTabView();

		void checkCredentials(User user);
		
	}

	void initializeFields();
}
