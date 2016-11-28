package com.bb.apps.myapp.client.messages;

public class MyAppMessages_de implements com.bb.apps.myapp.client.messages.MyAppMessages {
  
  public java.lang.String welcomeUser(java.lang.String arg0) {
    return "Herzlich willkommen, " + arg0;
  }
  
  public java.lang.String lastLogin(java.util.Date arg0) {
    return "Letzte Anmeldung : " + com.google.gwt.i18n.client.DateTimeFormat.getMediumDateFormat().format(arg0) + " " + com.google.gwt.i18n.client.DateTimeFormat.getMediumTimeFormat().format(arg0);
  }
  
  public java.lang.String homeMessage(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2) {
    return "Hallo " + arg0 + ", ties ist dein " + arg1 + " Bildschirm \nIhre aktuellen sprache : " + arg2;
  }
  
  public java.lang.String adminGreet() {
    return "Howdy, Admin!";
  }
}
