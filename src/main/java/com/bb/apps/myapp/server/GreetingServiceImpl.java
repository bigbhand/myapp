package com.bb.apps.myapp.server;

import com.bb.apps.myapp.client.GreetingService;
import com.bb.apps.myapp.shared.User;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;


@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
    GreetingService {

	public User checkCredentials(User user) {
		
		return new MapperServiceImpl().checkCredentials(user);
	}

 
}
