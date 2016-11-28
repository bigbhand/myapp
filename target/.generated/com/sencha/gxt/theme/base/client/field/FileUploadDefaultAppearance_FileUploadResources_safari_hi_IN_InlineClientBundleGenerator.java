package com.sencha.gxt.theme.base.client.field;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class FileUploadDefaultAppearance_FileUploadResources_safari_hi_IN_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.field.FileUploadDefaultAppearance.FileUploadResources {
  private static FileUploadDefaultAppearance_FileUploadResources_safari_hi_IN_InlineClientBundleGenerator _instance0 = new FileUploadDefaultAppearance_FileUploadResources_safari_hi_IN_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.sencha.gxt.theme.base.client.field.FileUploadDefaultAppearance.FileUploadStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GOKTVRVBHV{height:" + ("22px")  + ";position:" + ("relative")  + ";}.GOKTVRVBGV{z-index:" + ("3")  + ";color:" + ("#777")  + ";}.GOKTVRVBFV{position:" + ("absolute")  + ";left:" + ("0")  + ";z-index:" + ("2")  + ";height:" + ("22px")  + ";top:" + ("0")  + ";cursor:" + ("pointer")  + ";opacity:") + (("0")  + ";}.GOKTVRVBEV{position:" + ("absolute")  + ";left:" + ("0")  + ";z-index:" + ("1")  + ";top:" + ("0")  + ";}")) : ((".GOKTVRVBHV{height:" + ("22px")  + ";position:" + ("relative")  + ";}.GOKTVRVBGV{z-index:" + ("3")  + ";color:" + ("#777")  + ";}.GOKTVRVBFV{position:" + ("absolute")  + ";right:" + ("0")  + ";z-index:" + ("2")  + ";height:" + ("22px")  + ";top:" + ("0")  + ";cursor:" + ("pointer")  + ";opacity:") + (("0")  + ";}.GOKTVRVBEV{position:" + ("absolute")  + ";right:" + ("0")  + ";z-index:" + ("1")  + ";top:" + ("0")  + ";}"));
      }
      public java.lang.String buttonWrap() {
        return "GOKTVRVBEV";
      }
      public java.lang.String file() {
        return "GOKTVRVBFV";
      }
      public java.lang.String input() {
        return "GOKTVRVBGV";
      }
      public java.lang.String wrap() {
        return "GOKTVRVBHV";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.theme.base.client.field.FileUploadDefaultAppearance.FileUploadStyle get() {
      return css;
    }
  }
  public com.sencha.gxt.theme.base.client.field.FileUploadDefaultAppearance.FileUploadStyle css() {
    return cssInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.base.client.field.FileUploadDefaultAppearance.FileUploadStyle css;
  
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
      case 'css': return this.@com.sencha.gxt.theme.base.client.field.FileUploadDefaultAppearance.FileUploadResources::css()();
    }
    return null;
  }-*/;
}
