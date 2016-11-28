package com.bb.apps.myapp.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;
import com.google.gwt.resources.client.ImageResource;

public interface IMyAppResources extends ClientBundle {

	IMyAppResources CSS = GWT.create(IMyAppResources.class);
	
	@NotStrict
	@Source("css/MyAppStyles.css")
	public MyAppCssStyles myAppStyles();
	
	@NotStrict
	@Source("images/theme-header.png")
	ImageResource themeHeader();
	
	@NotStrict
	@Source("images/app-name.png")
	ImageResource appName();
	
	@NotStrict
	@Source("images/app-logo.png")
	ImageResource appLogo();
	
	public interface MyAppCssStyles extends CssResource{
		
		String themeBackground();
		
		String centerBodyAlign();
		
		String whiteCanvas();
		
		String selectedTabTextStyle();
		
		String welcomeNote();
		
		String headerLinkStyle();
		
		String headerTextStyle();
		
		String navBarItem();
		
		String navBarItemActive();
		
		String footerBox();
		
		String footerHeaader();
		
		String footerLink();
		
		String footerContet();
		
		String footerText();
		
		String loginBackground();
		
		String loginHeader();
		
		String navBarPanel();
		
	}
}
