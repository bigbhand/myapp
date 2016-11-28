package com.bb.apps.myapp.client;

import com.google.gwt.core.client.GWT;
import com.mvp4g.client.com_mvp4g_client_Mvp4gModuleImpl_com_mvp4g_client_Mvp4gModuleGinjector_com_mvp4g_client_Mvp4gModuleGinjectorGinjector;

public class com_mvp4g_client_Mvp4gModuleImpl_com_mvp4g_client_Mvp4gModuleGinjector_com_mvp4g_client_Mvp4gModuleGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$bb$apps$myapp$client$MainPresenter$_annotation$$none$$(com.bb.apps.myapp.client.MainPresenter injectee) {
    
  }
  
  public void memberInject_Key$type$com$bb$apps$myapp$client$ICacheServiceAsync$_annotation$$none$$(com.bb.apps.myapp.client.ICacheServiceAsync injectee) {
    
  }
  
  public void memberInject_Key$type$com$bb$apps$myapp$client$GreetingServiceAsync$_annotation$$none$$(com.bb.apps.myapp.client.GreetingServiceAsync injectee) {
    
  }
  
  
  /**
   * Binding for com.bb.apps.myapp.client.MainPresenter declared at:
   *   Implicit GWT.create binding for com.bb.apps.myapp.client.MainPresenter
   */
  public com.bb.apps.myapp.client.MainPresenter get_Key$type$com$bb$apps$myapp$client$MainPresenter$_annotation$$none$$() {
    Object created = GWT.create(com.bb.apps.myapp.client.MainPresenter.class);
    assert created instanceof com.bb.apps.myapp.client.MainPresenter;
    com.bb.apps.myapp.client.MainPresenter result = (com.bb.apps.myapp.client.MainPresenter) created;
    
    memberInject_Key$type$com$bb$apps$myapp$client$MainPresenter$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.bb.apps.myapp.client.ICacheServiceAsync singleton_Key$type$com$bb$apps$myapp$client$ICacheServiceAsync$_annotation$$none$$ = null;
  
  public com.bb.apps.myapp.client.ICacheServiceAsync get_Key$type$com$bb$apps$myapp$client$ICacheServiceAsync$_annotation$$none$$() {
    
    if (singleton_Key$type$com$bb$apps$myapp$client$ICacheServiceAsync$_annotation$$none$$ == null) {
    Object created = GWT.create(com.bb.apps.myapp.client.ICacheService.class);
    assert created instanceof com.bb.apps.myapp.client.ICacheServiceAsync;
    com.bb.apps.myapp.client.ICacheServiceAsync result = (com.bb.apps.myapp.client.ICacheServiceAsync) created;
    
    memberInject_Key$type$com$bb$apps$myapp$client$ICacheServiceAsync$_annotation$$none$$(result);
    
        singleton_Key$type$com$bb$apps$myapp$client$ICacheServiceAsync$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$bb$apps$myapp$client$ICacheServiceAsync$_annotation$$none$$;
    
  }
  
  private com.bb.apps.myapp.client.GreetingServiceAsync singleton_Key$type$com$bb$apps$myapp$client$GreetingServiceAsync$_annotation$$none$$ = null;
  
  public com.bb.apps.myapp.client.GreetingServiceAsync get_Key$type$com$bb$apps$myapp$client$GreetingServiceAsync$_annotation$$none$$() {
    
    if (singleton_Key$type$com$bb$apps$myapp$client$GreetingServiceAsync$_annotation$$none$$ == null) {
    Object created = GWT.create(com.bb.apps.myapp.client.GreetingService.class);
    assert created instanceof com.bb.apps.myapp.client.GreetingServiceAsync;
    com.bb.apps.myapp.client.GreetingServiceAsync result = (com.bb.apps.myapp.client.GreetingServiceAsync) created;
    
    memberInject_Key$type$com$bb$apps$myapp$client$GreetingServiceAsync$_annotation$$none$$(result);
    
        singleton_Key$type$com$bb$apps$myapp$client$GreetingServiceAsync$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$bb$apps$myapp$client$GreetingServiceAsync$_annotation$$none$$;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_mvp4g_client_Mvp4gModuleImpl_com_mvp4g_client_Mvp4gModuleGinjector_com_mvp4g_client_Mvp4gModuleGinjectorGinjector injector;
  public com_mvp4g_client_Mvp4gModuleImpl_com_mvp4g_client_Mvp4gModuleGinjector_com_mvp4g_client_Mvp4gModuleGinjectorGinjector_fragment(com_mvp4g_client_Mvp4gModuleImpl_com_mvp4g_client_Mvp4gModuleGinjector_com_mvp4g_client_Mvp4gModuleGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
