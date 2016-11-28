package com.bb.apps.myapp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class IMyAppResources_default_InlineClientBundleGenerator implements com.bb.apps.myapp.client.IMyAppResources {
  private static IMyAppResources_default_InlineClientBundleGenerator _instance0 = new IMyAppResources_default_InlineClientBundleGenerator();
  private void appLogoInitializer() {
    appLogo = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "appLogo",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 90, 85, false, false
    );
  }
  private static class appLogoInitializer {
    static {
      _instance0.appLogoInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return appLogo;
    }
  }
  public com.google.gwt.resources.client.ImageResource appLogo() {
    return appLogoInitializer.get();
  }
  private void appNameInitializer() {
    appName = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "appName",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 250, 40, false, false
    );
  }
  private static class appNameInitializer {
    static {
      _instance0.appNameInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return appName;
    }
  }
  public com.google.gwt.resources.client.ImageResource appName() {
    return appNameInitializer.get();
  }
  private void themeHeaderInitializer() {
    themeHeader = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "themeHeader",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 200, 64, false, false
    );
  }
  private static class themeHeaderInitializer {
    static {
      _instance0.themeHeaderInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return themeHeader;
    }
  }
  public com.google.gwt.resources.client.ImageResource themeHeader() {
    return themeHeaderInitializer.get();
  }
  private void myAppStylesInitializer() {
    myAppStyles = new com.bb.apps.myapp.client.IMyAppResources.MyAppCssStyles() {
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
        return "myAppStyles";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GOKTVRVBO{height:" + ("1000px")  + ";padding-top:" + ("20px")  + ";background:" + ("#d8e0de")  + ";background:" + ("-moz-linear-gradient(" + "top"+ ","+ " " +"rgba(" + "14"+ ","+ " " +"14"+ ","+ " " +"14"+ ","+ " " +"1" + ")"+ " " +"0"+ ","+ " " +"rgba(" + "66"+ ","+ " " +"71"+ ","+ " " +"79"+ ","+ " " +"1" + ")"+ " " +"22%"+ ","+ " " +"rgba(" + "78"+ ","+ " " +"92"+ ","+ " " +"90"+ ","+ " " +"1" + ")"+ " " +"33%"+ ","+ " " +"rgba(" + "95"+ ","+ " " +"108"+ ","+ " " +"106"+ ","+ " " +"1" + ")"+ " " +"50%"+ ","+ " " +"rgba(" + "122"+ ","+ " " +"133"+ ","+ " " +"148"+ ","+ " " +"1" + ")"+ " " +"67%"+ ","+ " " +"rgba(" + "142"+ ","+ " " +"166"+ ","+ " " +"162"+ ","+ " " +"1" + ")"+ " " +"82%"+ ","+ " " +"rgba(" + "142"+ ","+ " " +"166"+ ","+ " " +"162"+ ","+ " " +"1" + ")"+ " " +"100%" + ")")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +"rgba(" + "14"+ ","+ " " +"14"+ ","+ " " +"14"+ ","+ " " +"1" + ")"+ " " +"0"+ ","+ " " +"rgba(" + "66"+ ","+ " " +"71"+ ","+ " " +"79"+ ","+ " " +"1" + ")"+ " " +"22%"+ ","+ " " +"rgba(" + "78"+ ","+ " " +"92"+ ","+ " " +"90"+ ","+ " " +"1" + ")"+ " " +"33%"+ ","+ " " +"rgba(" + "95"+ ","+ " " +"108"+ ","+ " " +"106"+ ","+ " " +"1" + ")"+ " " +"50%"+ ","+ " " +"rgba(" + "122"+ ","+ " " +"133"+ ","+ " " +"148"+ ","+ " " +"1" + ")"+ " " +"67%"+ ","+ " " +"rgba(" + "142"+ ","+ " " +"166"+ ","+ " " +"162"+ ","+ " " +"1" + ")"+ " " +"82%"+ ","+ " " +"rgba(" + "142"+ ","+ " " +"166"+ ","+ " " +"162"+ ","+ " " +"1" + ")"+ " " +"100%" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +"rgba(" + "14"+ ","+ " " +"14"+ ","+ " " +"14"+ ","+ " " +"1" + ")"+ " " +"0"+ ","+ " " +"rgba(" + "66"+ ","+ " " +"71"+ ","+ " " +"79"+ ","+ " " +"1" + ")"+ " " +"22%"+ ","+ " " +"rgba(" + "78"+ ","+ " " +"92"+ ","+ " " +"90"+ ","+ " " +"1" + ")"+ " " +"33%"+ ","+ " " +"rgba(" + "95"+ ","+ " " +"108"+ ","+ " " +"106"+ ","+ " " +"1" + ")"+ " " +"50%"+ ","+ " " +"rgba(" + "122"+ ","+ " " +"133"+ ","+ " " +"148"+ ","+ " " +"1" + ")"+ " " +"67%"+ ","+ " " +"rgba(" + "122"+ ","+ " " +"133"+ ","+ " " +"148"+ ","+ " " +"1" + ")"+ " " +"82%"+ ","+ " " +"rgba(" + "142"+ ","+ " " +"166"+ ","+ " " +"162"+ ","+ " " +"1" + ")"+ " " +"100%" + ")")  + ";filter:" + ("progid")  + ";}.GOKTVRVBA{margin:" + ("auto"+ " " +"auto")  + ";max-width:" + ("1120px")  + ";overflow:" + ("hidden")  + ";}.GOKTVRVBAB{background-color:") + (("#e8e8e8")  + ";padding:" + ("20px"+ " " +"20px")  + ";}.GOKTVRVBN{width:" + ("auto")  + ";margin-top:" + ("20px")  + ";color:" + ("#d1d1d1")  + ";border-bottom:" + ("solid"+ " " +"1px"+ " " +"#b96d01")  + ";margin-bottom:" + ("10px")  + ";padding-left:" + ("20px")  + ";font-size:" + ("24px")  + ";display:" + ("inline-block")  + ";}.GOKTVRVBP{font-size:" + ("18px") ) + (";color:" + ("#cccdcf")  + ";margin-bottom:" + ("8px")  + ";margin-top:" + ("5px")  + ";}.GOKTVRVBG{font-size:" + ("12px")  + ";color:" + ("#aeb0b4")  + ";cursor:" + ("pointer")  + ";text-decoration:" + ("none")  + ";margin-bottom:" + ("8px")  + ";margin-right:" + ("6px")  + ";}.GOKTVRVBG a{color:" + ("#aeb0b4")  + ";}.GOKTVRVBG:HOVER{text-decoration:") + (("underline")  + ";}.GOKTVRVBH{font-size:" + ("12px")  + ";color:" + ("#aeb0b4")  + ";margin-right:" + ("6px")  + ";text-decoration:" + ("none")  + ";}.GOKTVRVBK{width:" + ("150px")  + ";text-align:" + ("center")  + ";padding:" + ("7px"+ " " +"10px")  + ";cursor:" + ("pointer")  + ";color:" + ("#111")  + ";padding-left:" + ("0") ) + (";background:" + ("#fff")  + ";background:" + ("-moz-linear-gradient(" + "top"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")")  + ";filter:" + ("progid")  + ";}.GOKTVRVBK>div{border-left:" + ("solid"+ " " +"1px"+ " " +"#a1a1a1")  + ";font-size:" + ("17px")  + ";}.GOKTVRVBK:HOVER{cursor:" + ("pointer")  + ";background:" + ("#000")  + ";background:" + ("-webkit-linear-gradient(" + "#413b3f"+ ","+ " " +"#000" + ")")  + ";background:") + (("-o-linear-gradient(" + "#413b3f"+ ","+ " " +"#000" + ")")  + ";background:" + ("-moz-linear-gradient(" + "#413b3f"+ ","+ " " +"#000" + ")")  + ";background:" + ("linear-gradient(" + "#413b3f"+ ","+ " " +"#000" + ")")  + ";color:" + ("white")  + ";}.GOKTVRVBK:HOVER>div{border-left:" + ("solid"+ " " +"0"+ " " +"#a1a1a1")  + ";}.GOKTVRVBL{width:" + ("150px")  + ";text-align:" + ("center")  + ";padding:" + ("7px"+ " " +"10px")  + ";cursor:" + ("pointer")  + ";padding-left:" + ("0")  + ";cursor:" + ("pointer") ) + (";color:" + ("white")  + ";background:" + ("#c07b1a")  + ";background:" + ("-moz-linear-gradient(" + "top"+ ","+ " " +"#e58d05"+ " " +"0"+ ","+ " " +"#e58d05"+ " " +"50%"+ ","+ " " +"#b96d01"+ " " +"51%"+ ","+ " " +"#c07b1a"+ " " +"100%" + ")")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +"#e58d05"+ " " +"0"+ ","+ " " +"#e58d05"+ " " +"50%"+ ","+ " " +"#b96d01"+ " " +"51%"+ ","+ " " +"#c07b1a"+ " " +"100%" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +"#e58d05"+ " " +"0"+ ","+ " " +"#e58d05"+ " " +"50%"+ ","+ " " +"#b96d01"+ " " +"51%"+ ","+ " " +"#c07b1a"+ " " +"100%" + ")")  + ";filter:" + ("progid")  + ";}.GOKTVRVBL>div{border-left:" + ("solid"+ " " +"1px"+ " " +"#a1a1a1")  + ";font-size:" + ("17px")  + ";}.GOKTVRVBB{width:" + ("400px")  + ";padding-left:" + ("50px")  + ";}.GOKTVRVBD{width:") + (("auto")  + ";margin-top:" + ("20px")  + ";color:" + ("#d1d1d1")  + ";border-bottom:" + ("solid"+ " " +"1px"+ " " +"#b96d01")  + ";margin-bottom:" + ("10px")  + ";padding-left:" + ("20px")  + ";font-size:" + ("18px")  + ";display:" + ("inline-block")  + ";}.GOKTVRVBE{font-size:" + ("14px")  + ";color:" + ("#cccdd0")  + ";cursor:" + ("pointer") ) + (";text-decoration:" + ("none")  + ";margin-bottom:" + ("4px")  + ";margin-right:" + ("0")  + ";padding-bottom:" + ("2px")  + ";border-bottom:" + ("solid"+ " " +"1px"+ " " +"#a1a1a1")  + ";}.GOKTVRVBE a{margin-right:" + ("0")  + ";color:" + ("#cccdd0")  + ";transition:" + ("all"+ " " +"0.5s"+ " " +"ease-in-out")  + ";}.GOKTVRVBE:HOVER a{margin-right:" + ("15px")  + ";transition:" + ("all"+ " " +"0.5s"+ " " +"ease-in-out")  + ";}.GOKTVRVBC{font-size:") + (("14px")  + ";color:" + ("#cccdd0")  + ";text-decoration:" + ("none")  + ";margin-bottom:" + ("4px")  + ";margin-right:" + ("0")  + ";line-height:" + ("1.4")  + ";}.GOKTVRVBF{font-size:" + ("14px")  + ";color:" + ("#cccdd0")  + ";text-decoration:" + ("none")  + ";margin-bottom:" + ("4px")  + ";margin-right:" + ("0") ) + (";float:" + ("right")  + ";}.GOKTVRVBI{width:" + ("250px")  + ";height:" + ("200px")  + ";text-align:" + ("right")  + ";padding:" + ("7px"+ " " +"10px")  + ";margin:" + ("auto"+ " " +"auto")  + ";border:" + ("solid"+ " " +"1px"+ " " +"#0e0e0e")  + ";border-radius:" + ("5px")  + ";margin-top:" + ("20%")  + ";background:" + ("#fff")  + ";background:") + (("-moz-linear-gradient(" + "top"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")")  + ";filter:" + ("progid")  + ";}.GOKTVRVBJ{font-size:" + ("18px")  + ";font-family:" + ("sans-serif")  + ";}.GOKTVRVBM{padding-left:" + ("0")  + ";background:" + ("#fff")  + ";background:" + ("-moz-linear-gradient(" + "top"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")") ) + (";filter:" + ("progid")  + ";}")) : ((".GOKTVRVBO{height:" + ("1000px")  + ";padding-top:" + ("20px")  + ";background:" + ("#d8e0de")  + ";background:" + ("-moz-linear-gradient(" + "top"+ ","+ " " +"rgba(" + "14"+ ","+ " " +"14"+ ","+ " " +"14"+ ","+ " " +"1" + ")"+ " " +"0"+ ","+ " " +"rgba(" + "66"+ ","+ " " +"71"+ ","+ " " +"79"+ ","+ " " +"1" + ")"+ " " +"22%"+ ","+ " " +"rgba(" + "78"+ ","+ " " +"92"+ ","+ " " +"90"+ ","+ " " +"1" + ")"+ " " +"33%"+ ","+ " " +"rgba(" + "95"+ ","+ " " +"108"+ ","+ " " +"106"+ ","+ " " +"1" + ")"+ " " +"50%"+ ","+ " " +"rgba(" + "122"+ ","+ " " +"133"+ ","+ " " +"148"+ ","+ " " +"1" + ")"+ " " +"67%"+ ","+ " " +"rgba(" + "142"+ ","+ " " +"166"+ ","+ " " +"162"+ ","+ " " +"1" + ")"+ " " +"82%"+ ","+ " " +"rgba(" + "142"+ ","+ " " +"166"+ ","+ " " +"162"+ ","+ " " +"1" + ")"+ " " +"100%" + ")")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +"rgba(" + "14"+ ","+ " " +"14"+ ","+ " " +"14"+ ","+ " " +"1" + ")"+ " " +"0"+ ","+ " " +"rgba(" + "66"+ ","+ " " +"71"+ ","+ " " +"79"+ ","+ " " +"1" + ")"+ " " +"22%"+ ","+ " " +"rgba(" + "78"+ ","+ " " +"92"+ ","+ " " +"90"+ ","+ " " +"1" + ")"+ " " +"33%"+ ","+ " " +"rgba(" + "95"+ ","+ " " +"108"+ ","+ " " +"106"+ ","+ " " +"1" + ")"+ " " +"50%"+ ","+ " " +"rgba(" + "122"+ ","+ " " +"133"+ ","+ " " +"148"+ ","+ " " +"1" + ")"+ " " +"67%"+ ","+ " " +"rgba(" + "142"+ ","+ " " +"166"+ ","+ " " +"162"+ ","+ " " +"1" + ")"+ " " +"82%"+ ","+ " " +"rgba(" + "142"+ ","+ " " +"166"+ ","+ " " +"162"+ ","+ " " +"1" + ")"+ " " +"100%" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +"rgba(" + "14"+ ","+ " " +"14"+ ","+ " " +"14"+ ","+ " " +"1" + ")"+ " " +"0"+ ","+ " " +"rgba(" + "66"+ ","+ " " +"71"+ ","+ " " +"79"+ ","+ " " +"1" + ")"+ " " +"22%"+ ","+ " " +"rgba(" + "78"+ ","+ " " +"92"+ ","+ " " +"90"+ ","+ " " +"1" + ")"+ " " +"33%"+ ","+ " " +"rgba(" + "95"+ ","+ " " +"108"+ ","+ " " +"106"+ ","+ " " +"1" + ")"+ " " +"50%"+ ","+ " " +"rgba(" + "122"+ ","+ " " +"133"+ ","+ " " +"148"+ ","+ " " +"1" + ")"+ " " +"67%"+ ","+ " " +"rgba(" + "122"+ ","+ " " +"133"+ ","+ " " +"148"+ ","+ " " +"1" + ")"+ " " +"82%"+ ","+ " " +"rgba(" + "142"+ ","+ " " +"166"+ ","+ " " +"162"+ ","+ " " +"1" + ")"+ " " +"100%" + ")")  + ";filter:" + ("progid")  + ";}.GOKTVRVBA{margin:" + ("auto"+ " " +"auto")  + ";max-width:" + ("1120px")  + ";overflow:" + ("hidden")  + ";}.GOKTVRVBAB{background-color:") + (("#e8e8e8")  + ";padding:" + ("20px"+ " " +"20px")  + ";}.GOKTVRVBN{width:" + ("auto")  + ";margin-top:" + ("20px")  + ";color:" + ("#d1d1d1")  + ";border-bottom:" + ("solid"+ " " +"1px"+ " " +"#b96d01")  + ";margin-bottom:" + ("10px")  + ";padding-right:" + ("20px")  + ";font-size:" + ("24px")  + ";display:" + ("inline-block")  + ";}.GOKTVRVBP{font-size:" + ("18px") ) + (";color:" + ("#cccdcf")  + ";margin-bottom:" + ("8px")  + ";margin-top:" + ("5px")  + ";}.GOKTVRVBG{font-size:" + ("12px")  + ";color:" + ("#aeb0b4")  + ";cursor:" + ("pointer")  + ";text-decoration:" + ("none")  + ";margin-bottom:" + ("8px")  + ";margin-left:" + ("6px")  + ";}.GOKTVRVBG a{color:" + ("#aeb0b4")  + ";}.GOKTVRVBG:HOVER{text-decoration:") + (("underline")  + ";}.GOKTVRVBH{font-size:" + ("12px")  + ";color:" + ("#aeb0b4")  + ";margin-left:" + ("6px")  + ";text-decoration:" + ("none")  + ";}.GOKTVRVBK{width:" + ("150px")  + ";text-align:" + ("center")  + ";padding:" + ("7px"+ " " +"10px")  + ";cursor:" + ("pointer")  + ";color:" + ("#111")  + ";padding-right:" + ("0") ) + (";background:" + ("#fff")  + ";background:" + ("-moz-linear-gradient(" + "top"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")")  + ";filter:" + ("progid")  + ";}.GOKTVRVBK>div{border-right:" + ("solid"+ " " +"1px"+ " " +"#a1a1a1")  + ";font-size:" + ("17px")  + ";}.GOKTVRVBK:HOVER{cursor:" + ("pointer")  + ";background:" + ("#000")  + ";background:" + ("-webkit-linear-gradient(" + "#413b3f"+ ","+ " " +"#000" + ")")  + ";background:") + (("-o-linear-gradient(" + "#413b3f"+ ","+ " " +"#000" + ")")  + ";background:" + ("-moz-linear-gradient(" + "#413b3f"+ ","+ " " +"#000" + ")")  + ";background:" + ("linear-gradient(" + "#413b3f"+ ","+ " " +"#000" + ")")  + ";color:" + ("white")  + ";}.GOKTVRVBK:HOVER>div{border-right:" + ("solid"+ " " +"0"+ " " +"#a1a1a1")  + ";}.GOKTVRVBL{width:" + ("150px")  + ";text-align:" + ("center")  + ";padding:" + ("7px"+ " " +"10px")  + ";cursor:" + ("pointer")  + ";padding-right:" + ("0")  + ";cursor:" + ("pointer") ) + (";color:" + ("white")  + ";background:" + ("#c07b1a")  + ";background:" + ("-moz-linear-gradient(" + "top"+ ","+ " " +"#e58d05"+ " " +"0"+ ","+ " " +"#e58d05"+ " " +"50%"+ ","+ " " +"#b96d01"+ " " +"51%"+ ","+ " " +"#c07b1a"+ " " +"100%" + ")")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +"#e58d05"+ " " +"0"+ ","+ " " +"#e58d05"+ " " +"50%"+ ","+ " " +"#b96d01"+ " " +"51%"+ ","+ " " +"#c07b1a"+ " " +"100%" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +"#e58d05"+ " " +"0"+ ","+ " " +"#e58d05"+ " " +"50%"+ ","+ " " +"#b96d01"+ " " +"51%"+ ","+ " " +"#c07b1a"+ " " +"100%" + ")")  + ";filter:" + ("progid")  + ";}.GOKTVRVBL>div{border-right:" + ("solid"+ " " +"1px"+ " " +"#a1a1a1")  + ";font-size:" + ("17px")  + ";}.GOKTVRVBB{width:" + ("400px")  + ";padding-right:" + ("50px")  + ";}.GOKTVRVBD{width:") + (("auto")  + ";margin-top:" + ("20px")  + ";color:" + ("#d1d1d1")  + ";border-bottom:" + ("solid"+ " " +"1px"+ " " +"#b96d01")  + ";margin-bottom:" + ("10px")  + ";padding-right:" + ("20px")  + ";font-size:" + ("18px")  + ";display:" + ("inline-block")  + ";}.GOKTVRVBE{font-size:" + ("14px")  + ";color:" + ("#cccdd0")  + ";cursor:" + ("pointer") ) + (";text-decoration:" + ("none")  + ";margin-bottom:" + ("4px")  + ";margin-left:" + ("0")  + ";padding-bottom:" + ("2px")  + ";border-bottom:" + ("solid"+ " " +"1px"+ " " +"#a1a1a1")  + ";}.GOKTVRVBE a{margin-left:" + ("0")  + ";color:" + ("#cccdd0")  + ";transition:" + ("all"+ " " +"0.5s"+ " " +"ease-in-out")  + ";}.GOKTVRVBE:HOVER a{margin-left:" + ("15px")  + ";transition:" + ("all"+ " " +"0.5s"+ " " +"ease-in-out")  + ";}.GOKTVRVBC{font-size:") + (("14px")  + ";color:" + ("#cccdd0")  + ";text-decoration:" + ("none")  + ";margin-bottom:" + ("4px")  + ";margin-left:" + ("0")  + ";line-height:" + ("1.4")  + ";}.GOKTVRVBF{font-size:" + ("14px")  + ";color:" + ("#cccdd0")  + ";text-decoration:" + ("none")  + ";margin-bottom:" + ("4px")  + ";margin-left:" + ("0") ) + (";float:" + ("left")  + ";}.GOKTVRVBI{width:" + ("250px")  + ";height:" + ("200px")  + ";text-align:" + ("left")  + ";padding:" + ("7px"+ " " +"10px")  + ";margin:" + ("auto"+ " " +"auto")  + ";border:" + ("solid"+ " " +"1px"+ " " +"#0e0e0e")  + ";border-radius:" + ("5px")  + ";margin-top:" + ("20%")  + ";background:" + ("#fff")  + ";background:") + (("-moz-linear-gradient(" + "top"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")")  + ";filter:" + ("progid")  + ";}.GOKTVRVBJ{font-size:" + ("18px")  + ";font-family:" + ("sans-serif")  + ";}.GOKTVRVBM{padding-right:" + ("0")  + ";background:" + ("#fff")  + ";background:" + ("-moz-linear-gradient(" + "top"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")")  + ";background:" + ("-webkit-linear-gradient(" + "top"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")")  + ";background:" + ("linear-gradient(" + "to"+ " " +"bottom"+ ","+ " " +"#fff"+ " " +"0"+ ","+ " " +"#f1f1f1"+ " " +"50%"+ ","+ " " +"#e1e1e1"+ " " +"51%"+ ","+ " " +"#f6f6f6"+ " " +"100%" + ")") ) + (";filter:" + ("progid")  + ";}"));
      }
      public java.lang.String centerBodyAlign() {
        return "GOKTVRVBA";
      }
      public java.lang.String footerBox() {
        return "GOKTVRVBB";
      }
      public java.lang.String footerContet() {
        return "GOKTVRVBC";
      }
      public java.lang.String footerHeaader() {
        return "GOKTVRVBD";
      }
      public java.lang.String footerLink() {
        return "GOKTVRVBE";
      }
      public java.lang.String footerText() {
        return "GOKTVRVBF";
      }
      public java.lang.String headerLinkStyle() {
        return "GOKTVRVBG";
      }
      public java.lang.String headerTextStyle() {
        return "GOKTVRVBH";
      }
      public java.lang.String loginBackground() {
        return "GOKTVRVBI";
      }
      public java.lang.String loginHeader() {
        return "GOKTVRVBJ";
      }
      public java.lang.String navBarItem() {
        return "GOKTVRVBK";
      }
      public java.lang.String navBarItemActive() {
        return "GOKTVRVBL";
      }
      public java.lang.String navBarPanel() {
        return "GOKTVRVBM";
      }
      public java.lang.String selectedTabTextStyle() {
        return "GOKTVRVBN";
      }
      public java.lang.String themeBackground() {
        return "GOKTVRVBO";
      }
      public java.lang.String welcomeNote() {
        return "GOKTVRVBP";
      }
      public java.lang.String whiteCanvas() {
        return "GOKTVRVBAB";
      }
    }
    ;
  }
  private static class myAppStylesInitializer {
    static {
      _instance0.myAppStylesInitializer();
    }
    static com.bb.apps.myapp.client.IMyAppResources.MyAppCssStyles get() {
      return myAppStyles;
    }
  }
  public com.bb.apps.myapp.client.IMyAppResources.MyAppCssStyles myAppStyles() {
    return myAppStylesInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,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";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAPoAAAAoCAYAAADXGucZAAAFWklEQVR42u1b23XbMAzNCl0hK3QFr+AVskJW8Apdwd/5san2p79eQStkhdakRAkAAZKSZUV27j1Hp6ljiXhdEACVlxcAAAAAAACGk3NvJ9c4f52dO2xJNi9PlO10+vOz9PmacM69+ovZ8irLVm0p7XY+/35X42HjOgCznd+01+tfvGTwfm0S8sE2yLUrfb6aza4kOTfNp1zb/z/K5WXcXlIf7RZkVJLk1nUA5gXsnjo+XEamB9F7mzXN0Vr74YiuyAiiPyPRSdAO13Wn2jrRIdMyRO/I7N5A9CeGL9EpuSnppfOTsrW/YmA41/zyQRH+tcrB/h7/88fH3x/+52K/aO7o7o0871XVjT7/qltOJy8z6/v7/pSuGZ9JWx2vb9SJfSesra/nq6hor7iONWeosZv/7Baie9/TZ5SILm07+F3RV4uVzhfdPdF3Qa+K+QH1P7OhEQdAdMLgcHegZXwuk8vdIAkcJVEkazl3Se9zFxm0c0p3SyZ7jdz3x1aGEqDmO9KGfTBfMrIdij7S7hdEnUx0sXZOh5AQ/aZg6CC/L22kyR7iTnmmFoNeT1uH/AaFIRwZwGmf5YgeHRIzvDXUS5wcHBsC90Cd7LP0LUSXZIw7LtWLBhCrasaEl+gSAqyfRvOgdJduV+kCLEcSQdK2k4vrL8lu2S3oNWOuwvXy9mf+2pV1IINbXwGGnTSRZW/FyuAPSWxDrzSJM7+02vqP1k6tNoSjzpQ7SJHoV2fbg6qRtDJgaanalc16gphKdEYmEnBhNx2Dq41rxFIyBo1FzNpqwiIJrxp4VSF3SXaMSO0mdm5K1NpeWsrOZzTuktOhO070pOqSm7DVQUs6VjKSVRTzIZWJ3MOTeCcr5goThnC03JF9e7F0F72lIG1rBOyxVp4pRO9K43RtKtuE+cVOVDc3Ed1KQCpRSIKldpPVzpzglrIHf9PdtZ8FTHlun6iOJaLTBC4qr9asYtizaGJT5gHExmC4Vq6G4VBw+k4GuG7Q8d5SIig5r/T7KUS/JavTAZnW+91O9LzNzPsydluC6FrVQHdb7bl0cKn26wbRa2WviYWxZSLDU9YConx/UYcilcOVZyN6l/T0AZcVOM9GdHV+YJFQO44V96xD9PwFonfO+qw1mDaUy/2Olc+k9M+VoLkebwrRedvAe7hIajmd5i1DGCruo05zJv4ZomeHnHQXNWcbdyS6daJgz2+aNrw63bdDdrm9HNFzLyoBmYAaJr/KxQOCEzM37WXPJ714bqgkicAGdVOHcXwXflVJ3R/plHbaJXt0NhlWKhr6TNourUX0REZ1oFh5772InhkUx/cL4rsGIDotfzJHMmx3TKa9vMRlpTOdHlsB2ycP/0x/iQBrbzleE0Oty3BsmKzffy4GUXy6XO7R4z0xOWUm1jstQZb0X5Po4mQi3dHFiUr0X9IK3ono2uBQs+G3n7rLIVwp89G+jZE2Of+seHFC7Oi1vdVUopdfSrEnufV9Z3pP1Lc6gLXLD8LEycCaRFePQXnpvq+yFa3kFiS6dixXY8Pv15uTANX65HyZP/a88ngtJZY7JKW5cJ4S9K0WeHP6ZGWXZH1l/mhrKO3faVVDg1FLJjVEH8mSJiL6OuhXEj1tI8SbcT4mRKKOu/vwOakAlyY6STitlmy/PcmXTRip87yBc/2R5ryOkG53T+fEI8PSGlGWKUOeqPMc+fu/Zd89ak+5Bdkf3YYPSfRJR3ob+jNYAABAdAAA0UF0AHhi0Ndl5/RT+LthAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAACADP4DIABynLH54tAAAAAASUVORK5CYII=";
  private static final java.lang.String externalImage1 = "data:image/png;base64,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";
  private static com.google.gwt.resources.client.ImageResource appLogo;
  private static com.google.gwt.resources.client.ImageResource appName;
  private static com.google.gwt.resources.client.ImageResource themeHeader;
  private static com.bb.apps.myapp.client.IMyAppResources.MyAppCssStyles myAppStyles;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      appLogo(), 
      appName(), 
      themeHeader(), 
      myAppStyles(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("appLogo", appLogo());
        resourceMap.put("appName", appName());
        resourceMap.put("themeHeader", themeHeader());
        resourceMap.put("myAppStyles", myAppStyles());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'appLogo': return this.@com.bb.apps.myapp.client.IMyAppResources::appLogo()();
      case 'appName': return this.@com.bb.apps.myapp.client.IMyAppResources::appName()();
      case 'themeHeader': return this.@com.bb.apps.myapp.client.IMyAppResources::themeHeader()();
      case 'myAppStyles': return this.@com.bb.apps.myapp.client.IMyAppResources::myAppStyles()();
    }
    return null;
  }-*/;
}
