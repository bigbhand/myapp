package com.sencha.gxt.theme.blue.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class BlueThemeAppearance_Bundle_safari_hi_IN_InlineClientBundleGenerator implements com.sencha.gxt.theme.blue.client.BlueThemeAppearance.Bundle {
  private static BlueThemeAppearance_Bundle_safari_hi_IN_InlineClientBundleGenerator _instance0 = new BlueThemeAppearance_Bundle_safari_hi_IN_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.sencha.gxt.theme.blue.client.BlueThemeAppearance.BlueStyles() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "css";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((":focus{outline:" + ("none")  + " !important;}.GOKTVRVBEQB{border:" + ("1px"+ " " +"solid"+ " " +"#99bbe8")  + " !important;}.GOKTVRVBIQB{border:" + ("none")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#99bbe8")  + " !important;}.GOKTVRVBJQB{border:" + ("none")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#99bbe8")  + " !important;}.GOKTVRVBKQB{border:" + ("none")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#99bbe8")  + " !important;}.GOKTVRVBFQB{border:" + ("none")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#99bbe8")  + " !important;}.GOKTVRVBLQB{color:") + (("gray")  + " !important;cursor:" + ("default")  + " !important;opacity:" + ("0.6")  + ";}.GOKTVRVBLQB *{cursor:" + ("default")  + " !important;}")) : ((":focus{outline:" + ("none")  + " !important;}.GOKTVRVBEQB{border:" + ("1px"+ " " +"solid"+ " " +"#99bbe8")  + " !important;}.GOKTVRVBIQB{border:" + ("none")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#99bbe8")  + " !important;}.GOKTVRVBJQB{border:" + ("none")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#99bbe8")  + " !important;}.GOKTVRVBKQB{border:" + ("none")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#99bbe8")  + " !important;}.GOKTVRVBFQB{border:" + ("none")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#99bbe8")  + " !important;}.GOKTVRVBLQB{color:") + (("gray")  + " !important;cursor:" + ("default")  + " !important;opacity:" + ("0.6")  + ";}.GOKTVRVBLQB *{cursor:" + ("default")  + " !important;}"));
      }
      public java.lang.String backgroundColorLight() {
        return "#e0e8f8";
      }
      public java.lang.String border() {
        return "GOKTVRVBEQB";
      }
      public java.lang.String borderBottom() {
        return "GOKTVRVBFQB";
      }
      public java.lang.String borderColor() {
        return "#99bbe8";
      }
      public java.lang.String borderColorLight() {
        return "orange";
      }
      public java.lang.String borderLeft() {
        return "GOKTVRVBIQB";
      }
      public java.lang.String borderRight() {
        return "GOKTVRVBJQB";
      }
      public java.lang.String borderTop() {
        return "GOKTVRVBKQB";
      }
      public java.lang.String disabled() {
        return "GOKTVRVBLQB";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.theme.blue.client.BlueThemeAppearance.BlueStyles get() {
      return css;
    }
  }
  public com.sencha.gxt.theme.blue.client.BlueThemeAppearance.BlueStyles css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.blue.client.BlueThemeAppearance.BlueStyles css;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.sencha.gxt.theme.blue.client.BlueThemeAppearance.Bundle::css()();
    }
    return null;
  }-*/;
}
