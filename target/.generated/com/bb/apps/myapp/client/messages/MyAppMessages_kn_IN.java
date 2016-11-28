package com.bb.apps.myapp.client.messages;

public class MyAppMessages_kn_IN implements com.bb.apps.myapp.client.messages.MyAppMessages {
  
  public java.lang.String welcomeUser(java.lang.String arg0) {
    return "ಸ್ವಾಗತ, " + arg0;
  }
  
  public java.lang.String lastLogin(java.util.Date arg0) {
    return "ಕೊನೆಯ ಲಾಗಿನ್ ಸಮಯ: " + com.google.gwt.i18n.client.DateTimeFormat.getMediumDateFormat().format(arg0) + " " + com.google.gwt.i18n.client.DateTimeFormat.getMediumTimeFormat().format(arg0);
  }
  
  public java.lang.String homeMessage(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2) {
    return "ಹೈ, " + arg0 + ", ಇದು ನಿಮ್ಮ " + arg1 + " ಪರದೆ \nನಿಮ್ಮ ಪ್ರಸ್ತುತ ಭಾಷೆ : " + arg2;
  }
  
  public java.lang.String adminGreet() {
    return "ಹೇಗಿದ್ದೀರಿ, ನಿರ್ವಾಹಕ !";
  }
}
