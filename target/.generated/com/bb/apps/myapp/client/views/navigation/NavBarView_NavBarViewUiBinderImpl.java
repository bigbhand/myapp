package com.bb.apps.myapp.client.views.navigation;

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

public class NavBarView_NavBarViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.bb.apps.myapp.client.views.navigation.NavBarView>, com.bb.apps.myapp.client.views.navigation.NavBarView.NavBarViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.bb.apps.myapp.client.views.navigation.NavBarView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.bb.apps.myapp.client.views.navigation.NavBarView owner;


    public Widgets(final com.bb.apps.myapp.client.views.navigation.NavBarView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
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
    private com.bb.apps.myapp.client.views.navigation.NavBarView_NavBarViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.bb.apps.myapp.client.views.navigation.NavBarView_NavBarViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.bb.apps.myapp.client.views.navigation.NavBarView_NavBarViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.bb.apps.myapp.client.views.navigation.NavBarView_NavBarViewUiBinderImpl_GenBundle) GWT.create(com.bb.apps.myapp.client.views.navigation.NavBarView_NavBarViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.bb.apps.myapp.client.views.navigation.NavBarView_NavBarViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.bb.apps.myapp.client.views.navigation.NavBarView_NavBarViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.bb.apps.myapp.client.views.navigation.NavBarView_NavBarViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for con called 7 times. Type: IMPORTED. Build precedence: 1.
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
      f_HTMLPanel1.setStyleName("" + get_res().myAppStyles().navBarPanel() + "");
      f_HTMLPanel1.setWidth("100%");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord2 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();

      // Detach section.
      attachRecord2.detach();
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
      f_HorizontalPanel2.add(get_homeTab());
      f_HorizontalPanel2.add(get_form1Tab());
      f_HorizontalPanel2.add(get_form2Tab());
      f_HorizontalPanel2.add(get_form3Tab());
      f_HorizontalPanel2.add(get_form4Tab());
      f_HorizontalPanel2.add(get_contactsTab());
      f_HorizontalPanel2.add(get_helpTab());


      return f_HorizontalPanel2;
    }

    /**
     * Getter for homeTab called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.bb.apps.myapp.client.widgets.NavBarItem get_homeTab() {
      return build_homeTab();
    }
    private com.bb.apps.myapp.client.widgets.NavBarItem build_homeTab() {
      // Creation section.
      final com.bb.apps.myapp.client.widgets.NavBarItem homeTab = (com.bb.apps.myapp.client.widgets.NavBarItem) GWT.create(com.bb.apps.myapp.client.widgets.NavBarItem.class);
      // Setup section.
      homeTab.setText("" + get_con().home() + "");


      this.owner.homeTab = homeTab;

      return homeTab;
    }

    /**
     * Getter for form1Tab called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.bb.apps.myapp.client.widgets.NavBarItem get_form1Tab() {
      return build_form1Tab();
    }
    private com.bb.apps.myapp.client.widgets.NavBarItem build_form1Tab() {
      // Creation section.
      final com.bb.apps.myapp.client.widgets.NavBarItem form1Tab = (com.bb.apps.myapp.client.widgets.NavBarItem) GWT.create(com.bb.apps.myapp.client.widgets.NavBarItem.class);
      // Setup section.
      form1Tab.setText("" + get_con().formName1() + "");


      this.owner.form1Tab = form1Tab;

      return form1Tab;
    }

    /**
     * Getter for form2Tab called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.bb.apps.myapp.client.widgets.NavBarItem get_form2Tab() {
      return build_form2Tab();
    }
    private com.bb.apps.myapp.client.widgets.NavBarItem build_form2Tab() {
      // Creation section.
      final com.bb.apps.myapp.client.widgets.NavBarItem form2Tab = (com.bb.apps.myapp.client.widgets.NavBarItem) GWT.create(com.bb.apps.myapp.client.widgets.NavBarItem.class);
      // Setup section.
      form2Tab.setText("" + get_con().formName2() + "");


      this.owner.form2Tab = form2Tab;

      return form2Tab;
    }

    /**
     * Getter for form3Tab called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.bb.apps.myapp.client.widgets.NavBarItem get_form3Tab() {
      return build_form3Tab();
    }
    private com.bb.apps.myapp.client.widgets.NavBarItem build_form3Tab() {
      // Creation section.
      final com.bb.apps.myapp.client.widgets.NavBarItem form3Tab = (com.bb.apps.myapp.client.widgets.NavBarItem) GWT.create(com.bb.apps.myapp.client.widgets.NavBarItem.class);
      // Setup section.
      form3Tab.setText("" + get_con().formName3() + "");


      this.owner.form3Tab = form3Tab;

      return form3Tab;
    }

    /**
     * Getter for form4Tab called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.bb.apps.myapp.client.widgets.NavBarItem get_form4Tab() {
      return build_form4Tab();
    }
    private com.bb.apps.myapp.client.widgets.NavBarItem build_form4Tab() {
      // Creation section.
      final com.bb.apps.myapp.client.widgets.NavBarItem form4Tab = (com.bb.apps.myapp.client.widgets.NavBarItem) GWT.create(com.bb.apps.myapp.client.widgets.NavBarItem.class);
      // Setup section.
      form4Tab.setText("" + get_con().formName4() + "");


      this.owner.form4Tab = form4Tab;

      return form4Tab;
    }

    /**
     * Getter for contactsTab called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.bb.apps.myapp.client.widgets.NavBarItem get_contactsTab() {
      return build_contactsTab();
    }
    private com.bb.apps.myapp.client.widgets.NavBarItem build_contactsTab() {
      // Creation section.
      final com.bb.apps.myapp.client.widgets.NavBarItem contactsTab = (com.bb.apps.myapp.client.widgets.NavBarItem) GWT.create(com.bb.apps.myapp.client.widgets.NavBarItem.class);
      // Setup section.
      contactsTab.setText("" + get_con().contactUs() + "");


      this.owner.contactsTab = contactsTab;

      return contactsTab;
    }

    /**
     * Getter for helpTab called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.bb.apps.myapp.client.widgets.NavBarItem get_helpTab() {
      return build_helpTab();
    }
    private com.bb.apps.myapp.client.widgets.NavBarItem build_helpTab() {
      // Creation section.
      final com.bb.apps.myapp.client.widgets.NavBarItem helpTab = (com.bb.apps.myapp.client.widgets.NavBarItem) GWT.create(com.bb.apps.myapp.client.widgets.NavBarItem.class);
      // Setup section.
      helpTab.setText("" + get_con().help() + "");


      this.owner.helpTab = helpTab;

      return helpTab;
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
