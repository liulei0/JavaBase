package com.ll.javacore.ood5;

public class StudentImpl implements IStudent {

	@Override
	public void study() {
		System.out .println("我是学生，我在学习!");

	}

	@Override
	public void study(String java) {
	System .out .println("我正在学习："+java);

	}

}
