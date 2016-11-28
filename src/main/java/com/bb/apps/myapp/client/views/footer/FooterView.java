package com.bb.apps.myapp.client.views.footer;

import com.bb.apps.myapp.client.ui.footer.IFooterView;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class FooterView extends Composite implements IFooterView {

	private static FooterViewUiBinder uiBinder = GWT.create(FooterViewUiBinder.class);

	interface FooterViewUiBinder extends UiBinder<Widget, FooterView> {
	}
	
	private IFooterView.IFooterPresenter presenter;

	public FooterView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public void setPresenter(IFooterPresenter presenter) {
		this.presenter = presenter;
		
	}

	public IFooterPresenter getPresenter() {
		return presenter;
	}

	
}
