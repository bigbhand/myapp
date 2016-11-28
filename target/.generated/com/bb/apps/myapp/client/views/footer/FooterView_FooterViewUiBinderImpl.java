package com.bb.apps.myapp.client.views.footer;

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

public class FooterView_FooterViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.bb.apps.myapp.client.views.footer.FooterView>, com.bb.apps.myapp.client.views.footer.FooterView.FooterViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div style='width:100%;height:4px;background-color:#4E5C5A;'></div>")
    SafeHtml html1();
     
    @Template("About Us")
    SafeHtml html2();
     
    @Template("This section tells something about you and your organization, products and services. This is a sample content, replace this with your actual content.")
    SafeHtml html3();
     
    @Template("Latest News")
    SafeHtml html4();
     
    @Template("news feed line 1")
    SafeHtml html5();
     
    @Template("news feed line 2")
    SafeHtml html6();
     
    @Template("news feed line 3")
    SafeHtml html7();
     
    @Template("news feed line 4")
    SafeHtml html8();
     
    @Template("Contact Us")
    SafeHtml html9();
     
    @Template("<i class='fa fa-envelope-o' style='font-size:14px;color:#cccdd0;margin-right:5px;width:15px;'></i>")
    SafeHtml html10();
     
    @Template("<i class='fa fa-phone' style='font-size:14px;color:#cccdd0;margin-right:5px;width:5px;'></i>")
    SafeHtml html11();
     
    @Template("<i class='fa fa-home' style='font-size:14px;color:#cccdd0;margin-right:5px;width:15px;'></i>")
    SafeHtml html12();
     
    @Template("<span id='{0}'></span>  <span id='{1}'></span>")
    SafeHtml html13(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.bb.apps.myapp.client.views.footer.FooterView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.bb.apps.myapp.client.views.footer.FooterView owner;


    public Widgets(final com.bb.apps.myapp.client.views.footer.FooterView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_res();  // more than one getter call detected. Type: IMPORTED, precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3();
    }
    SafeHtml template_html4() {
      return template.html4();
    }
    SafeHtml template_html5() {
      return template.html5();
    }
    SafeHtml template_html6() {
      return template.html6();
    }
    SafeHtml template_html7() {
      return template.html7();
    }
    SafeHtml template_html8() {
      return template.html8();
    }
    SafeHtml template_html9() {
      return template.html9();
    }
    SafeHtml template_html10() {
      return template.html10();
    }
    SafeHtml template_html11() {
      return template.html11();
    }
    SafeHtml template_html12() {
      return template.html12();
    }
    SafeHtml template_html13() {
      return template.html13(get_domId0(), get_domId1());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.bb.apps.myapp.client.views.footer.FooterView_FooterViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.bb.apps.myapp.client.views.footer.FooterView_FooterViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.bb.apps.myapp.client.views.footer.FooterView_FooterViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.bb.apps.myapp.client.views.footer.FooterView_FooterViewUiBinderImpl_GenBundle) GWT.create(com.bb.apps.myapp.client.views.footer.FooterView_FooterViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 3 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.bb.apps.myapp.client.views.footer.FooterView_FooterViewUiBinderImpl_GenCss_style style;
    private com.bb.apps.myapp.client.views.footer.FooterView_FooterViewUiBinderImpl_GenCss_style get_style() {
      return style;
    }
    private com.bb.apps.myapp.client.views.footer.FooterView_FooterViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
      // Setup section.
      style.ensureInjected();


      return style;
    }

    /**
     * Getter for res called 14 times. Type: IMPORTED. Build precedence: 1.
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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html13().asString());
      // Setup section.

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();

      // Detach section.
      attachRecord0.detach();
      f_HTMLPanel1.addAndReplaceElement(get_f_HTMLPanel2(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_HorizontalPanel3(), get_domId1Element().get());

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
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.


      return f_HTMLPanel2;
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

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
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
     * Getter for f_HorizontalPanel3 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel3() {
      return build_f_HorizontalPanel3();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel3 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel3.add(get_f_VerticalPanel4());
      f_HorizontalPanel3.add(get_f_VerticalPanel7());
      f_HorizontalPanel3.add(get_f_VerticalPanel13());


      return f_HorizontalPanel3;
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
      f_VerticalPanel4.add(get_f_HTML5());
      f_VerticalPanel4.add(get_f_HTMLPanel6());
      f_VerticalPanel4.setStyleName("" + get_res().myAppStyles().footerBox() + "");


      return f_VerticalPanel4;
    }

    /**
     * Getter for f_HTML5 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML5() {
      return build_f_HTML5();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML5() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML5 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML5.setHTML(template_html2().asString());
      f_HTML5.setStyleName("" + get_res().myAppStyles().footerHeaader() + "");


      return f_HTML5;
    }

    /**
     * Getter for f_HTMLPanel6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel6() {
      return build_f_HTMLPanel6();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel6() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel6 = new com.google.gwt.user.client.ui.HTMLPanel(template_html3().asString());
      // Setup section.
      f_HTMLPanel6.setStyleName("" + get_res().myAppStyles().footerContet() + "");


      return f_HTMLPanel6;
    }

    /**
     * Getter for f_VerticalPanel7 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel7() {
      return build_f_VerticalPanel7();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel7() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel7 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel7.add(get_f_HTML8());
      f_VerticalPanel7.add(get_f_Hyperlink9());
      f_VerticalPanel7.add(get_f_Hyperlink10());
      f_VerticalPanel7.add(get_f_Hyperlink11());
      f_VerticalPanel7.add(get_f_Hyperlink12());
      f_VerticalPanel7.setStyleName("" + get_res().myAppStyles().footerBox() + "");


      return f_VerticalPanel7;
    }

    /**
     * Getter for f_HTML8 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML8() {
      return build_f_HTML8();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML8() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML8 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML8.setHTML(template_html4().asString());
      f_HTML8.setStyleName("" + get_res().myAppStyles().footerHeaader() + "");


      return f_HTML8;
    }

    /**
     * Getter for f_Hyperlink9 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Hyperlink get_f_Hyperlink9() {
      return build_f_Hyperlink9();
    }
    private com.google.gwt.user.client.ui.Hyperlink build_f_Hyperlink9() {
      // Creation section.
      final com.google.gwt.user.client.ui.Hyperlink f_Hyperlink9 = (com.google.gwt.user.client.ui.Hyperlink) GWT.create(com.google.gwt.user.client.ui.Hyperlink.class);
      // Setup section.
      f_Hyperlink9.setHTML(template_html5().asString());
      f_Hyperlink9.setStyleName("" + get_res().myAppStyles().footerLink() + "");


      return f_Hyperlink9;
    }

    /**
     * Getter for f_Hyperlink10 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Hyperlink get_f_Hyperlink10() {
      return build_f_Hyperlink10();
    }
    private com.google.gwt.user.client.ui.Hyperlink build_f_Hyperlink10() {
      // Creation section.
      final com.google.gwt.user.client.ui.Hyperlink f_Hyperlink10 = (com.google.gwt.user.client.ui.Hyperlink) GWT.create(com.google.gwt.user.client.ui.Hyperlink.class);
      // Setup section.
      f_Hyperlink10.setHTML(template_html6().asString());
      f_Hyperlink10.setStyleName("" + get_res().myAppStyles().footerLink() + "");


      return f_Hyperlink10;
    }

    /**
     * Getter for f_Hyperlink11 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Hyperlink get_f_Hyperlink11() {
      return build_f_Hyperlink11();
    }
    private com.google.gwt.user.client.ui.Hyperlink build_f_Hyperlink11() {
      // Creation section.
      final com.google.gwt.user.client.ui.Hyperlink f_Hyperlink11 = (com.google.gwt.user.client.ui.Hyperlink) GWT.create(com.google.gwt.user.client.ui.Hyperlink.class);
      // Setup section.
      f_Hyperlink11.setHTML(template_html7().asString());
      f_Hyperlink11.setStyleName("" + get_res().myAppStyles().footerLink() + "");


      return f_Hyperlink11;
    }

    /**
     * Getter for f_Hyperlink12 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Hyperlink get_f_Hyperlink12() {
      return build_f_Hyperlink12();
    }
    private com.google.gwt.user.client.ui.Hyperlink build_f_Hyperlink12() {
      // Creation section.
      final com.google.gwt.user.client.ui.Hyperlink f_Hyperlink12 = (com.google.gwt.user.client.ui.Hyperlink) GWT.create(com.google.gwt.user.client.ui.Hyperlink.class);
      // Setup section.
      f_Hyperlink12.setHTML(template_html8().asString());
      f_Hyperlink12.setStyleName("" + get_res().myAppStyles().footerLink() + "");


      return f_Hyperlink12;
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
      f_VerticalPanel13.add(get_f_HTML14());
      f_VerticalPanel13.add(get_f_HorizontalPanel15());
      f_VerticalPanel13.add(get_f_HorizontalPanel18());
      f_VerticalPanel13.add(get_f_HorizontalPanel21());
      f_VerticalPanel13.setStyleName("" + get_res().myAppStyles().footerBox() + "");


      return f_VerticalPanel13;
    }

    /**
     * Getter for f_HTML14 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HTML get_f_HTML14() {
      return build_f_HTML14();
    }
    private com.google.gwt.user.client.ui.HTML build_f_HTML14() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTML f_HTML14 = (com.google.gwt.user.client.ui.HTML) GWT.create(com.google.gwt.user.client.ui.HTML.class);
      // Setup section.
      f_HTML14.setHTML(template_html9().asString());
      f_HTML14.setStyleName("" + get_res().myAppStyles().footerHeaader() + "");


      return f_HTML14;
    }

    /**
     * Getter for f_HorizontalPanel15 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel15() {
      return build_f_HorizontalPanel15();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel15() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel15 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel15.add(get_f_HTMLPanel16());
      f_HorizontalPanel15.add(get_f_Label17());
      f_HorizontalPanel15.setStyleName("" + get_style().borderBottom() + "");


      return f_HorizontalPanel15;
    }

    /**
     * Getter for f_HTMLPanel16 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel16() {
      return build_f_HTMLPanel16();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel16() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel16 = new com.google.gwt.user.client.ui.HTMLPanel(template_html10().asString());
      // Setup section.


      return f_HTMLPanel16;
    }

    /**
     * Getter for f_Label17 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label17() {
      return build_f_Label17();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label17() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label17 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label17.setText("examplemailid@bigbhand.com");
      f_Label17.setStyleName("" + get_res().myAppStyles().footerText() + "");


      return f_Label17;
    }

    /**
     * Getter for f_HorizontalPanel18 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel18() {
      return build_f_HorizontalPanel18();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel18() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel18 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel18.add(get_f_HTMLPanel19());
      f_HorizontalPanel18.add(get_f_Label20());
      f_HorizontalPanel18.setStyleName("" + get_style().borderBottom() + "");


      return f_HorizontalPanel18;
    }

    /**
     * Getter for f_HTMLPanel19 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel19() {
      return build_f_HTMLPanel19();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel19() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel19 = new com.google.gwt.user.client.ui.HTMLPanel(template_html11().asString());
      // Setup section.


      return f_HTMLPanel19;
    }

    /**
     * Getter for f_Label20 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label20() {
      return build_f_Label20();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label20() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label20 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label20.setText("+(080)-24425296");
      f_Label20.setStyleName("" + get_res().myAppStyles().footerText() + "");


      return f_Label20;
    }

    /**
     * Getter for f_HorizontalPanel21 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.HorizontalPanel get_f_HorizontalPanel21() {
      return build_f_HorizontalPanel21();
    }
    private com.google.gwt.user.client.ui.HorizontalPanel build_f_HorizontalPanel21() {
      // Creation section.
      final com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel21 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
      // Setup section.
      f_HorizontalPanel21.add(get_f_HTMLPanel22());
      f_HorizontalPanel21.add(get_f_Label23());
      f_HorizontalPanel21.setStyleName("" + get_style().borderBottom() + "");


      return f_HorizontalPanel21;
    }

    /**
     * Getter for f_HTMLPanel22 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel22() {
      return build_f_HTMLPanel22();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel22() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel22 = new com.google.gwt.user.client.ui.HTMLPanel(template_html12().asString());
      // Setup section.


      return f_HTMLPanel22;
    }

    /**
     * Getter for f_Label23 called 1 times. Type: DEFAULT. Build precedence: 5.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label23() {
      return build_f_Label23();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label23() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label23 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label23.setText("your complete address goes here");
      f_Label23.setStyleName("" + get_res().myAppStyles().footerText() + "");


      return f_Label23;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2.
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
  }
}
