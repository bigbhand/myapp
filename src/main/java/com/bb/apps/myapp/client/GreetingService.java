package com.bb.apps.myapp.client;

import com.bb.apps.myapp.shared.User;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("myApp")
public interface GreetingService extends RemoteService {
  
	User checkCredentials(User user);
}
