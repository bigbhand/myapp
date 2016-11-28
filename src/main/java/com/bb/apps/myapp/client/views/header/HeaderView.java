package com.bb.apps.myapp.client.views.header;

import java.util.Date;

import com.bb.apps.myapp.client.ApplicationSession;
import com.bb.apps.myapp.client.IMyAppResources;
import com.bb.apps.myapp.client.messages.MyAppMessages;
import com.bb.apps.myapp.client.ui.header.IHeaderView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class HeaderView extends Composite implements IHeaderView {

	private static HeaderViewUiBinder uiBinder = GWT.create(HeaderViewUiBinder.class);

	interface HeaderViewUiBinder extends UiBinder<Widget, HeaderView> {
	}
	
	private IHeaderView.IHeaderPresenter presenter;
	private MyAppMessages msg = GWT.create(MyAppMessages.class);
	
	@UiField Image themeHeader;
	@UiField Image appName;
	@UiField Image appLogo;
	@UiField Label welcomeNote;
	@UiField Label lastLogin;
	
	public HeaderView() {
		initWidget(uiBinder.createAndBindUi(this));
		bind();
	}
	
	private void bind()
	{
		themeHeader.setResource(IMyAppResources.CSS.themeHeader());
		appName.setResource(IMyAppResources.CSS.appName());
		appLogo.setResource(IMyAppResources.CSS.appLogo());
	}

	public void setPresenter(IHeaderPresenter presenter) {
		this.presenter = presenter;
		
	}

	public IHeaderPresenter getPresenter() {
		return presenter;
	}

	public void initializeView() {
		
		welcomeNote.setText(msg.welcomeUser(ApplicationSession.getUser().getUsername()));
		lastLogin.setText(msg.lastLogin(new Date()));
		
	}

	
}
