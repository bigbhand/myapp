package com.bb.apps.myapp.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class NavBarItem_NavBarItemUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.bb.apps.myapp.client.widgets.NavBarItem>, com.bb.apps.myapp.client.widgets.NavBarItem.NavBarItemUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.bb.apps.myapp.client.widgets.NavBarItem owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.bb.apps.myapp.client.widgets.NavBarItem owner;


    public Widgets(final com.bb.apps.myapp.client.widgets.NavBarItem owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.bb.apps.myapp.client.widgets.NavBarItem_NavBarItemUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.bb.apps.myapp.client.widgets.NavBarItem_NavBarItemUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.bb.apps.myapp.client.widgets.NavBarItem_NavBarItemUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.bb.apps.myapp.client.widgets.NavBarItem_NavBarItemUiBinderImpl_GenBundle) GWT.create(com.bb.apps.myapp.client.widgets.NavBarItem_NavBarItemUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.bb.apps.myapp.client.widgets.NavBarItem_NavBarItemUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.bb.apps.myapp.client.widgets.NavBarItem_NavBarItemUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.bb.apps.myapp.client.widgets.NavBarItem_NavBarItemUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for res called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.bb.apps.myapp.client.IMyAppResources get_res() {
      return build_res();
    }
    private com.bb.apps.myapp.client.IMyAppResources build_res() {
      // Creation section.
      final com.bb.apps.myapp.client.IMyAppResources res = (com.bb.apps.myapp.client.IMyAppResources) GWT.create(com.bb.apps.myapp.client.IMyAppResources.class);
      // Setup section.


      return res;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.
      f_HTMLPanel1.setStyleName("" + get_res().myAppStyles().navBarItem() + "");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord3 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord3.detach();
      f_HTMLPanel1.addAndReplaceElement(get_label(), get_domId0Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId0;
    }

    /**
     * Getter for label called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_label() {
      return build_label();
    }
    private com.google.gwt.user.client.ui.Label build_label() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label label = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.


      this.owner.label = label;

      return label;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.


      return domId0Element;
    }
  }
}
