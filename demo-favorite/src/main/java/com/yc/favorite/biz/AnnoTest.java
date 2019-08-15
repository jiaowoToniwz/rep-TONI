package com.yc.favorite.biz;

import java.lang.reflect.Method;

import org.apache.ibatis.annotations.Select;

import com.yc.favorite.dao.TfMapper;



public class AnnoTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Method m = TfMapper.class.getMethod("queryAll");
		Select s = m.getAnnotation(Select.class);
		System.out.println(s.value()[0]);
	}
}
