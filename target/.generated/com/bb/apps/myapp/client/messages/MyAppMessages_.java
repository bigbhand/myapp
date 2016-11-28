package com.bb.apps.myapp.client.messages;

public class MyAppMessages_ implements com.bb.apps.myapp.client.messages.MyAppMessages {
  
  public java.lang.String welcomeUser(java.lang.String arg0) {
    return "Welcome, " + arg0;
  }
  
  public java.lang.String lastLogin(java.util.Date arg0) {
    return "Last login : " + com.google.gwt.i18n.client.DateTimeFormat.getMediumDateFormat().format(arg0) + " " + com.google.gwt.i18n.client.DateTimeFormat.getMediumTimeFormat().format(arg0);
  }
  
  public java.lang.String homeMessage(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2) {
    return "Hi " + arg0 + ", this is your " + arg1 + " screen \nYour current language is : " + arg2;
  }
  
  public java.lang.String adminGreet() {
    return "Howdy, Admin!";
  }
}
