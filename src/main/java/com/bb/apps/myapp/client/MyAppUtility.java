package com.bb.apps.myapp.client;

import com.bb.apps.myapp.shared.User;

public class MyAppUtility {

	static User user = null;
	
	public static boolean isActiveUser(User user){
		
		if(user!=null){
			if(user.getStatus()!=null && user.getStatus().equalsIgnoreCase(IMyAppConstants.STATUS_ACTIVE))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		return false;
	}

	public static boolean isAdmin(User user) {
		
		if(user!=null){
			if(user.getRole()!=null && user.getRole().equalsIgnoreCase(IMyAppConstants.ROLE_ADMIN))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		return false;
	}
}
