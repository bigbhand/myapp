package com.sencha.gxt.theme.base.client.listview;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ListViewDefaultAppearance_ListViewDefaultResources_gecko1_8_default_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.listview.ListViewDefaultAppearance.ListViewDefaultResources {
  private static ListViewDefaultAppearance_ListViewDefaultResources_gecko1_8_default_InlineClientBundleGenerator _instance0 = new ListViewDefaultAppearance_ListViewDefaultResources_gecko1_8_default_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.sencha.gxt.theme.base.client.listview.ListViewDefaultAppearance.ListViewDefaultStyle() {
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
        return (".GOKTVRVBLCB{background-color:" + ("white")  + ";border:" + ("1px"+ " " +"solid"+ " " +com.sencha.gxt.core.client.resources.ThemeStyles.get().borderColor())  + ";-moz-outline:" + ("none")  + ";outline:" + ("0"+ " " +"none")  + ";position:" + ("relative")  + ";overflow-y:" + ("auto")  + ";}.GOKTVRVBICB{border:" + ("1px"+ " " +"solid"+ " " +"#fff")  + ";font-family:" + ("tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";font-size:" + ("12px")  + ";font-size-adjust:" + ("none")  + ";font-stretch:") + (("normal")  + ";font-style:" + ("normal")  + ";font-variant:" + ("normal")  + ";font-weight:" + ("normal")  + ";line-height:" + ("normal")  + ";overflow:" + ("hidden")  + ";text-overflow:" + ("ellipsis")  + ";padding:" + ("2px")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("pointer")  + ";}.GOKTVRVBJCB{height:" + ((ListViewDefaultAppearance_ListViewDefaultResources_gecko1_8_default_InlineClientBundleGenerator.this.selectedBackground()).getHeight() + "px") ) + (";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (ListViewDefaultAppearance_ListViewDefaultResources_gecko1_8_default_InlineClientBundleGenerator.this.selectedBackground()).getSafeUri().asString() + "\") -" + (ListViewDefaultAppearance_ListViewDefaultResources_gecko1_8_default_InlineClientBundleGenerator.this.selectedBackground()).getLeft() + "px -" + (ListViewDefaultAppearance_ListViewDefaultResources_gecko1_8_default_InlineClientBundleGenerator.this.selectedBackground()).getTop() + "px  repeat-x")  + ";height:" + ("auto")  + ";border:" + ("1px"+ " " +"dotted"+ " " +"#ddd")  + " !important;cursor:" + ("pointer")  + ";}.GOKTVRVBKCB{background:" + ("none"+ " " +"repeat"+ " " +"scroll"+ " " +"0"+ " " +"50%"+ " " +"#dfe8f6")  + ";border:" + ("1px"+ " " +"dotted"+ " " +"#a3bae9")  + " !important;cursor:" + ("pointer")  + ";}");
      }
      public java.lang.String item() {
        return "GOKTVRVBICB";
      }
      public java.lang.String over() {
        return "GOKTVRVBJCB";
      }
      public java.lang.String sel() {
        return "GOKTVRVBKCB";
      }
      public java.lang.String view() {
        return "GOKTVRVBLCB";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.theme.base.client.listview.ListViewDefaultAppearance.ListViewDefaultStyle get() {
      return css;
    }
  }
  public com.sencha.gxt.theme.base.client.listview.ListViewDefaultAppearance.ListViewDefaultStyle css() {
    return cssInitializer.get();
  }
  private void selectedBackgroundInitializer() {
    selectedBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "selectedBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 29, false, false
    );
  }
  private static class selectedBackgroundInitializer {
    static {
      _instance0.selectedBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return selectedBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource selectedBackground() {
    return selectedBackgroundInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.base.client.listview.ListViewDefaultAppearance.ListViewDefaultStyle css;
  private static final java.lang.String externalImage = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAAdCAYAAABrAQZpAAAAMElEQVR42rXEuQ3AQAwEsem/Wf1SuAe4BzMgdye+dlfMjOhuUVUiM0VECHcXZvZ3D3FMbqHU/WUQAAAAAElFTkSuQmCC";
  private static com.google.gwt.resources.client.ImageResource selectedBackground;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
      selectedBackground(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
        resourceMap.put("selectedBackground", selectedBackground());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.sencha.gxt.theme.base.client.listview.ListViewDefaultAppearance.ListViewDefaultResources::css()();
      case 'selectedBackground': return this.@com.sencha.gxt.theme.base.client.listview.ListViewDefaultAppearance.ListViewDefaultResources::selectedBackground()();
    }
    return null;
  }-*/;
}
