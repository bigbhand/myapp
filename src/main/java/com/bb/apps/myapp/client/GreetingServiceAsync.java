package com.bb.apps.myapp.client;

import com.bb.apps.myapp.shared.User;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GreetingServiceAsync {

	void checkCredentials(User user, AsyncCallback<User> asyncCallback);

}
