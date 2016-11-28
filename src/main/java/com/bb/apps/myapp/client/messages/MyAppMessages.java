package com.bb.apps.myapp.client.messages;

import java.util.Date;

import com.google.gwt.i18n.client.Messages;

public interface MyAppMessages extends Messages{

	@DefaultMessage("Welcome, {0}")
	String welcomeUser(String user);
	
	@DefaultMessage("Last login : {0,date,medium} {0,time,medium}")
	String lastLogin(Date date);
	
	@DefaultMessage("Hi {0}, this is your {1} screen \nYour current language is : {2}")
	String homeMessage(String user, String tab, String locale);

	@DefaultMessage("Howdy, Admin!")
	String adminGreet();
}
