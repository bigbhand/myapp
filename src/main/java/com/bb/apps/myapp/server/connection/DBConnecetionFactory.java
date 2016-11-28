package com.bb.apps.myapp.server.connection;

import java.io.Reader;
import java.util.Properties;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

	
public class DBConnecetionFactory {

	private static Logger logger = LoggerFactory.getLogger(DBConnecetionFactory.class);
	private static SqlSessionFactory sessionFactory = null;
	private static Reader reader = null;
	private static ResourceBundle configProperties;
	
	private static String DB_PREFIX = "jdbc:oracle:thin@";
	private static String JNDI_NAME="DB.jndi.name";
	private static String DB_URL="DB.url";
	private static String DB_DRIVER="DB.driver";
	private static String DB_USERNAME="DB.username";
	private static String DB_PASSWORD="DB.password";
	
	static{
		
		configProperties = PropertyResourceBundle.getBundle("config");
		
		try{
			Properties propsSystem = new Properties();
			reader = Resources.getResourceAsReader("mybatis-config.xml");
			
			String jndiName = configProperties.getString(JNDI_NAME);
			
			if(jndiName!=null && !jndiName.isEmpty()){
				sessionFactory = new SqlSessionFactoryBuilder().build(reader, JNDI_NAME);
			}
			else{
				
				propsSystem.setProperty(DB_URL, checkForNull(System.getProperty("DB_DRIVER_VALUE"),""));
				propsSystem.setProperty(DB_URL, checkForNull(System.getProperty("DB_USER_VALUE"),""));
				propsSystem.setProperty(DB_URL, checkForNull(System.getProperty("DB_PASS_VALUE"),""));
				
				for(String name : propsSystem.stringPropertyNames())
				{
					if(null!=configProperties.getString(name)){
						propsSystem.setProperty(name, configProperties.getString(name));
					}
				}
				
				sessionFactory = new SqlSessionFactoryBuilder().build(reader,"DB", propsSystem);
			}
		}
		catch(Exception ex){
			logger.error(ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getDBSession(){
		return sessionFactory;
	}

	private static <T> T checkForNull(T input, T ifNull) {
		return input!=null? input : ifNull;
	}

	public static void closeSqlSession(SqlSession session) {
		if(session!=null)
		{
			session.close();
		}
		
	}
}
