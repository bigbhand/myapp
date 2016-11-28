package com.bb.apps.myapp.client.views.tabs;

import java.util.List;
import java.util.Map;

import com.bb.apps.myapp.client.ApplicationSession;
import com.bb.apps.myapp.client.IMyAppConstants;
import com.bb.apps.myapp.client.MyAppUtility;
import com.bb.apps.myapp.client.Tabs;
import com.bb.apps.myapp.client.messages.MyAppMessages;
import com.bb.apps.myapp.client.ui.tabs.IHomeTabView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.FormPanel.SubmitCompleteEvent;
import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.NamedNodeMap;
import com.google.gwt.xml.client.Node;
import com.google.gwt.xml.client.NodeList;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.data.shared.StringLabelProvider;
import com.sencha.gxt.widget.core.client.button.TextButton;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.form.FileUploadField;
import com.sencha.gxt.widget.core.client.form.SimpleComboBox;

public class HomeTabView extends Composite implements IHomeTabView {

	private static HomeTabViewUiBinder uiBinder = GWT.create(HomeTabViewUiBinder.class);

	interface HomeTabViewUiBinder extends UiBinder<Widget, HomeTabView> {
	}

	private IHomeTabView.IHomeTabPresenter presenter;
	private MyAppMessages msg = GWT.create(MyAppMessages.class);
	
	@UiField Label homeNote;
	@UiField (provided = true)
	SimpleComboBox<String> countryCombo;
	@UiField FileUploadField fileUploader;
	@UiField TextButton uploadButton;
	@UiField FormPanel formPanel;

	public HomeTabView() {
		countryCombo = new SimpleComboBox<String>(new StringLabelProvider<String>());
		initWidget(uiBinder.createAndBindUi(this));
		bind();
	}

	private void bind()
	{
		
		formPanel.setEncoding(FormPanel.ENCODING_MULTIPART);
		formPanel.setMethod(FormPanel.METHOD_POST);
		
		fileUploader.addChangeHandler(new ChangeHandler() {
			
			public void onChange(ChangeEvent event) {
				
				String path = fileUploader.getValue();
				
				if(path != null){
					
					String[] pathParts = path.split("\\\\");
					String fileName = pathParts[pathParts.length-1];
					String extension = fileName.substring(fileName.lastIndexOf("."));
					
					if(!extension.equals(".doc") && !extension.equals(".png")){
						Window.alert("Choose proper file!!");
						fileUploader.clear();
						fileUploader.focus();
					}
				}
			}
		});
	      
		uploadButton.addSelectHandler(new SelectHandler() {
			
			public void onSelect(SelectEvent event) {
				
					String filename = fileUploader.getValue();
		            if (filename.length() == 0) {
		               Window.alert("No File Specified!");
		            } else {
		               formPanel.setAction(GWT.getModuleBaseURL()+"fileUpload?user="+ApplicationSession.getUser().getUsername());
		               formPanel.submit();			          
		            }	
				
			}
		});
		
		formPanel.addSubmitCompleteHandler(new FormPanel.SubmitCompleteHandler() {
	         public void onSubmitComplete(SubmitCompleteEvent event) {
	        	 
	        	 if(event.getResults()!=null && event.getResults().equalsIgnoreCase("Success"))
	        	 {
	        		 Window.alert("File uploaded Successfully!!");
	        	 }
	        	 else
	        	 {
	        		 Window.alert("ERROR : While uploading File..");
	        	 }
				
			}
	      });
	}

	public void setPresenter(IHomeTabPresenter presenter) {
		this.presenter = presenter;
		
	}

	public IHomeTabPresenter getPresenter() {
		return presenter;
	}

	public void initializeFields() {
		homeNote.setText(msg.homeMessage(ApplicationSession.getUser().getUsername(), Tabs.HOME.toString(), LocaleInfo.getCurrentLocale().getLocaleName()));
		
	}


	public void setCacheAttributes(Map<String, List<String>> combomap) {
		
		if(combomap!=null)
		{
			countryCombo.getStore().clear();
			countryCombo.getStore().addAll(combomap.get(IMyAppConstants.CACHE_COUNTRY));
		}
		
	}

}
