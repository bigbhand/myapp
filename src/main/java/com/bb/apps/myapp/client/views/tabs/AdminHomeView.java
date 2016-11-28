package com.bb.apps.myapp.client.views.tabs;

import com.bb.apps.myapp.client.ApplicationSession;
import com.bb.apps.myapp.client.Tabs;
import com.bb.apps.myapp.client.messages.MyAppMessages;
import com.bb.apps.myapp.client.ui.tabs.IAdminHomeView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class AdminHomeView extends Composite implements IAdminHomeView {

	private static AdminHomeViewUiBinder uiBinder = GWT.create(AdminHomeViewUiBinder.class);

	interface AdminHomeViewUiBinder extends UiBinder<Widget, AdminHomeView> {
	}

	private IAdminHomeView.IAdminHomePresenter presenter;
	
	@UiField Label homeNote;
	@UiField Label adminLabel;
	
	private MyAppMessages msg = GWT.create(MyAppMessages.class);
	
	public AdminHomeView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setPresenter(IAdminHomePresenter presenter) {
		this.presenter = presenter;
		
	}

	public IAdminHomePresenter getPresenter() {
		return presenter;
	}
	
	public void initializeFields() {
		
		adminLabel.setText(msg.adminGreet());
		homeNote.setText(msg.homeMessage(ApplicationSession.getUser().getUsername(), Tabs.HOME.toString(), LocaleInfo.getCurrentLocale().getLocaleName()));
		
	}



}
