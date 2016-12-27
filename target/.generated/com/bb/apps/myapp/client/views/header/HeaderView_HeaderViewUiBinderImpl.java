package com.bb.apps.myapp.client.views.header;

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

public class HeaderView_HeaderViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.bb.apps.myapp.client.views.header.HeaderView>, com.bb.apps.myapp.client.views.header.HeaderView.HeaderViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.bb.apps.myapp.client.views.header.HeaderView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.bb.apps.myapp.client.views.header.HeaderView owner;


    public Widgets(final com.bb.apps.myapp.client.views.header.HeaderView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_res();  // more than one getter call detected. Type: IMPORTED, precedence: 1
      build_con();  // more than one getter call detected. Type: IMPORTED, precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.bb.apps.myapp.client.views.header.HeaderView_HeaderViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.bb.apps.myapp.client.views.header.HeaderView_HeaderViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.bb.apps.myapp.client.views.header.HeaderView_HeaderViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.bb.apps.myapp.client.views.header.HeaderView_HeaderViewUiBinderImpl_GenBundle) GWT.create(com.bb.apps.myapp.client.views.header.HeaderView_HeaderViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 4 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.bb.apps.myapp.client.views.header.HeaderView_HeaderViewUiBinderImpl_GenCss_style style;
    private com.bb.apps.myapp.client.views.header.HeaderView_HeaderViewUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.bb.apps.myapp.client.views.header.HeaderView_HeaderViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for res called 7 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.bb.apps.myapp.client.IMyAppResources res;
    private com.bb.apps.myapp.client.IMyAppResources get_res() {
      return res;
    }
    private com.bb.apps.myapp.client.IMyAppResources build_res() {
      // Creation section.
      res = (com.bb.apps.myapp.client.IMyAppResources) GWT.create(com.bb.apps.myapp.client.IMyAppResources.class);
      // Setup section.


      return res;
    }

    /**
     * Getter for con called 3 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.bb.apps.myapp.client.messages.MyAppConstants con;
    private com.bb.apps.myapp.client.messages.MyAppConstants get_con() {
      return con;
    }
    private com.bb.apps.myapp.client.messages.MyAppConstants build_con() {
      // Creation section.
      con = (com.bb.apps.myapp.client.messages.MyAppConstants) GWT.create(com.bb.apps.myapp.client.messages.MyAppConstants.class);
      // Setup section.


      return con;
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
      f_HTMLPanel1.setWidth("100%");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord5 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord5.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_HorizontalPanel2(), get_domId0Element().get());

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
     * Getter for f_HorizontalPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel2() {
      return build_f_HorizontalPanel2();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel2 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel2.add(get_f_VerticalPanel3());
      f_HorizontalPanel2.add(get_f_VerticalPanel4());
      f_HorizontalPanel2.add(get_f_VerticalPanel13());


      return f_HorizontalPanel2;
    }

    /**
     * Getter for f_VerticalPanel3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel3() {
      return build_f_VerticalPanel3();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel3 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel3.add(get_themeHeader());
      f_VerticalPanel3.add(get_appName());
      f_VerticalPanel3.setWidth("590px");


      return f_VerticalPanel3;
    }

    /**
     * Getter for themeHeader called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Image get_themeHeader() {
      return build_themeHeader();
    }
    private com.google.gwt.user.client.ui.Image build_themeHeader() {
      // Creation section.
      final com.google.gwt.user.client.ui.Image themeHeader = (com.google.gwt.user.client.ui.Image) GWT.create(com.google.gwt.user.client.ui.Image.class);
      // Setup section.


      this.owner.themeHeader = themeHeader;

      return themeHeader;
    }

    /**
     * Getter for appName called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Image get_appName() {
      return build_appName();
    }
    private com.google.gwt.user.client.ui.Image build_appName() {
      // Creation section.
      final com.google.gwt.user.client.ui.Image appName = (com.google.gwt.user.client.ui.Image) GWT.create(com.google.gwt.user.client.ui.Image.class);
      // Setup section.


      this.owner.appName = appName;

      return appName;
    }

    /**
     * Getter for f_VerticalPanel4 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel4() {
      return build_f_VerticalPanel4();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel4() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel4 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel4.add(get_f_HorizontalPanel5());
      f_VerticalPanel4.add(get_f_HorizontalPanel6());
      f_VerticalPanel4.add(get_f_HorizontalPanel12());
      f_VerticalPanel4.setWidth("380px");


      return f_VerticalPanel4;
    }

    /**
     * Getter for f_HorizontalPanel5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel5() {
      return build_f_HorizontalPanel5();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel5() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel5 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel5.add(get_welcomeNote());
      f_HorizontalPanel5.setStyleName("" + get_style().flatRight() + "");


      return f_HorizontalPanel5;
    }

    /**
     * Getter for welcomeNote called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_welcomeNote() {
      return build_welcomeNote();
    }
    private com.google.gwt.user.client.ui.Label build_welcomeNote() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label welcomeNote = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      welcomeNote.setStyleName("" + get_res().myAppStyles().welcomeNote() + "");


      this.owner.welcomeNote = welcomeNote;

      return welcomeNote;
    }

    /**
     * Getter for f_HorizontalPanel6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel6() {
      return build_f_HorizontalPanel6();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel6() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel6 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel6.add(get_f_Hyperlink7());
      f_HorizontalPanel6.add(get_f_Label8());
      f_HorizontalPanel6.add(get_f_Hyperlink9());
      f_HorizontalPanel6.add(get_f_Label10());
      f_HorizontalPanel6.add(get_f_Hyperlink11());
      f_HorizontalPanel6.setStyleName("" + get_style().flatRight() + "");


      return f_HorizontalPanel6;
    }

    /**
     * Getter for f_Hyperlink7 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Hyperlink get_f_Hyperlink7() {
      return build_f_Hyperlink7();
    }
    private com.google.gwt.user.client.ui.Hyperlink build_f_Hyperlink7() {
      // Creation section.
      final com.google.gwt.user.client.ui.Hyperlink f_Hyperlink7 = (com.google.gwt.user.client.ui.Hyperlink) GWT.create(com.google.gwt.user.client.ui.Hyperlink.class);
      // Setup section.
      f_Hyperlink7.setStyleName("" + get_res().myAppStyles().headerLinkStyle() + "");
      f_Hyperlink7.setText("" + get_con().myAccount() + "");


      return f_Hyperlink7;
    }

    /**
     * Getter for f_Label8 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label8() {
      return build_f_Label8();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label8() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label8 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label8.setText("|");
      f_Label8.setStyleName("" + get_res().myAppStyles().headerTextStyle() + "");


      return f_Label8;
    }

    /**
     * Getter for f_Hyperlink9 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Hyperlink get_f_Hyperlink9() {
      return build_f_Hyperlink9();
    }
    private com.google.gwt.user.client.ui.Hyperlink build_f_Hyperlink9() {
      // Creation section.
      final com.google.gwt.user.client.ui.Hyperlink f_Hyperlink9 = (com.google.gwt.user.client.ui.Hyperlink) GWT.create(com.google.gwt.user.client.ui.Hyperlink.class);
      // Setup section.
      f_Hyperlink9.setStyleName("" + get_res().myAppStyles().headerLinkStyle() + "");
      f_Hyperlink9.setText("" + get_con().settings() + "");


      return f_Hyperlink9;
    }

    /**
     * Getter for f_Label10 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label10() {
      return build_f_Label10();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label10() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label10 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label10.setText("|");
      f_Label10.setStyleName("" + get_res().myAppStyles().headerTextStyle() + "");


      return f_Label10;
    }

    /**
     * Getter for f_Hyperlink11 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Hyperlink get_f_Hyperlink11() {
      return build_f_Hyperlink11();
    }
    private com.google.gwt.user.client.ui.Hyperlink build_f_Hyperlink11() {
      // Creation section.
      final com.google.gwt.user.client.ui.Hyperlink f_Hyperlink11 = (com.google.gwt.user.client.ui.Hyperlink) GWT.create(com.google.gwt.user.client.ui.Hyperlink.class);
      // Setup section.
      f_Hyperlink11.setStyleName("" + get_res().myAppStyles().headerLinkStyle() + "");
      f_Hyperlink11.setText("" + get_con().logout() + "");


      return f_Hyperlink11;
    }

    /**
     * Getter for f_HorizontalPanel12 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel12() {
      return build_f_HorizontalPanel12();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel12() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel12 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel12.add(get_lastLogin());
      f_HorizontalPanel12.setStyleName("" + get_style().flatRight() + "");


      return f_HorizontalPanel12;
    }

    /**
     * Getter for lastLogin called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_lastLogin() {
      return build_lastLogin();
    }
    private com.google.gwt.user.client.ui.Label build_lastLogin() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label lastLogin = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      lastLogin.setStyleName("" + get_res().myAppStyles().headerTextStyle() + "");


      this.owner.lastLogin = lastLogin;

      return lastLogin;
    }

    /**
     * Getter for f_VerticalPanel13 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel13() {
      return build_f_VerticalPanel13();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel13() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel13 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel13.add(get_appLogo());
      f_VerticalPanel13.setStyleName("" + get_style().flatRightEnd() + "");
      f_VerticalPanel13.setWidth("70px");


      return f_VerticalPanel13;
    }

    /**
     * Getter for appLogo called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Image get_appLogo() {
      return build_appLogo();
    }
    private com.google.gwt.user.client.ui.Image build_appLogo() {
      // Creation section.
      final com.google.gwt.user.client.ui.Image appLogo = (com.google.gwt.user.client.ui.Image) GWT.create(com.google.gwt.user.client.ui.Image.class);
      // Setup section.
      appLogo.setHeight("90px");
      appLogo.setWidth("90px");


      this.owner.appLogo = appLogo;

      return appLogo;
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
