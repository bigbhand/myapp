package com.bb.apps.myapp.client.messages;

public class MyAppMessages_hi_IN implements com.bb.apps.myapp.client.messages.MyAppMessages {
  
  public java.lang.String welcomeUser(java.lang.String arg0) {
    return "स्वागत हे, " + arg0;
  }
  
  public java.lang.String lastLogin(java.util.Date arg0) {
    return "अंतिम लॉगइन समय : " + com.google.gwt.i18n.client.DateTimeFormat.getMediumDateFormat().format(arg0) + " " + com.google.gwt.i18n.client.DateTimeFormat.getMediumTimeFormat().format(arg0);
  }
  
  public java.lang.String homeMessage(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2) {
    return "नमस्ते " + arg0 + ", ये है आपका है " + arg1 + " स्क्रीन \nआपके चयनित भाषा : " + arg2;
  }
  
  public java.lang.String adminGreet() {
    return "कैसे हो, प्रशासक !";
  }
}
