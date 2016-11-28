package com.bb.apps.myapp.client;

import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("cache")
public interface ICacheService extends RemoteService{

	Map<String,List<String>> getReferenceMap(List<String> refAttributes);
}
