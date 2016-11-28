package com.bb.apps.myapp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.Window.ClosingEvent;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.Mvp4gModule;

public class MyApp implements EntryPoint {

  public void onModuleLoad() {

	  //Inject clinet bundle resources
	  IMyAppResources.CSS.myAppStyles().ensureInjected();
	  
	  //Inject ADK related styles (if-needed)
	  
	  Window.addWindowClosingHandler(new Window.ClosingHandler() {
		
		public void onWindowClosing(ClosingEvent event) {
			
				event.setMessage("You are about to leave! Are you sure you want to close the application?");
			
		}
	  });
	  
	  Mvp4gModule module = GWT.create(Mvp4gModule.class);
	  module.createAndStartModule();
	  RootLayoutPanel.get().add((Widget)module.getStartView());
  }
}
