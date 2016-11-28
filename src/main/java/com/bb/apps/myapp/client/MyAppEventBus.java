package com.bb.apps.myapp.client;

import java.util.List;
import java.util.Map;

import com.bb.apps.myapp.client.ui.footer.FooterPresenter;
import com.bb.apps.myapp.client.ui.header.HeaderPresenter;
import com.bb.apps.myapp.client.ui.navigation.NavBarPresenter;
import com.bb.apps.myapp.client.ui.root.RootShellPresenter;
import com.bb.apps.myapp.client.ui.shell.ShellPresenter;
import com.bb.apps.myapp.client.ui.tabs.AdminHomePresenter;
import com.bb.apps.myapp.client.ui.tabs.HomeTabPresenter;
import com.bb.apps.myapp.client.ui.tabs.LoginPresenter;
import com.google.gwt.user.client.ui.Widget;
import com.mvp4g.client.annotation.Event;
import com.mvp4g.client.annotation.Events;
import com.mvp4g.client.annotation.InitHistory;
import com.mvp4g.client.annotation.Start;
import com.mvp4g.client.event.EventBus;

@Events(startPresenter=RootShellPresenter.class,historyOnStart=true,ginModules=MyAppGinModule.class)
public interface MyAppEventBus extends EventBus{

	@InitHistory
	@Start
	@Event(bind = MainPresenter.class)
	public void start();

	@Event(handlers = HeaderPresenter.class)
	public void prepareHeaderView();

	@Event(handlers = RootShellPresenter.class)
	public void setHeaderView(Widget widget);

	@Event(handlers = FooterPresenter.class)
	public void prepareFooterView();

	@Event(handlers = RootShellPresenter.class)
	public void setFooterView(Widget widget);

	@Event(handlers = NavBarPresenter.class)
	public void prepareNavBarView();
	
	@Event(handlers = RootShellPresenter.class)
	public void setNavBarView(Widget widget);
	
	@Event(handlers = ShellPresenter.class)
	public void setCeneterBodyView(Widget asWidget);
	
	@Event(handlers = ShellPresenter.class)
	public void setSelectedTabText(String tabText);

	@Event(handlers = ShellPresenter.class)
	public void doSelectHomeView();

	@Event(handlers = HomeTabPresenter.class)
	public void getHomeView();

	@Event(handlers = RootShellPresenter.class)
	public void setRooContentBodyView(Widget widget);

	@Event(handlers = NavBarPresenter.class)
	public void setSelectedTab(Tabs tab);

	@Event(handlers = ShellPresenter.class)
	public void doSelectLoginPage();

	@Event(handlers = LoginPresenter.class)
	public void getLoginView();

	@Event(handlers = ShellPresenter.class)
	public void doSelectAdminHomeScreen();

	@Event(handlers = NavBarPresenter.class)
	public void prepareAdminNavBarView();

	@Event(handlers = AdminHomePresenter.class)
	public void getAdminHomeView();

	@Event(handlers = {HomeTabPresenter.class, AdminHomePresenter.class})
	public void setComboMap(Map<String, List<String>> comboMap);

	@Event(handlers = HomeTabPresenter.class)
	public void getReferenceMap();

}
