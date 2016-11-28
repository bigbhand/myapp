package com.bb.apps.myapp.client.views.tabs;

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

public class LoginView_LoginViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.bb.apps.myapp.client.views.tabs.LoginView>, com.bb.apps.myapp.client.views.tabs.LoginView.LoginViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Please enter your credentials")
    SafeHtml html1();
     
    @Template("<span id='{0}'></span>")
    SafeHtml html2(String arg0);
     
    @Template("<span id='{0}'></span>")
    SafeHtml html3(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.bb.apps.myapp.client.views.tabs.LoginView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.bb.apps.myapp.client.views.tabs.LoginView owner;


    public Widgets(final com.bb.apps.myapp.client.views.tabs.LoginView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_layoutData();  // more than one getter call detected. Type: IMPORTED, precedence: 1
      build_con();  // more than one getter call detected. Type: IMPORTED, precedence: 1
      build_res();  // more than one getter call detected. Type: IMPORTED, precedence: 1
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 3
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 3
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2(get_domId1());
    }
    SafeHtml template_html3() {
      return template.html3(get_domId0());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.bb.apps.myapp.client.views.tabs.LoginView_LoginViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.bb.apps.myapp.client.views.tabs.LoginView_LoginViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.bb.apps.myapp.client.views.tabs.LoginView_LoginViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.bb.apps.myapp.client.views.tabs.LoginView_LoginViewUiBinderImpl_GenBundle) GWT.create(com.bb.apps.myapp.client.views.tabs.LoginView_LoginViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.bb.apps.myapp.client.views.tabs.LoginView_LoginViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.bb.apps.myapp.client.views.tabs.LoginView_LoginViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.bb.apps.myapp.client.views.tabs.LoginView_LoginViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for margins called 1 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.sencha.gxt.core.client.util.Margins get_margins() {
      return build_margins();
    }
    private com.sencha.gxt.core.client.util.Margins build_margins() {
      // Creation section.
      final com.sencha.gxt.core.client.util.Margins margins = (com.sencha.gxt.core.client.util.Margins) GWT.create(com.sencha.gxt.core.client.util.Margins.class);
      // Setup section.
      margins.setBottom(0);
      margins.setLeft(0);
      margins.setRight(0);
      margins.setTop(8);


      return margins;
    }

    /**
     * Getter for layoutData called 5 times. Type: IMPORTED. Build precedence: 1.
     */
    private com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData layoutData;
    private com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData get_layoutData() {
      return layoutData;
    }
    private com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData build_layoutData() {
      // Creation section.
      layoutData = (com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData) GWT.create(com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.VerticalLayoutData.class);
      // Setup section.
      layoutData.setWidth(-1);
      layoutData.setMargins(get_margins());


      return layoutData;
    }

    /**
     * Getter for con called 4 times. Type: IMPORTED. Build precedence: 1.
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
     * Getter for res called 2 times. Type: IMPORTED. Build precedence: 1.
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
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html3().asString());
      // Setup section.
      f_HTMLPanel1.setWidth("100%");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord10 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord10.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel2(), get_domId0Element().get());

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
     * Getter for f_HTMLPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel2() {
      return build_f_HTMLPanel2();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.
      f_HTMLPanel2.setStyleName("" + get_res().myAppStyles().loginBackground() + "");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord11 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
      get_domId1Element().get();

      // Detach section.
      attachRecord11.detach();
      f_HTMLPanel2.addAndReplaceElement(get_f_VerticalLayoutContainer3(), get_domId1Element().get());

      return f_HTMLPanel2;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 3.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId1;
    }

    /**
     * Getter for f_VerticalLayoutContainer3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer get_f_VerticalLayoutContainer3() {
      return build_f_VerticalLayoutContainer3();
    }
    private com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer build_f_VerticalLayoutContainer3() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer f_VerticalLayoutContainer3 = (com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer) GWT.create(com.sencha.gxt.widget.core.client.container.VerticalLayoutContainer.class);
      // Setup section.
      f_VerticalLayoutContainer3.add(get_f_Label4(), get_layoutData());
      f_VerticalLayoutContainer3.add(get_f_FieldLabel5(), get_layoutData());
      f_VerticalLayoutContainer3.add(get_username(), null);
      f_VerticalLayoutContainer3.add(get_f_FieldLabel6(), get_layoutData());
      f_VerticalLayoutContainer3.add(get_password(), null);
      f_VerticalLayoutContainer3.add(get_loginError(), get_layoutData());
      f_VerticalLayoutContainer3.add(get_loginButton(), get_layoutData());


      return f_VerticalLayoutContainer3;
    }

    /**
     * Getter for f_Label4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label4() {
      return build_f_Label4();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label4() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label4.setStyleName("" + get_res().myAppStyles().loginHeader() + "");
      f_Label4.setText("" + get_con().loginHeader() + "");


      return f_Label4;
    }

    /**
     * Getter for f_FieldLabel5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.sencha.gxt.widget.core.client.form.FieldLabel get_f_FieldLabel5() {
      return build_f_FieldLabel5();
    }
    private com.sencha.gxt.widget.core.client.form.FieldLabel build_f_FieldLabel5() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.form.FieldLabel f_FieldLabel5 = (com.sencha.gxt.widget.core.client.form.FieldLabel) GWT.create(com.sencha.gxt.widget.core.client.form.FieldLabel.class);
      // Setup section.
      f_FieldLabel5.setLabelWidth(120);
      f_FieldLabel5.setText("" + get_con().username() + "");


      return f_FieldLabel5;
    }

    /**
     * Getter for username called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.sencha.gxt.widget.core.client.form.TextField get_username() {
      return build_username();
    }
    private com.sencha.gxt.widget.core.client.form.TextField build_username() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.form.TextField username = (com.sencha.gxt.widget.core.client.form.TextField) GWT.create(com.sencha.gxt.widget.core.client.form.TextField.class);
      // Setup section.
      username.setAllowBlank(false);
      username.setWidth("190");


      this.owner.username = username;

      return username;
    }

    /**
     * Getter for f_FieldLabel6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.sencha.gxt.widget.core.client.form.FieldLabel get_f_FieldLabel6() {
      return build_f_FieldLabel6();
    }
    private com.sencha.gxt.widget.core.client.form.FieldLabel build_f_FieldLabel6() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.form.FieldLabel f_FieldLabel6 = (com.sencha.gxt.widget.core.client.form.FieldLabel) GWT.create(com.sencha.gxt.widget.core.client.form.FieldLabel.class);
      // Setup section.
      f_FieldLabel6.setLabelWidth(120);
      f_FieldLabel6.setText("" + get_con().password() + "");


      return f_FieldLabel6;
    }

    /**
     * Getter for password called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.sencha.gxt.widget.core.client.form.PasswordField get_password() {
      return build_password();
    }
    private com.sencha.gxt.widget.core.client.form.PasswordField build_password() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.form.PasswordField password = (com.sencha.gxt.widget.core.client.form.PasswordField) GWT.create(com.sencha.gxt.widget.core.client.form.PasswordField.class);
      // Setup section.
      password.setAllowBlank(false);
      password.setWidth("190");


      this.owner.password = password;

      return password;
    }

    /**
     * Getter for loginError called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HTML get_loginError() {
      return build_loginError();
    }
    private com.google.gwt.user.client.ui.HTML build_loginError() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML loginError = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      loginError.setHTML(template_html1().asString());
      loginError.setVisible(false);


      this.owner.loginError = loginError;

      return loginError;
    }

    /**
     * Getter for loginButton called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.sencha.gxt.widget.core.client.button.TextButton get_loginButton() {
      return build_loginButton();
    }
    private com.sencha.gxt.widget.core.client.button.TextButton build_loginButton() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.button.TextButton loginButton = (com.sencha.gxt.widget.core.client.button.TextButton) GWT.create(com.sencha.gxt.widget.core.client.button.TextButton.class);
      // Setup section.
      loginButton.setText("" + get_con().login() + "");
      loginButton.setWidth("80px");


      this.owner.loginButton = loginButton;

      return loginButton;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.


      return domId1Element;
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
