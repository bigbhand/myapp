package com.bb.apps.myapp.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class NavBarItem extends Composite{

	private static NavBarItemUiBinder uiBinder = GWT.create(NavBarItemUiBinder.class);

	interface NavBarItemUiBinder extends UiBinder<Widget, NavBarItem> {
	}
	
	@UiField
	Label label;
	
	String text;
	public NavBarItem() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public String getText() {
		return label.getText();
	}

	public void setText(String text) {
		label.setText(text);
	}
	
}
