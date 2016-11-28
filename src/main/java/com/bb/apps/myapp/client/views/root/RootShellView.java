package com.bb.apps.myapp.client.views.root;

import com.bb.apps.myapp.client.ui.root.IRootShellView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class RootShellView extends Composite implements IRootShellView {

	private static RootShellViewUiBinder uiBinder = GWT.create(RootShellViewUiBinder.class);

	interface RootShellViewUiBinder extends UiBinder<Widget, RootShellView> {
	}

	private IRootShellView.IRootShellPresenter presenter;
	
	@UiField HTMLPanel content;
	@UiField HTMLPanel header;
	@UiField HTMLPanel footer;
	@UiField HTMLPanel navBar;
	
	public RootShellView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setPresenter(IRootShellPresenter presenter) {
		this.presenter=presenter;
	}

	public IRootShellPresenter getPresenter() {
		return presenter;
	}

	public void setContent(Widget widget) {
		
		content.clear();
		content.add(widget);
		
	}

	public void setHeaderView(Widget widget) {
		header.clear();
		header.add(widget);
		
	}

	public void setFooterView(Widget widget) {
		footer.clear();
		footer.add(widget);
		
	}

	public void setNavBarView(Widget widget) {
		navBar.clear();
		navBar.add(widget);
		
	}

}
