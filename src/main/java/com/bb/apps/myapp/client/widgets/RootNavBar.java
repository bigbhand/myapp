package com.bb.apps.myapp.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class RootNavBar extends Composite{

	private static RootNavBarUiBinder uiBinder = GWT.create(RootNavBarUiBinder.class);

	interface RootNavBarUiBinder extends UiBinder<Widget, RootNavBar> {
	}

	public RootNavBar() {
		initWidget(uiBinder.createAndBindUi(this));
	}


}
