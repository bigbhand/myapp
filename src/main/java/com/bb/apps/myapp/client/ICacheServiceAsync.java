package com.bb.apps.myapp.client;

import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ICacheServiceAsync {

	void getReferenceMap(List<String> refAttributes, AsyncCallback<Map<String, List<String>>> callback);

}
