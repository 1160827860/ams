package com.ams.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
/**
 * 数据库连接池对象
 * @author darksoul_lzy
 * @date 2020/3/21
 * @version 0.0.1
 */
public class DBUtil {
	
	private static Properties props;
	//单例模式
	static {
		try {
			InputStream in = DBUtil.class.getClassLoader().getResourceAsStream("application.properties");
			props = new Properties();
			props.load(in);
			in.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConn() throws Exception{
		String url = props.getProperty("spring.datasource.url");
		String username = props.getProperty("spring.datasource.username");
		String password = props.getProperty("spring.datasource.password");
		String driver = props.getProperty("spring.datasource.driver-class-name");
		Class.forName(driver);
		return DriverManager.getConnection(url,username, password);
	}
}
