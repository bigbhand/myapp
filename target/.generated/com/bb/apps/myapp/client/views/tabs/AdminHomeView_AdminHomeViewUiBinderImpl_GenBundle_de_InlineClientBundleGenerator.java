package com.bb.apps.myapp.client.views.tabs;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class AdminHomeView_AdminHomeViewUiBinderImpl_GenBundle_de_InlineClientBundleGenerator implements com.bb.apps.myapp.client.views.tabs.AdminHomeView_AdminHomeViewUiBinderImpl_GenBundle {
  private static AdminHomeView_AdminHomeViewUiBinderImpl_GenBundle_de_InlineClientBundleGenerator _instance0 = new AdminHomeView_AdminHomeViewUiBinderImpl_GenBundle_de_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.bb.apps.myapp.client.views.tabs.AdminHomeView_AdminHomeViewUiBinderImpl_GenCss_style() {
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
        return (".GOKTVRVBPIC{font-weight:" + ("bold")  + ";}");
      }
      public java.lang.String important() {
        return "GOKTVRVBPIC";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.bb.apps.myapp.client.views.tabs.AdminHomeView_AdminHomeViewUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.bb.apps.myapp.client.views.tabs.AdminHomeView_AdminHomeViewUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.bb.apps.myapp.client.views.tabs.AdminHomeView_AdminHomeViewUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.bb.apps.myapp.client.views.tabs.AdminHomeView_AdminHomeViewUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
