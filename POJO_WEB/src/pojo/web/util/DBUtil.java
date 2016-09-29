package pojo.web.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBUtil {
	static Logger logger = LoggerFactory.getLogger(DBUtil.class);

	private DBUtil() {
		init();
	}

	private static DBUtil instance = new DBUtil();

	public static DBUtil getInstance() {
		return instance;
	}
	
	private SqlSessionFactory factory;
	
	private void init(){
		String res = "mybatis-config.xml";
		try{
			InputStream input = Resources.getResourceAsStream(res);
			factory = new SqlSessionFactoryBuilder().build(input);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public SqlSession getSession(){
		return factory.openSession();
	}
}
