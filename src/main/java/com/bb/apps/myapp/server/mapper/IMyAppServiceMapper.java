package com.bb.apps.myapp.server.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bb.apps.myapp.shared.User;

public interface IMyAppServiceMapper {

	List<String> getCountryList();

	User checkCredentials(@Param("user") User user);

}
