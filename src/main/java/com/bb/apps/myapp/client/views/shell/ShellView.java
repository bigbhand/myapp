package com.bb.apps.myapp.client.views.shell;

import com.bb.apps.myapp.client.ui.shell.IShellView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.container.FlowLayoutContainer;

public class ShellView extends Composite implements IShellView {

	private static ShellViewUiBinder uiBinder = GWT.create(ShellViewUiBinder.class);

	interface ShellViewUiBinder extends UiBinder<Widget, ShellView> {
	}
	
	private IShellView.IShellPresenter presenter;
	
	@UiField Label selectedTab;
	@UiField FlowLayoutContainer centerBody;

	public ShellView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setPresenter(IShellPresenter presenter) {
		this.presenter = presenter;
	}

	public IShellPresenter getPresenter() {
		return presenter;
	}
	
	public void setSelectedTabText(String tabText) {
		
		selectedTab.setText(tabText);
	}

	public void setCenterBodyView(Widget widget) {
		
		centerBody.clear();
		centerBody.add(widget);
		
	}

}
