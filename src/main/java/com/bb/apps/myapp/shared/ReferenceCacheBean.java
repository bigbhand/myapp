package com.bb.apps.myapp.shared;

import java.util.List;

public class ReferenceCacheBean {

	private String referenceKey;
	private List<String> referenceValueList;
	
	public ReferenceCacheBean() {
		super();
	}
	
	public ReferenceCacheBean(String refereneceKey, List<String> referenceValueList) {
		super();
		this.referenceKey = refereneceKey;
		this.referenceValueList = referenceValueList;
	}

	public String getRefereneceKey() {
		return referenceKey;
	}

	public void setRefereneceKey(String refereneceKey) {
		this.referenceKey = refereneceKey;
	}

	public List<String> getReferenceValueList() {
		return referenceValueList;
	}

	public void setReferenceValueList(List<String> referenceValueList) {
		this.referenceValueList = referenceValueList;
	}
}
