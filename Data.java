package com.dataMiningAlgorithms.DecisionTree;

/**
 * 
 * 测试数据，本数据仅供参考，这里提供了一种非常简单也是非常笨的方法。
 * 大家也可以试试从文件中读取，顺带也练练JAVA文件操作！
 * 
 * */

import java.util.ArrayList;
import java.util.List;

public class Data {
	public static List<ArrayList<String>> getData(){

		List<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> tmp = new ArrayList<String>();
		
		tmp.add("youth");tmp.add("high");tmp.add("no");tmp.add("fair");tmp.add("no");
		data.add(tmp);
		
		tmp = new ArrayList<String>();
		tmp.add("youth");tmp.add("high");tmp.add("no");tmp.add("excellent");tmp.add("no");
		data.add(tmp);
		
		tmp = new ArrayList<String>();
		tmp.add("middle_aged");tmp.add("high");tmp.add("no");tmp.add("fair");tmp.add("yes");
		data.add(tmp);
		
		tmp = new ArrayList<String>();
		tmp.add("senior");tmp.add("low");tmp.add("yes");tmp.add("fair");tmp.add("yes");
		data.add(tmp);
		
		tmp = new ArrayList<String>();
		tmp.add("senior");tmp.add("low");tmp.add("yes");tmp.add("excellent");tmp.add("no");
		data.add(tmp);
		
		tmp = new ArrayList<String>();
		tmp.add("middle_aged");tmp.add("low");tmp.add("yes");tmp.add("excellent");tmp.add("yes");
		data.add(tmp);
		
		tmp = new ArrayList<String>();
		tmp.add("youth");tmp.add("medium");tmp.add("no");tmp.add("fair");tmp.add("no");
		data.add(tmp);
		
		tmp = new ArrayList<String>();
		tmp.add("youth");tmp.add("low");tmp.add("yes");tmp.add("fair");tmp.add("yes");
		data.add(tmp);
		
		tmp = new ArrayList<String>();
		tmp.add("senior");tmp.add("medium");tmp.add("yes");tmp.add("fair");tmp.add("yes");
		data.add(tmp);
		
		tmp = new ArrayList<String>();
		tmp.add("youth");tmp.add("medium");tmp.add("yes");tmp.add("excellent");tmp.add("yes");
		data.add(tmp);
		
		tmp = new ArrayList<String>();
		tmp.add("middle_aged");tmp.add("high");tmp.add("yes");tmp.add("fair");tmp.add("yes");
		data.add(tmp);
		
		tmp = new ArrayList<String>();
		tmp.add("senior");tmp.add("medium");tmp.add("no");tmp.add("excellent");tmp.add("no");
		data.add(tmp);
		
		System.out.println("数据长度：" + data.size());
		return data;
	};
	
	public static List<String> getAttribute(){

		List<String> attribute = new ArrayList<String>();
		attribute.add("age");
		attribute.add("income");
		attribute.add("student");
		attribute.add("credit_rating");
		attribute.add("TARGET_VALUE");
		System.out.println("属性长度：" + attribute.size());
		
		return attribute;
	};
	public static void main(String[] args) {
		getData();
		getAttribute();
	}
}
