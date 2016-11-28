package com.bb.apps.myapp.client.ui.tabs;

import com.bb.apps.myapp.client.ApplicationSession;
import com.bb.apps.myapp.client.GreetingServiceAsync;
import com.bb.apps.myapp.client.IMyAppConstants;
import com.bb.apps.myapp.client.MyAppEventBus;
import com.bb.apps.myapp.client.MyAppUtility;
import com.bb.apps.myapp.shared.User;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.WindowScrollListener;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;

@Presenter(view = ILoginView.class)
public class LoginPresenter extends BasePresenter<ILoginView, MyAppEventBus>
implements ILoginView.ILoginPresenter{

	@Inject 
	GreetingServiceAsync service;
	
	public void onGetLoginView(){
		
		view.initializeFields();
		eventBus.setCeneterBodyView(view.asWidget());
	}
	
	public void doSelectHomeTabView() {
		
		eventBus.doSelectHomeView();
		
	}

	public void checkCredentials(User user) {
		
		service.checkCredentials(user, new AsyncCallback<User>() {

			public void onFailure(Throwable caught) {
				
				Window.alert("Error : while login!!");
				
			}

			public void onSuccess(User result) {
				
				if(result!=null)
				{
					ApplicationSession.setUser(result);
					
					if(MyAppUtility.isActiveUser(result)){
						
						if(MyAppUtility.isAdmin(result)){
							eventBus.doSelectAdminHomeScreen();
						}
						else{
							eventBus.doSelectHomeView();
						}
					}
				}
				
			}
		});
		
	}

}
