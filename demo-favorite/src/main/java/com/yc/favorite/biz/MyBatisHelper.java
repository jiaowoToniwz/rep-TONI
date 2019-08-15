package com.yc.favorite.biz;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisHelper {
	private static SqlSessionFactory sqlSessionFactory;
	static {
		try {
			InputStream inputStream = Resources.getResourceAsStream("MyBatis.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
		
	}
	public static SqlSession getSession() {
		return sqlSessionFactory.openSession();
	}
}

