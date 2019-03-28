package com.tmn.spring;

public class HelloSpring {
	
	
	
	public static void main(String[] args) {
		int num = 500;
		int num2 = 5500;
		System.out.println(new HelloSpring().addNum(num, num2));
	}
	
	int addNum(int num,int num2){
		return num+num2;
	}
}
