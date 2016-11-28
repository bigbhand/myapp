package com.bb.apps.myapp.client.views.navigation;

import com.bb.apps.myapp.client.IMyAppResources;
import com.bb.apps.myapp.client.Tabs;
import com.bb.apps.myapp.client.ui.navigation.INavBarView;
import com.bb.apps.myapp.client.widgets.NavBarItem;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class NavBarView extends Composite implements INavBarView {

	private static NavBarViewUiBinder uiBinder = GWT.create(NavBarViewUiBinder.class);

	interface NavBarViewUiBinder extends UiBinder<Widget, NavBarView> {
	}
	
	private INavBarView.INavBarPresenter presenter;
	
	@UiField NavBarItem homeTab;
	@UiField NavBarItem form1Tab;
	@UiField NavBarItem form2Tab;
	@UiField NavBarItem form3Tab;
	@UiField NavBarItem form4Tab;
	@UiField NavBarItem contactsTab;
	@UiField NavBarItem helpTab;

	public NavBarView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setPresenter(INavBarPresenter presenter) {
		this.presenter = presenter;
		
	}

	public INavBarPresenter getPresenter() {
		return presenter;
	}

	public void selectTab(Tabs tab) {
		
		switch(tab){
			case HOME : 
						homeTab.addStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form1Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form2Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form3Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form4Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						contactsTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						helpTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						break;
			case FORM1: 
						homeTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form1Tab.addStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form2Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form3Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form4Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						contactsTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						helpTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						break;
			case FORM2:
						homeTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form1Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form2Tab.addStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form3Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form4Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						contactsTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						helpTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						break;
			case FORM3:
						homeTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form1Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form2Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form3Tab.addStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form4Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						contactsTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						helpTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						break;
			case FORM4:
						homeTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form1Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form2Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form3Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form4Tab.addStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						contactsTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						helpTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						break;
			case CONACT:
						homeTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form1Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form2Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form3Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form4Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						contactsTab.addStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						helpTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						break;
			case HELP:
						homeTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form1Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form2Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form3Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						form4Tab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						contactsTab.removeStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						helpTab.addStyleName(IMyAppResources.CSS.myAppStyles().navBarItemActive());
						break;
			default:break;
		}
		
	}

	public void initializeView(boolean isAdminView) {
		
		if(isAdminView){
			homeTab.setVisible(true);
			form1Tab.setVisible(false);
			form2Tab.setVisible(false);
			form3Tab.setVisible(false);
			form4Tab.setVisible(false);
			contactsTab.setVisible(false);
			helpTab.setVisible(false);
		}else{
			homeTab.setVisible(true);
			form1Tab.setVisible(true);
			form2Tab.setVisible(true);
			form3Tab.setVisible(true);
			form4Tab.setVisible(true);
			contactsTab.setVisible(true);
			helpTab.setVisible(true);
		}
		
	}

}
