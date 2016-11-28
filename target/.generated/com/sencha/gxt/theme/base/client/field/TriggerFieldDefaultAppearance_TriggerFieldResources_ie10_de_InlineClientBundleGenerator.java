package com.sencha.gxt.theme.base.client.field;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator implements com.sencha.gxt.theme.base.client.field.TriggerFieldDefaultAppearance.TriggerFieldResources {
  private static TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator _instance0 = new TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator();
  private void cssInitializer() {
    css = new com.sencha.gxt.theme.base.client.field.TriggerFieldDefaultAppearance.TriggerFieldStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("input.GOKTVRVBC-,textarea.GOKTVRVBC-{border:" + ("1px"+ " " +"solid"+ " " +"#7eadd9")  + ";}input.GOKTVRVBD-,textarea.GOKTVRVBD-{height:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.invalidLine()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.invalidLine()).getSafeUri().asString() + "\") -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.invalidLine()).getLeft() + "px -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.invalidLine()).getTop() + "px  repeat-x")  + ";background-color:" + ("#fff")  + ";background-position:" + ("bottom")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#c30")  + ";height:" + ("18px")  + ";line-height:" + ("18px")  + ";}.GOKTVRVBJ-{position:" + ("relative")  + ";right:") + (("0")  + ";top:" + ("0")  + ";zoom:" + ("1")  + ";white-space:" + ("nowrap")  + ";text-align:" + ("right")  + ";}.GOKTVRVBA-{font:" + ("12px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GOKTVRVBPY{color:" + ("gray")  + ";}.GOKTVRVBH-{height:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.textBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.textBackground()).getSafeUri().asString() + "\") -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.textBackground()).getLeft() + "px -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.textBackground()).getTop() + "px  repeat-x")  + ";height:" + ("auto") ) + (";background-color:" + ("#fff")  + ";border:" + ("1px"+ " " +"#b5b8c8"+ " " +"solid")  + ";padding:" + ("1px"+ " " +"3px")  + ";resize:" + ("none")  + ";height:" + ("18px")  + ";line-height:" + ("18px")  + ";vertical-align:" + ("top")  + ";}.GOKTVRVBNY{background-color:" + ("#fff")  + ";border:" + ("1px"+ " " +"#b5b8c8"+ " " +"solid")  + ";padding:" + ("1px"+ " " +"3px")  + ";resize:") + (("none")  + ";overflow:" + ("visible")  + ";}.GOKTVRVBI-{height:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrow()).getHeight() + "px")  + ";width:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrow()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrow()).getSafeUri().asString() + "\") -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrow()).getLeft() + "px -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrow()).getTop() + "px  no-repeat")  + ";height:" + ("21px")  + ";border-bottom:" + ("1px"+ " " +"solid")  + ";border-bottom-color:" + ("#b5b8c8")  + ";}.GOKTVRVBC- .GOKTVRVBI-{height:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowFocus()).getHeight() + "px")  + ";width:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowFocus()).getWidth() + "px") ) + (";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowFocus()).getSafeUri().asString() + "\") -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowFocus()).getLeft() + "px -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowFocus()).getTop() + "px  no-repeat")  + ";height:" + ("21px")  + ";border-bottom-color:" + ("#7eadd9")  + ";}.GOKTVRVBF- .GOKTVRVBI-{height:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowOver()).getHeight() + "px")  + ";width:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowOver()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowOver()).getSafeUri().asString() + "\") -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowOver()).getLeft() + "px -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowOver()).getTop() + "px  no-repeat")  + ";height:" + ("21px")  + ";border-bottom-color:" + ("#7eadd9")  + ";}.GOKTVRVBOY .GOKTVRVBI-{height:") + (((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowClick()).getHeight() + "px")  + ";width:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowClick()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowClick()).getSafeUri().asString() + "\") -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowClick()).getLeft() + "px -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowClick()).getTop() + "px  no-repeat")  + ";height:" + ("21px")  + ";border-bottom-color:" + ("#7eadd9")  + ";}.GOKTVRVBE-{cursor:" + ("pointer")  + ";}")) : (("input.GOKTVRVBC-,textarea.GOKTVRVBC-{border:" + ("1px"+ " " +"solid"+ " " +"#7eadd9")  + ";}input.GOKTVRVBD-,textarea.GOKTVRVBD-{height:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.invalidLine()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.invalidLine()).getSafeUri().asString() + "\") -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.invalidLine()).getLeft() + "px -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.invalidLine()).getTop() + "px  repeat-x")  + ";background-color:" + ("#fff")  + ";background-position:" + ("bottom")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#c30")  + ";height:" + ("18px")  + ";line-height:" + ("18px")  + ";}.GOKTVRVBJ-{position:" + ("relative")  + ";left:") + (("0")  + ";top:" + ("0")  + ";zoom:" + ("1")  + ";white-space:" + ("nowrap")  + ";text-align:" + ("left")  + ";}.GOKTVRVBA-{font:" + ("12px"+ " " +"tahoma"+ ","+ " " +"arial"+ ","+ " " +"helvetica"+ ","+ " " +"sans-serif")  + ";}.GOKTVRVBPY{color:" + ("gray")  + ";}.GOKTVRVBH-{height:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.textBackground()).getHeight() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.textBackground()).getSafeUri().asString() + "\") -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.textBackground()).getLeft() + "px -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.textBackground()).getTop() + "px  repeat-x")  + ";height:" + ("auto") ) + (";background-color:" + ("#fff")  + ";border:" + ("1px"+ " " +"#b5b8c8"+ " " +"solid")  + ";padding:" + ("1px"+ " " +"3px")  + ";resize:" + ("none")  + ";height:" + ("18px")  + ";line-height:" + ("18px")  + ";vertical-align:" + ("top")  + ";}.GOKTVRVBNY{background-color:" + ("#fff")  + ";border:" + ("1px"+ " " +"#b5b8c8"+ " " +"solid")  + ";padding:" + ("1px"+ " " +"3px")  + ";resize:") + (("none")  + ";overflow:" + ("visible")  + ";}.GOKTVRVBI-{height:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrow()).getHeight() + "px")  + ";width:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrow()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrow()).getSafeUri().asString() + "\") -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrow()).getLeft() + "px -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrow()).getTop() + "px  no-repeat")  + ";height:" + ("21px")  + ";border-bottom:" + ("1px"+ " " +"solid")  + ";border-bottom-color:" + ("#b5b8c8")  + ";}.GOKTVRVBC- .GOKTVRVBI-{height:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowFocus()).getHeight() + "px")  + ";width:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowFocus()).getWidth() + "px") ) + (";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowFocus()).getSafeUri().asString() + "\") -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowFocus()).getLeft() + "px -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowFocus()).getTop() + "px  no-repeat")  + ";height:" + ("21px")  + ";border-bottom-color:" + ("#7eadd9")  + ";}.GOKTVRVBF- .GOKTVRVBI-{height:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowOver()).getHeight() + "px")  + ";width:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowOver()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowOver()).getSafeUri().asString() + "\") -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowOver()).getLeft() + "px -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowOver()).getTop() + "px  no-repeat")  + ";height:" + ("21px")  + ";border-bottom-color:" + ("#7eadd9")  + ";}.GOKTVRVBOY .GOKTVRVBI-{height:") + (((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowClick()).getHeight() + "px")  + ";width:" + ((TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowClick()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowClick()).getSafeUri().asString() + "\") -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowClick()).getLeft() + "px -" + (TriggerFieldDefaultAppearance_TriggerFieldResources_ie10_de_InlineClientBundleGenerator.this.triggerArrowClick()).getTop() + "px  no-repeat")  + ";height:" + ("21px")  + ";border-bottom-color:" + ("#7eadd9")  + ";}.GOKTVRVBE-{cursor:" + ("pointer")  + ";}"));
      }
      public java.lang.String area() {
        return "GOKTVRVBNY";
      }
      public java.lang.String click() {
        return "GOKTVRVBOY";
      }
      public java.lang.String empty() {
        return "GOKTVRVBPY";
      }
      public java.lang.String field() {
        return "GOKTVRVBA-";
      }
      public java.lang.String file() {
        return "GOKTVRVBB-";
      }
      public java.lang.String focus() {
        return "GOKTVRVBC-";
      }
      public java.lang.String invalid() {
        return "GOKTVRVBD-";
      }
      public java.lang.String noedit() {
        return "GOKTVRVBE-";
      }
      public java.lang.String over() {
        return "GOKTVRVBF-";
      }
      public java.lang.String readonly() {
        return "GOKTVRVBG-";
      }
      public java.lang.String text() {
        return "GOKTVRVBH-";
      }
      public java.lang.String trigger() {
        return "GOKTVRVBI-";
      }
      public java.lang.String wrap() {
        return "GOKTVRVBJ-";
      }
    }
    ;
  }
  private static class cssInitializer {
    static {
      _instance0.cssInitializer();
    }
    static com.sencha.gxt.theme.base.client.field.TriggerFieldDefaultAppearance.TriggerFieldStyle get() {
      return css;
    }
  }
  public com.sencha.gxt.theme.base.client.field.TriggerFieldDefaultAppearance.TriggerFieldStyle css() {
    return cssInitializer.get();
  }
  private void invalidLineInitializer() {
    invalidLine = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "invalidLine",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
      0, 0, 4, 3, false, false
    );
  }
  private static class invalidLineInitializer {
    static {
      _instance0.invalidLineInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return invalidLine;
    }
  }
  public com.google.gwt.resources.client.ImageResource invalidLine() {
    return invalidLineInitializer.get();
  }
  private void textBackgroundInitializer() {
    textBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "textBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage0),
      0, 0, 1, 18, false, false
    );
  }
  private static class textBackgroundInitializer {
    static {
      _instance0.textBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return textBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource textBackground() {
    return textBackgroundInitializer.get();
  }
  private void triggerArrowInitializer() {
    triggerArrow = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "triggerArrow",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage1),
      0, 0, 17, 24, false, false
    );
  }
  private static class triggerArrowInitializer {
    static {
      _instance0.triggerArrowInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return triggerArrow;
    }
  }
  public com.google.gwt.resources.client.ImageResource triggerArrow() {
    return triggerArrowInitializer.get();
  }
  private void triggerArrowClickInitializer() {
    triggerArrowClick = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "triggerArrowClick",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage2),
      0, 0, 17, 24, false, false
    );
  }
  private static class triggerArrowClickInitializer {
    static {
      _instance0.triggerArrowClickInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return triggerArrowClick;
    }
  }
  public com.google.gwt.resources.client.ImageResource triggerArrowClick() {
    return triggerArrowClickInitializer.get();
  }
  private void triggerArrowFocusInitializer() {
    triggerArrowFocus = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "triggerArrowFocus",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage3),
      0, 0, 17, 24, false, false
    );
  }
  private static class triggerArrowFocusInitializer {
    static {
      _instance0.triggerArrowFocusInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return triggerArrowFocus;
    }
  }
  public com.google.gwt.resources.client.ImageResource triggerArrowFocus() {
    return triggerArrowFocusInitializer.get();
  }
  private void triggerArrowOverInitializer() {
    triggerArrowOver = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "triggerArrowOver",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage4),
      0, 0, 17, 24, false, false
    );
  }
  private static class triggerArrowOverInitializer {
    static {
      _instance0.triggerArrowOverInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return triggerArrowOver;
    }
  }
  public com.google.gwt.resources.client.ImageResource triggerArrowOver() {
    return triggerArrowOverInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sencha.gxt.theme.base.client.field.TriggerFieldDefaultAppearance.TriggerFieldStyle css;
  private static final java.lang.String externalImage = GWT.getModuleBaseForStaticFiles() + "2659A66C9CEC1586DA091ACEC4A3AE6B.cache.png";
  private static final java.lang.String externalImage0 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAASCAYAAACaV7S8AAAANElEQVR42pXEuQnAQAwAwe2/SCcGxwYhhLhn7RZuguG6H3kjJDIlq6S6pceQOZesvcXfUR9VjEbUejI8wwAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage1 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAYCAYAAAAcYhYyAAAArElEQVR42mPYuuPEf0owAwj8+fvvP7n4+s37EIPev3//nxwMM4giQ0D4y9evlBvy+/fvwWzInz9//v/9+xdMEyOOYcivX7/+m4b0/jcM6P5vHNQD1wCiQXyQOEgepI6gS2AaQDTIdmQ+uktABmINk58/f8I1wjCIDxJHV/vt2zfcAfvjxw8UF4D42NThNQRmkGlwL04DiDIEnCK/fMEbxUQZQgiPGjJqCN0NAQCSPtU5TDpoeQAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage2 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAYCAYAAAAcYhYyAAAA6klEQVR42u3QWwqCUBAGYLfUbR9R+2kD1VLSeughcAUFatSDUhhhVgZBBOKtmM54Q1MPofSm8DPMnDmfIjOYKFAlDD7L3RnKZiFeAqgKgqmRHxBRvYJ4MPyamavZeQbZHG9g2i443suv2K/2+fNcRCBveJg2dPpjaHSH0OqNwHRckPW7X7HHOZ7jnpD4Ih9h1xpwJLxCIMuFZngBq+29Uz2e4x7u4z1W0kJEChqOhJfTUJQYIOdcuB8lhRRBNCAX+Yba+A8oQCGShIynRQWoSATNtzoViBFOOkHZxMiUNGUTIzPSlE2N/Bn5ALmLVsqt4hyAAAAAAElFTkSuQmCC";
  private static final java.lang.String externalImage3 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAYCAYAAAAcYhYyAAAAu0lEQVR42u2RWwqCQBiF3VJY++iynzZQLaUFtIogMPA5RIheFBwcGz3NGRm6kKMo9JIDh8N/+374x1vvQwyRx3dXFfrqcIxrUHAF+kiVFfgGQah/gGSyRKGvTg8iYXJn7W95FyQRCrPVDpP5Bv5yC6EHwjg3zph51tnXCDldcrPJDtC5/TVmnX2tN0myAv6iHrRizPxnb5TI5sOm4gmiM/7W54RY0FTfoAnQCULdUun84k6QNo2QEfJzyAMAH7som6YrTAAAAABJRU5ErkJggg==";
  private static final java.lang.String externalImage4 = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAYCAYAAAAcYhYyAAABB0lEQVR42qWSW0oDQRBFsyUR9yHqetyAkp24ABeg4gOjqB9+RKNxEhEEQ3S0u2OOUxP6MoREpGw4FPU6A8W0tvdu+Q8te2kyxct+ZzgTjSfgIb9a8pbAiySvAbxI8vIFXiQZfIIXSfolZMI3VEev41/qkvTewSiri69ttVlZ32F1Y7desLpFy61ufZvLO5J0x5BpLli0rzdz6zfnJTnoBpp8hKkWM5ZbfX62GIWZ5PAuME9TlAWL5iQ5ug8soozVjTbbdVw2I8lxL7CMUfUv/NaX5KQX8SLJ6UPEiyRnjxEvkpz3I14k6TxFvEhyUUS8SHJZJLxIcjVIeJHkepjwIsnNc8JLlvwAGge6koq6WmEAAAAASUVORK5CYII=";
  private static com.google.gwt.resources.client.ImageResource invalidLine;
  private static com.google.gwt.resources.client.ImageResource textBackground;
  private static com.google.gwt.resources.client.ImageResource triggerArrow;
  private static com.google.gwt.resources.client.ImageResource triggerArrowClick;
  private static com.google.gwt.resources.client.ImageResource triggerArrowFocus;
  private static com.google.gwt.resources.client.ImageResource triggerArrowOver;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      css(), 
      invalidLine(), 
      textBackground(), 
      triggerArrow(), 
      triggerArrowClick(), 
      triggerArrowFocus(), 
      triggerArrowOver(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("css", css());
        resourceMap.put("invalidLine", invalidLine());
        resourceMap.put("textBackground", textBackground());
        resourceMap.put("triggerArrow", triggerArrow());
        resourceMap.put("triggerArrowClick", triggerArrowClick());
        resourceMap.put("triggerArrowFocus", triggerArrowFocus());
        resourceMap.put("triggerArrowOver", triggerArrowOver());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'css': return this.@com.sencha.gxt.theme.base.client.field.TriggerFieldDefaultAppearance.TriggerFieldResources::css()();
      case 'invalidLine': return this.@com.sencha.gxt.theme.base.client.field.TriggerFieldDefaultAppearance.TriggerFieldResources::invalidLine()();
      case 'textBackground': return this.@com.sencha.gxt.theme.base.client.field.TriggerFieldDefaultAppearance.TriggerFieldResources::textBackground()();
      case 'triggerArrow': return this.@com.sencha.gxt.theme.base.client.field.TriggerFieldDefaultAppearance.TriggerFieldResources::triggerArrow()();
      case 'triggerArrowClick': return this.@com.sencha.gxt.theme.base.client.field.TriggerFieldDefaultAppearance.TriggerFieldResources::triggerArrowClick()();
      case 'triggerArrowFocus': return this.@com.sencha.gxt.theme.base.client.field.TriggerFieldDefaultAppearance.TriggerFieldResources::triggerArrowFocus()();
      case 'triggerArrowOver': return this.@com.sencha.gxt.theme.base.client.field.TriggerFieldDefaultAppearance.TriggerFieldResources::triggerArrowOver()();
    }
    return null;
  }-*/;
}
