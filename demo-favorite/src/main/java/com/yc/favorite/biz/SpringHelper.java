package com.yc.favorite.biz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelper {
	private static ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
	
	@SuppressWarnings("unchecked")
	public static<T> T getBean(String beanName) {
		return (T) ac.getBean(beanName);
	}
	public static<T> T getBean(Class<T> cls) {
		return (T) ac.getBean(cls);
	}
}
