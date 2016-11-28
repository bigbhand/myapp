package com.bb.apps.myapp.client;

import com.mvp4g.client.annotation.EventHandler;
import com.mvp4g.client.event.BaseEventHandler;

@EventHandler
public class MainPresenter extends BaseEventHandler<MyAppEventBus> {

	public void bind()
	{
		
		//wesso integration happens here
		eventBus.doSelectLoginPage();
		System.out.println("App Loaded..");
	}
}
