package com.bb.apps.myapp.client.views.tabs;

import java.util.Date;

import com.bb.apps.myapp.client.ApplicationSession;
import com.bb.apps.myapp.client.ui.tabs.ILoginView;
import com.bb.apps.myapp.shared.User;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.form.PasswordField;
import com.sencha.gxt.widget.core.client.form.TextField;

public class LoginView extends Composite implements ILoginView {

	private static LoginViewUiBinder uiBinder = GWT.create(LoginViewUiBinder.class);

	interface LoginViewUiBinder extends UiBinder<Widget, LoginView> {
	}
	
	private ILoginView.ILoginPresenter presenter;
	
	@UiField TextField username;
	@UiField PasswordField password;
	@UiField TextButton loginButton;
	@UiField HTML loginError;

	DateTimeFormat formatter = DateTimeFormat.getFormat("dd/MM/yyyy hh:mm:ss");
	
	public LoginView() {
		initWidget(uiBinder.createAndBindUi(this));
		bind();
	}
	
	private void bind()
	{
		loginError.setHTML("<span style='color:red;'>Please enter your credentials</span>");
		
		loginButton.addSelectHandler(new SelectHandler() {
			
			public void onSelect(SelectEvent event) {
			
				if(validateField())
				{
					loginError.setVisible(false);
					User user = new User();
					user.setUsername(username.getText());
					user.setLastLogin(formatter.format(new Date()));
					presenter.checkCredentials(user);
				}
				else
				{
					loginError.setVisible(true);
				}
				
			}
		});
	}

	public void setPresenter(ILoginPresenter presenter) {
		this.presenter = presenter;
		
	}

	public ILoginPresenter getPresenter() {
		return presenter;
	}
	
	private boolean validateField()
	{
		boolean isValid = true;
		
		isValid &= username.isValid();
		isValid &= password.isValid();
		
		return isValid;
	}

	public void initializeFields() {
		
		username.setValue("");
		password.setValue("");
		loginError.setVisible(false);
		
	}

	
}
