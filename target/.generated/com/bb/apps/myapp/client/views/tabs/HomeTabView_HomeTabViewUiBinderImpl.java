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

public class HomeTabView_HomeTabViewUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.bb.apps.myapp.client.views.tabs.HomeTabView>, com.bb.apps.myapp.client.views.tabs.HomeTabView.HomeTabViewUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>  <span id='{1}'></span>  <span id='{2}'></span>")
    SafeHtml html1(String arg0, String arg1, String arg2);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.bb.apps.myapp.client.views.tabs.HomeTabView owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.bb.apps.myapp.client.views.tabs.HomeTabView owner;


    public Widgets(final com.bb.apps.myapp.client.views.tabs.HomeTabView owner) {
      this.owner = owner;
      build_style();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 1 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.bb.apps.myapp.client.views.tabs.HomeTabView_HomeTabViewUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private com.bb.apps.myapp.client.views.tabs.HomeTabView_HomeTabViewUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final com.bb.apps.myapp.client.views.tabs.HomeTabView_HomeTabViewUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.bb.apps.myapp.client.views.tabs.HomeTabView_HomeTabViewUiBinderImpl_GenBundle) GWT.create(com.bb.apps.myapp.client.views.tabs.HomeTabView_HomeTabViewUiBinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for style called 0 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.bb.apps.myapp.client.views.tabs.HomeTabView_HomeTabViewUiBinderImpl_GenCss_style get_style() {
      return build_style();
    }
    private com.bb.apps.myapp.client.views.tabs.HomeTabView_HomeTabViewUiBinderImpl_GenCss_style build_style() {
      // Creation section.
      final com.bb.apps.myapp.client.views.tabs.HomeTabView_HomeTabViewUiBinderImpl_GenCss_style style = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().style();
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
      f_HTMLPanel1.setStyleName("" + get_res().myAppStyles().whiteCanvas() + "");
      f_HTMLPanel1.setHeight("350px");
      f_HTMLPanel1.setWidth("100%");

      // Attach section.
      UiBinderUtil.TempAttachment attachRecord1 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
      get_domId0Element().get();
      get_domId1Element().get();
      get_domId2Element().get();

      // Detach section.
      attachRecord1.detach();
      f_HTMLPanel1.addAndReplaceElement(get_homeNote(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_countryCombo(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_formPanel(), get_domId2Element().get());

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
     * Getter for homeNote called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.Label get_homeNote() {
      return build_homeNote();
    }
    private com.google.gwt.user.client.ui.Label build_homeNote() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label homeNote = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.


      this.owner.homeNote = homeNote;

      return homeNote;
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
     * Getter for countryCombo called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.sencha.gxt.widget.core.client.form.SimpleComboBox get_countryCombo() {
      return build_countryCombo();
    }
    private com.sencha.gxt.widget.core.client.form.SimpleComboBox build_countryCombo() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.form.SimpleComboBox countryCombo = owner.countryCombo;
      assert countryCombo != null : "UiField countryCombo with 'provided = true' was null";
      // Setup section.
      countryCombo.setAllowBlank(true);
      countryCombo.setForceSelection(true);


      return countryCombo;
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

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.


      return domId2;
    }

    /**
     * Getter for formPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FormPanel get_formPanel() {
      return build_formPanel();
    }
    private com.google.gwt.user.client.ui.FormPanel build_formPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.FormPanel formPanel = (com.google.gwt.user.client.ui.FormPanel) GWT.create(com.google.gwt.user.client.ui.FormPanel.class);
      // Setup section.
      formPanel.add(get_f_VerticalPanel2());


      this.owner.formPanel = formPanel;

      return formPanel;
    }

    /**
     * Getter for f_VerticalPanel2 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.VerticalPanel get_f_VerticalPanel2() {
      return build_f_VerticalPanel2();
    }
    private com.google.gwt.user.client.ui.VerticalPanel build_f_VerticalPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel2 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
      // Setup section.
      f_VerticalPanel2.add(get_fileUploader());
      f_VerticalPanel2.add(get_uploadButton());


      return f_VerticalPanel2;
    }

    /**
     * Getter for fileUploader called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.sencha.gxt.widget.core.client.form.FileUploadField get_fileUploader() {
      return build_fileUploader();
    }
    private com.sencha.gxt.widget.core.client.form.FileUploadField build_fileUploader() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.form.FileUploadField fileUploader = (com.sencha.gxt.widget.core.client.form.FileUploadField) GWT.create(com.sencha.gxt.widget.core.client.form.FileUploadField.class);
      // Setup section.
      fileUploader.setAllowBlank(false);
      fileUploader.setWidth("200");


      this.owner.fileUploader = fileUploader;

      return fileUploader;
    }

    /**
     * Getter for uploadButton called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.sencha.gxt.widget.core.client.button.TextButton get_uploadButton() {
      return build_uploadButton();
    }
    private com.sencha.gxt.widget.core.client.button.TextButton build_uploadButton() {
      // Creation section.
      final com.sencha.gxt.widget.core.client.button.TextButton uploadButton = (com.sencha.gxt.widget.core.client.button.TextButton) GWT.create(com.sencha.gxt.widget.core.client.button.TextButton.class);
      // Setup section.
      uploadButton.setText("Submit Form");
      uploadButton.setWidth("80px");


      this.owner.uploadButton = uploadButton;

      return uploadButton;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId2Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId2Element() {
      return domId2Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId2Element() {
      // Creation section.
      domId2Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId2());
      // Setup section.


      return domId2Element;
    }
  }
}
