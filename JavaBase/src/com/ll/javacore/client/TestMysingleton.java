package com.ll.javacore.client;
/**
 * 懒汉式单例
 */

public class TestMysingleton {
	/**
	 * 懒汉单例模式 Mysingleton
	 */
	public static void myprint() {
		System.out.println("....懒汉单例模式....");
		System.out.println("第一次取得实例（懒汉式）");
		Mysingleton s1 = Mysingleton.getInstance();
		System.out.println("第二次取得实例（懒汉式）");
		Mysingleton s2 = Mysingleton.getInstance();
           if(s1==s2){
        	   System .out.println(">>>>>s1,s2为同一实例（懒汉式）<<<<<");
        	   
	
}System .out .println();
	}
	
	public static void main(String[]args ){
	myprint();	
	}
}
