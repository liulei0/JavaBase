package com.ll.javacore.client;

//饿汉式单例模式
public class Mysingleton2 {
	
	private static final Mysingleton Mysingleton = null;
	// 设立静态变量，直接创建实例
	private static Mysingleton2 mySingleton = new Mysingleton2();

	private Mysingleton2() {
	
			// 私有化构造函数
			System.out.println("-->饿汉式单例模式开始调用构造函数");
		}

	// 开放一个公有方法，判断是否已经存在实例，有返回，没有新建一个在返回
	public static Mysingleton getInstance() {
		System.out.println("-->饿汉式单例模式开始调用公有方法返回实例");
		return Mysingleton;
	}
}
