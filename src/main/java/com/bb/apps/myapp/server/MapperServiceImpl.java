package com.bb.apps.myapp.server;

import org.apache.ibatis.session.SqlSession;

import com.bb.apps.myapp.server.connection.DBConnecetionFactory;
import com.bb.apps.myapp.server.mapper.IMyAppServiceMapper;
import com.bb.apps.myapp.shared.User;

public class MapperServiceImpl {

	SqlSession session = null;
	
	public User checkCredentials(User user)
	{
		try
		{
			session = DBConnecetionFactory.getDBSession().openSession();
			IMyAppServiceMapper mapper = session.getMapper(IMyAppServiceMapper.class);
			User result = mapper.checkCredentials(user);
			session.commit();
			if(result!=null){
				return result;
			}
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		finally {
			 DBConnecetionFactory.closeSqlSession(session);
		}
		return null;
	}
}
