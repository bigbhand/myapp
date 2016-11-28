package com.bb.apps.myapp.client.views.header;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class HeaderView_HeaderViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.bb.apps.myapp.client.views.header.HeaderView_HeaderViewUiBinderImpl_GenBundle {
  private static HeaderView_HeaderViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new HeaderView_HeaderViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.bb.apps.myapp.client.views.header.HeaderView_HeaderViewUiBinderImpl_GenCss_style() {
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
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GOKTVRVBNIC{float:" + ("left")  + ";}.GOKTVRVBOIC{padding-right:" + ("30px")  + ";}")) : ((".GOKTVRVBNIC{float:" + ("right")  + ";}.GOKTVRVBOIC{padding-left:" + ("30px")  + ";}"));
      }
      public java.lang.String flatRight() {
        return "GOKTVRVBNIC";
      }
      public java.lang.String flatRightEnd() {
        return "GOKTVRVBOIC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.bb.apps.myapp.client.views.header.HeaderView_HeaderViewUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.bb.apps.myapp.client.views.header.HeaderView_HeaderViewUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.bb.apps.myapp.client.views.header.HeaderView_HeaderViewUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.bb.apps.myapp.client.views.header.HeaderView_HeaderViewUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
