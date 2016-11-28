package com.sencha.gxt.core.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator implements com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultResources {
  private static CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator _instance0 = new CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator();
  private void shimInitializer() {
    shim = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "shim",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 1, 1, false, false
    );
  }
  private static class shimInitializer {
    static {
      _instance0.shimInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return shim;
    }
  }
  public com.google.gwt.resources.client.ImageResource shim() {
    return shimInitializer.get();
  }
  private void stylesInitializer() {
    styles = new com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultStyles() {
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
        return "styles";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GOKTVRVBGL,.GOKTVRVBGL:focus{outline:" + ("none")  + ";}.GOKTVRVBJL{position:" + ("absolute")  + " !important;right:" + ("0")  + ";top:" + ("0")  + ";}.GOKTVRVBBL{display:" + ("none")  + " !important;}.GOKTVRVBCL{position:" + ("absolute")  + " !important;right:" + ("-10000px")  + " !important;top:" + ("-10000px")  + " !important;visibility:" + ("hidden")  + " !important;}.GOKTVRVBDL{visibility:" + ("hidden")  + " !important;}.GOKTVRVBML,.GOKTVRVBML *{-moz-user-select:") + (("none")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("none")  + ";}.GOKTVRVBNL{-moz-user-select:" + ("-moz-none")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("none")  + ";}.x-clear{clear:" + ("both")  + ";overflow:" + ("hidden")  + ";line-height:" + ("0")  + ";font-size:" + ("0")  + ";}.GOKTVRVBPK{float:" + ("right") ) + (";}.GOKTVRVBAL{float:" + ("left")  + ";}.GOKTVRVBNK{cursor:" + ("w-resize")  + ";cursor:" + ("col-resize")  + ";}.GOKTVRVBOK{cursor:" + ("n-resize")  + ";cursor:" + ("row-resize")  + ";}.GOKTVRVBFL{position:" + ("relative")  + ";display:" + ("inline-block")  + ";}.GOKTVRVBIL{white-space:" + ("nowrap")  + ";}.GOKTVRVBLL{height:" + ((CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getHeight() + "px")  + ";width:" + ((CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getWidth() + "px")  + ";overflow:") + (("hidden")  + ";background:" + ("url(\"" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getSafeUri().asString() + "\") -" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getLeft() + "px -" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getTop() + "px  no-repeat")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";display:" + ("none")  + ";position:" + ("absolute")  + ";right:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("20000")  + ";}")) : ((".GOKTVRVBGL,.GOKTVRVBGL:focus{outline:" + ("none")  + ";}.GOKTVRVBJL{position:" + ("absolute")  + " !important;left:" + ("0")  + ";top:" + ("0")  + ";}.GOKTVRVBBL{display:" + ("none")  + " !important;}.GOKTVRVBCL{position:" + ("absolute")  + " !important;left:" + ("-10000px")  + " !important;top:" + ("-10000px")  + " !important;visibility:" + ("hidden")  + " !important;}.GOKTVRVBDL{visibility:" + ("hidden")  + " !important;}.GOKTVRVBML,.GOKTVRVBML *{-moz-user-select:") + (("none")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("none")  + ";}.GOKTVRVBNL{-moz-user-select:" + ("-moz-none")  + ";-khtml-user-select:" + ("none")  + ";-webkit-user-select:" + ("none")  + ";}.x-clear{clear:" + ("both")  + ";overflow:" + ("hidden")  + ";line-height:" + ("0")  + ";font-size:" + ("0")  + ";}.GOKTVRVBPK{float:" + ("left") ) + (";}.GOKTVRVBAL{float:" + ("right")  + ";}.GOKTVRVBNK{cursor:" + ("e-resize")  + ";cursor:" + ("col-resize")  + ";}.GOKTVRVBOK{cursor:" + ("n-resize")  + ";cursor:" + ("row-resize")  + ";}.GOKTVRVBFL{position:" + ("relative")  + ";display:" + ("inline-block")  + ";}.GOKTVRVBIL{white-space:" + ("nowrap")  + ";}.GOKTVRVBLL{height:" + ((CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getHeight() + "px")  + ";width:" + ((CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getWidth() + "px")  + ";overflow:") + (("hidden")  + ";background:" + ("url(\"" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getSafeUri().asString() + "\") -" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getLeft() + "px -" + (CommonStyles_CommonStylesDefaultAppearance_CommonDefaultResources_safari_default_InlineClientBundleGenerator.this.shim()).getTop() + "px  no-repeat")  + ";width:" + ("100%")  + ";height:" + ("100%")  + ";display:" + ("none")  + ";position:" + ("absolute")  + ";left:" + ("0")  + ";top:" + ("0")  + ";z-index:" + ("20000")  + ";}"));
      }
      public java.lang.String clear() {
        return "x-clear";
      }
      public java.lang.String columnResize() {
        return "GOKTVRVBNK";
      }
      public java.lang.String columnRowResize() {
        return "GOKTVRVBOK";
      }
      public java.lang.String floatLeft() {
        return "GOKTVRVBPK";
      }
      public java.lang.String floatRight() {
        return "GOKTVRVBAL";
      }
      public java.lang.String hideDisplay() {
        return "GOKTVRVBBL";
      }
      public java.lang.String hideOffsets() {
        return "GOKTVRVBCL";
      }
      public java.lang.String hideVisibility() {
        return "GOKTVRVBDL";
      }
      public java.lang.String ignore() {
        return "GOKTVRVBEL";
      }
      public java.lang.String inlineBlock() {
        return "GOKTVRVBFL";
      }
      public java.lang.String noFocusOutline() {
        return "GOKTVRVBGL";
      }
      public java.lang.String nodrag() {
        return "GOKTVRVBHL";
      }
      public java.lang.String nowrap() {
        return "GOKTVRVBIL";
      }
      public java.lang.String positionable() {
        return "GOKTVRVBJL";
      }
      public java.lang.String repaint() {
        return "GOKTVRVBKL";
      }
      public java.lang.String shim() {
        return "GOKTVRVBLL";
      }
      public java.lang.String unselectable() {
        return "GOKTVRVBML";
      }
      public java.lang.String unselectableSingle() {
        return "GOKTVRVBNL";
      }
    }
    ;
  }
  private static class stylesInitializer {
    static {
      _instance0.stylesInitializer();
    }
    static com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultStyles get() {
      return styles;
    }
  }
  public com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultStyles styles() {
    return stylesInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/gif;base64,R0lGODlhAQABAID/AMDAwAAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw==";
  private static com.google.gwt.resources.client.ImageResource shim;
  private static com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultStyles styles;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      shim(), 
      styles(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("shim", shim());
        resourceMap.put("styles", styles());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'shim': return this.@com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultResources::shim()();
      case 'styles': return this.@com.sencha.gxt.core.client.resources.CommonStyles.CommonStylesDefaultAppearance.CommonDefaultResources::styles()();
    }
    return null;
  }-*/;
}
