package com.mvp4g.client;

import com.mvp4g.client.history.PlaceService;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.mvp4g.client.presenter.PresenterInterface;
import com.mvp4g.client.event.EventBus;
import com.mvp4g.client.Mvp4gException;
import com.mvp4g.client.history.HistoryConverter;
import com.mvp4g.client.Mvp4gEventPasser;
import com.mvp4g.client.Mvp4gModule;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.mvp4g.client.event.BaseEventBus;
import com.mvp4g.client.event.EventFilter;
import com.mvp4g.client.event.EventHandlerInterface;
import java.util.List;
import com.mvp4g.client.history.NavigationEventCommand;
import com.mvp4g.client.history.NavigationConfirmationInterface;
import com.google.gwt.core.client.RunAsyncCallback;
import com.mvp4g.client.Mvp4gRunAsync;
import com.google.gwt.user.client.Command;

public class Mvp4gModuleImpl implements Mvp4gModule {
    
    private abstract class AbstractEventBus extends com.mvp4g.client.event.BaseEventBus implements com.bb.apps.myapp.client.MyAppEventBus{}
    
    @GinModules({com.bb.apps.myapp.client.MyAppGinModule.class})
    public interface com_mvp4g_client_Mvp4gModuleGinjector extends Ginjector {
      com.bb.apps.myapp.client.ui.navigation.NavBarPresenter getcom_bb_apps_myapp_client_ui_navigation_NavBarPresenter();
      com.bb.apps.myapp.client.ui.shell.ShellPresenter getcom_bb_apps_myapp_client_ui_shell_ShellPresenter();
      com.bb.apps.myapp.client.ui.header.HeaderPresenter getcom_bb_apps_myapp_client_ui_header_HeaderPresenter();
      com.bb.apps.myapp.client.ui.footer.FooterPresenter getcom_bb_apps_myapp_client_ui_footer_FooterPresenter();
      com.bb.apps.myapp.client.ui.tabs.AdminHomePresenter getcom_bb_apps_myapp_client_ui_tabs_AdminHomePresenter();
      com.bb.apps.myapp.client.ui.tabs.LoginPresenter getcom_bb_apps_myapp_client_ui_tabs_LoginPresenter();
      com.bb.apps.myapp.client.ui.tabs.HomeTabPresenter getcom_bb_apps_myapp_client_ui_tabs_HomeTabPresenter();
      com.bb.apps.myapp.client.ui.root.RootShellPresenter getcom_bb_apps_myapp_client_ui_root_RootShellPresenter();
      com.bb.apps.myapp.client.MainPresenter getcom_bb_apps_myapp_client_MainPresenter();
      com.bb.apps.myapp.client.ui.footer.IFooterView getcom_bb_apps_myapp_client_ui_footer_FooterPresenterView();
      com.bb.apps.myapp.client.ui.tabs.IHomeTabView getcom_bb_apps_myapp_client_ui_tabs_HomeTabPresenterView();
      com.bb.apps.myapp.client.ui.navigation.INavBarView getcom_bb_apps_myapp_client_ui_navigation_NavBarPresenterView();
      com.bb.apps.myapp.client.ui.tabs.IAdminHomeView getcom_bb_apps_myapp_client_ui_tabs_AdminHomePresenterView();
      com.bb.apps.myapp.client.ui.header.IHeaderView getcom_bb_apps_myapp_client_ui_header_HeaderPresenterView();
      com.bb.apps.myapp.client.ui.tabs.ILoginView getcom_bb_apps_myapp_client_ui_tabs_LoginPresenterView();
      com.bb.apps.myapp.client.ui.shell.IShellView getcom_bb_apps_myapp_client_ui_shell_ShellPresenterView();
      com.bb.apps.myapp.client.ui.root.IRootShellView getcom_bb_apps_myapp_client_ui_root_RootShellPresenterView();
      com.mvp4g.client.history.PlaceService getcom_mvp4g_client_history_PlaceService();
    }
    private Object startView = null;
    private PresenterInterface startPresenter = null;
    protected AbstractEventBus eventBus = null;
    protected com_mvp4g_client_Mvp4gModuleGinjector injector = null;
    protected com.mvp4g.client.Mvp4gModule itself = this;
    private PlaceService placeService = null;
    public void setParentModule(com.mvp4g.client.Mvp4gModule module){}
    public void loadChildModule(String childModuleClassName, String eventName, boolean passive, Mvp4gEventPasser passer){
    }
    public void addConverter(String historyName, HistoryConverter<?> hc){
      placeService.addConverter(historyName, hc);
    }
    public void clearHistory(){
      placeService.clearHistory();
    }
    public String place(String token, String form, boolean onlyToken){
      return placeService.place( token, form, onlyToken );
    }
    public void dispatchHistoryEvent(String eventType, final Mvp4gEventPasser passer){
      int index = eventType.indexOf(PlaceService.MODULE_SEPARATOR);
      if(index > -1){
        String moduleHistoryName = eventType.substring(0, index);
        String nextToken = eventType.substring(index + 1);
        Mvp4gEventPasser nextPasser = new Mvp4gEventPasser(nextToken) {
          public void pass(Mvp4gModule module) {
            module.dispatchHistoryEvent((String) eventObjects[0], passer);
          }
        };
        passer.setEventObject(false);
        passer.pass(this);
      }else{
        passer.pass(this);
      }
    }
    public void sendInitEvent(){
      eventBus.start();
    }
    public void sendNotFoundEvent(){
      eventBus.start();
    }
    
    public void onForward(){
    }
    
    public void createAndStartModule(){
      injector = GWT.create( com_mvp4g_client_Mvp4gModuleGinjector.class );
      final com.bb.apps.myapp.client.ui.footer.IFooterView com_bb_apps_myapp_client_ui_footer_FooterPresenterView = injector.getcom_bb_apps_myapp_client_ui_footer_FooterPresenterView();
      final com.bb.apps.myapp.client.ui.tabs.IHomeTabView com_bb_apps_myapp_client_ui_tabs_HomeTabPresenterView = injector.getcom_bb_apps_myapp_client_ui_tabs_HomeTabPresenterView();
      final com.bb.apps.myapp.client.ui.navigation.INavBarView com_bb_apps_myapp_client_ui_navigation_NavBarPresenterView = injector.getcom_bb_apps_myapp_client_ui_navigation_NavBarPresenterView();
      final com.bb.apps.myapp.client.ui.tabs.IAdminHomeView com_bb_apps_myapp_client_ui_tabs_AdminHomePresenterView = injector.getcom_bb_apps_myapp_client_ui_tabs_AdminHomePresenterView();
      final com.bb.apps.myapp.client.ui.header.IHeaderView com_bb_apps_myapp_client_ui_header_HeaderPresenterView = injector.getcom_bb_apps_myapp_client_ui_header_HeaderPresenterView();
      final com.bb.apps.myapp.client.ui.tabs.ILoginView com_bb_apps_myapp_client_ui_tabs_LoginPresenterView = injector.getcom_bb_apps_myapp_client_ui_tabs_LoginPresenterView();
      final com.bb.apps.myapp.client.ui.shell.IShellView com_bb_apps_myapp_client_ui_shell_ShellPresenterView = injector.getcom_bb_apps_myapp_client_ui_shell_ShellPresenterView();
      final com.bb.apps.myapp.client.ui.root.IRootShellView com_bb_apps_myapp_client_ui_root_RootShellPresenterView = injector.getcom_bb_apps_myapp_client_ui_root_RootShellPresenterView();
      
      
      
      placeService = injector.getcom_mvp4g_client_history_PlaceService();
      
      final com.bb.apps.myapp.client.ui.navigation.NavBarPresenter com_bb_apps_myapp_client_ui_navigation_NavBarPresenter = injector.getcom_bb_apps_myapp_client_ui_navigation_NavBarPresenter();
      com_bb_apps_myapp_client_ui_navigation_NavBarPresenter.setView(com_bb_apps_myapp_client_ui_navigation_NavBarPresenterView);
      com_bb_apps_myapp_client_ui_navigation_NavBarPresenterView.setPresenter(com_bb_apps_myapp_client_ui_navigation_NavBarPresenter);
      final com.bb.apps.myapp.client.ui.shell.ShellPresenter com_bb_apps_myapp_client_ui_shell_ShellPresenter = injector.getcom_bb_apps_myapp_client_ui_shell_ShellPresenter();
      com_bb_apps_myapp_client_ui_shell_ShellPresenter.setView(com_bb_apps_myapp_client_ui_shell_ShellPresenterView);
      com_bb_apps_myapp_client_ui_shell_ShellPresenterView.setPresenter(com_bb_apps_myapp_client_ui_shell_ShellPresenter);
      final com.bb.apps.myapp.client.ui.header.HeaderPresenter com_bb_apps_myapp_client_ui_header_HeaderPresenter = injector.getcom_bb_apps_myapp_client_ui_header_HeaderPresenter();
      com_bb_apps_myapp_client_ui_header_HeaderPresenter.setView(com_bb_apps_myapp_client_ui_header_HeaderPresenterView);
      com_bb_apps_myapp_client_ui_header_HeaderPresenterView.setPresenter(com_bb_apps_myapp_client_ui_header_HeaderPresenter);
      final com.bb.apps.myapp.client.ui.footer.FooterPresenter com_bb_apps_myapp_client_ui_footer_FooterPresenter = injector.getcom_bb_apps_myapp_client_ui_footer_FooterPresenter();
      com_bb_apps_myapp_client_ui_footer_FooterPresenter.setView(com_bb_apps_myapp_client_ui_footer_FooterPresenterView);
      com_bb_apps_myapp_client_ui_footer_FooterPresenterView.setPresenter(com_bb_apps_myapp_client_ui_footer_FooterPresenter);
      final com.bb.apps.myapp.client.ui.tabs.AdminHomePresenter com_bb_apps_myapp_client_ui_tabs_AdminHomePresenter = injector.getcom_bb_apps_myapp_client_ui_tabs_AdminHomePresenter();
      com_bb_apps_myapp_client_ui_tabs_AdminHomePresenter.setView(com_bb_apps_myapp_client_ui_tabs_AdminHomePresenterView);
      com_bb_apps_myapp_client_ui_tabs_AdminHomePresenterView.setPresenter(com_bb_apps_myapp_client_ui_tabs_AdminHomePresenter);
      final com.bb.apps.myapp.client.ui.tabs.LoginPresenter com_bb_apps_myapp_client_ui_tabs_LoginPresenter = injector.getcom_bb_apps_myapp_client_ui_tabs_LoginPresenter();
      com_bb_apps_myapp_client_ui_tabs_LoginPresenter.setView(com_bb_apps_myapp_client_ui_tabs_LoginPresenterView);
      com_bb_apps_myapp_client_ui_tabs_LoginPresenterView.setPresenter(com_bb_apps_myapp_client_ui_tabs_LoginPresenter);
      final com.bb.apps.myapp.client.ui.tabs.HomeTabPresenter com_bb_apps_myapp_client_ui_tabs_HomeTabPresenter = injector.getcom_bb_apps_myapp_client_ui_tabs_HomeTabPresenter();
      com_bb_apps_myapp_client_ui_tabs_HomeTabPresenter.setView(com_bb_apps_myapp_client_ui_tabs_HomeTabPresenterView);
      com_bb_apps_myapp_client_ui_tabs_HomeTabPresenterView.setPresenter(com_bb_apps_myapp_client_ui_tabs_HomeTabPresenter);
      final com.bb.apps.myapp.client.ui.root.RootShellPresenter com_bb_apps_myapp_client_ui_root_RootShellPresenter = injector.getcom_bb_apps_myapp_client_ui_root_RootShellPresenter();
      com_bb_apps_myapp_client_ui_root_RootShellPresenter.setView(com_bb_apps_myapp_client_ui_root_RootShellPresenterView);
      com_bb_apps_myapp_client_ui_root_RootShellPresenterView.setPresenter(com_bb_apps_myapp_client_ui_root_RootShellPresenter);
      
      final com.bb.apps.myapp.client.MainPresenter com_bb_apps_myapp_client_MainPresenter = injector.getcom_bb_apps_myapp_client_MainPresenter();
      
      eventBus = new AbstractEventBus(){
        protected <T extends EventHandlerInterface<?>> T createHandler( Class<T> handlerClass ){
        return null;
        }
        public void setNavBarView(com.google.gwt.user.client.ui.Widget attr0){
          if (com_bb_apps_myapp_client_ui_root_RootShellPresenter.isActivated(false, "setNavBarView", new Object[]{attr0})){
            com_bb_apps_myapp_client_ui_root_RootShellPresenter.onSetNavBarView(attr0);
          }
        }
        public void getAdminHomeView(){
          if (com_bb_apps_myapp_client_ui_tabs_AdminHomePresenter.isActivated(false, "getAdminHomeView")){
            com_bb_apps_myapp_client_ui_tabs_AdminHomePresenter.onGetAdminHomeView();
          }
        }
        public void doSelectLoginPage(){
          if (com_bb_apps_myapp_client_ui_shell_ShellPresenter.isActivated(false, "doSelectLoginPage")){
            com_bb_apps_myapp_client_ui_shell_ShellPresenter.onDoSelectLoginPage();
          }
        }
        public void prepareHeaderView(){
          if (com_bb_apps_myapp_client_ui_header_HeaderPresenter.isActivated(false, "prepareHeaderView")){
            com_bb_apps_myapp_client_ui_header_HeaderPresenter.onPrepareHeaderView();
          }
        }
        public void setHeaderView(com.google.gwt.user.client.ui.Widget attr0){
          if (com_bb_apps_myapp_client_ui_root_RootShellPresenter.isActivated(false, "setHeaderView", new Object[]{attr0})){
            com_bb_apps_myapp_client_ui_root_RootShellPresenter.onSetHeaderView(attr0);
          }
        }
        public void doSelectHomeView(){
          if (com_bb_apps_myapp_client_ui_shell_ShellPresenter.isActivated(false, "doSelectHomeView")){
            com_bb_apps_myapp_client_ui_shell_ShellPresenter.onDoSelectHomeView();
          }
        }
        public void setSelectedTab(com.bb.apps.myapp.client.Tabs attr0){
          if (com_bb_apps_myapp_client_ui_navigation_NavBarPresenter.isActivated(false, "setSelectedTab", new Object[]{attr0})){
            com_bb_apps_myapp_client_ui_navigation_NavBarPresenter.onSetSelectedTab(attr0);
          }
        }
        public void setSelectedTabText(java.lang.String attr0){
          if (com_bb_apps_myapp_client_ui_shell_ShellPresenter.isActivated(false, "setSelectedTabText", new Object[]{attr0})){
            com_bb_apps_myapp_client_ui_shell_ShellPresenter.onSetSelectedTabText(attr0);
          }
        }
        public void doSelectAdminHomeScreen(){
          if (com_bb_apps_myapp_client_ui_shell_ShellPresenter.isActivated(false, "doSelectAdminHomeScreen")){
            com_bb_apps_myapp_client_ui_shell_ShellPresenter.onDoSelectAdminHomeScreen();
          }
        }
        public void prepareAdminNavBarView(){
          if (com_bb_apps_myapp_client_ui_navigation_NavBarPresenter.isActivated(false, "prepareAdminNavBarView")){
            com_bb_apps_myapp_client_ui_navigation_NavBarPresenter.onPrepareAdminNavBarView();
          }
        }
        public void setRooContentBodyView(com.google.gwt.user.client.ui.Widget attr0){
          if (com_bb_apps_myapp_client_ui_root_RootShellPresenter.isActivated(false, "setRooContentBodyView", new Object[]{attr0})){
            com_bb_apps_myapp_client_ui_root_RootShellPresenter.onSetRooContentBodyView(attr0);
          }
        }
        public void getHomeView(){
          if (com_bb_apps_myapp_client_ui_tabs_HomeTabPresenter.isActivated(false, "getHomeView")){
            com_bb_apps_myapp_client_ui_tabs_HomeTabPresenter.onGetHomeView();
          }
        }
        public void start(){
          com_bb_apps_myapp_client_MainPresenter.isActivated(false, "start");
        }
        public void setFooterView(com.google.gwt.user.client.ui.Widget attr0){
          if (com_bb_apps_myapp_client_ui_root_RootShellPresenter.isActivated(false, "setFooterView", new Object[]{attr0})){
            com_bb_apps_myapp_client_ui_root_RootShellPresenter.onSetFooterView(attr0);
          }
        }
        public void setComboMap(java.util.Map attr0){
          if (com_bb_apps_myapp_client_ui_tabs_HomeTabPresenter.isActivated(false, "setComboMap", new Object[]{attr0})){
            com_bb_apps_myapp_client_ui_tabs_HomeTabPresenter.onSetComboMap(attr0);
          }
          if (com_bb_apps_myapp_client_ui_tabs_AdminHomePresenter.isActivated(false, "setComboMap", new Object[]{attr0})){
            com_bb_apps_myapp_client_ui_tabs_AdminHomePresenter.onSetComboMap(attr0);
          }
        }
        public void getReferenceMap(){
          if (com_bb_apps_myapp_client_ui_tabs_HomeTabPresenter.isActivated(false, "getReferenceMap")){
            com_bb_apps_myapp_client_ui_tabs_HomeTabPresenter.onGetReferenceMap();
          }
        }
        public void setCeneterBodyView(com.google.gwt.user.client.ui.Widget attr0){
          if (com_bb_apps_myapp_client_ui_shell_ShellPresenter.isActivated(false, "setCeneterBodyView", new Object[]{attr0})){
            com_bb_apps_myapp_client_ui_shell_ShellPresenter.onSetCeneterBodyView(attr0);
          }
        }
        public void prepareFooterView(){
          if (com_bb_apps_myapp_client_ui_footer_FooterPresenter.isActivated(false, "prepareFooterView")){
            com_bb_apps_myapp_client_ui_footer_FooterPresenter.onPrepareFooterView();
          }
        }
        public void prepareNavBarView(){
          if (com_bb_apps_myapp_client_ui_navigation_NavBarPresenter.isActivated(false, "prepareNavBarView")){
            com_bb_apps_myapp_client_ui_navigation_NavBarPresenter.onPrepareNavBarView();
          }
        }
        public void getLoginView(){
          if (com_bb_apps_myapp_client_ui_tabs_LoginPresenter.isActivated(false, "getLoginView")){
            com_bb_apps_myapp_client_ui_tabs_LoginPresenter.onGetLoginView();
          }
        }
        public void setNavigationConfirmation( NavigationConfirmationInterface navigationConfirmation ) {
          placeService.setNavigationConfirmation(navigationConfirmation);
        }
        public void confirmNavigation(NavigationEventCommand event){
          placeService.confirmEvent(event);
        }
        public void setApplicationHistoryStored( boolean historyStored ){
          placeService.setEnabled(historyStored);
        }
        };
        
        com_bb_apps_myapp_client_ui_navigation_NavBarPresenter.setEventBus(eventBus);
        com_bb_apps_myapp_client_ui_shell_ShellPresenter.setEventBus(eventBus);
        com_bb_apps_myapp_client_ui_header_HeaderPresenter.setEventBus(eventBus);
        com_bb_apps_myapp_client_ui_footer_FooterPresenter.setEventBus(eventBus);
        com_bb_apps_myapp_client_ui_tabs_AdminHomePresenter.setEventBus(eventBus);
        com_bb_apps_myapp_client_ui_tabs_LoginPresenter.setEventBus(eventBus);
        com_bb_apps_myapp_client_ui_tabs_HomeTabPresenter.setEventBus(eventBus);
        com_bb_apps_myapp_client_ui_root_RootShellPresenter.setEventBus(eventBus);
        com_bb_apps_myapp_client_MainPresenter.setEventBus(eventBus);
        placeService.setModule(itself);
        
        this.startPresenter = com_bb_apps_myapp_client_ui_root_RootShellPresenter;
        this.startView = startPresenter.getView();
        eventBus.start();
        History.fireCurrentHistoryState();
      }
      public Object getStartView(){
        if (startPresenter != null) {
          startPresenter.setActivated(true);
          startPresenter.isActivated(false, null);
        }return startView;
      }
      
      public EventBus getEventBus(){
        return eventBus;
      }
    }
