package com.bb.apps.myapp.client;

import com.bb.apps.myapp.shared.User;

public class ApplicationSession {

	private static User user = new User();

	public static User getUser() {
		return user;
	}

	public static void setUser(User user) {
		ApplicationSession.user = user;
	}
	
	
}
