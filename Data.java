package com.dataMiningAlgorithms.DecisionTree;

/**
 * 
 * �������ݣ������ݽ����ο��������ṩ��һ�ַǳ���Ҳ�Ƿǳ����ķ�����
 * ���Ҳ�������Դ��ļ��ж�ȡ��˳��Ҳ����JAVA�ļ�������
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
		
		System.out.println("���ݳ��ȣ�" + data.size());
		return data;
	};
	
	public static List<String> getAttribute(){

		List<String> attribute = new ArrayList<String>();
		attribute.add("age");
		attribute.add("income");
		attribute.add("student");
		attribute.add("credit_rating");
		attribute.add("TARGET_VALUE");
		System.out.println("���Գ��ȣ�" + attribute.size());
		
		return attribute;
	};
	public static void main(String[] args) {
		getData();
		getAttribute();
	}
}
