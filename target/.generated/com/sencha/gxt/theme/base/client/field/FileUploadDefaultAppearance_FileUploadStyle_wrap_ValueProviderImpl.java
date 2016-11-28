package com.sencha.gxt.theme.base.client.field;

public class FileUploadDefaultAppearance_FileUploadStyle_wrap_ValueProviderImpl implements com.sencha.gxt.core.client.ValueProvider<com.sencha.gxt.theme.base.client.field.FileUploadDefaultAppearance.FileUploadStyle, java.lang.String> {
  public static final FileUploadDefaultAppearance_FileUploadStyle_wrap_ValueProviderImpl INSTANCE = new FileUploadDefaultAppearance_FileUploadStyle_wrap_ValueProviderImpl();
  public java.lang.String getValue(com.sencha.gxt.theme.base.client.field.FileUploadDefaultAppearance.FileUploadStyle object) {
    return object.wrap();
  }
  public void setValue(com.sencha.gxt.theme.base.client.field.FileUploadDefaultAppearance.FileUploadStyle object, java.lang.String value) {
    com.google.gwt.core.client.GWT.log("Setter was called on ValueProvider, but no setter exists.", new RuntimeException());
  }
  public String getPath() {
    return "wrap";
  }
}
