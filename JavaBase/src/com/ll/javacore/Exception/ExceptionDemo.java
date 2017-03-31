package com.ll.javacore.Exception;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("清输出要算除法的两位数 :");
		try {
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			System.out.println("两个数相除为：" + num1 / num2);
		} catch(InputMismatchException ime){
			ime.printStackTrace();
		}catch (Exception e) {
			System.out.println("我捕捉到了异常");
			System.out.println(e.getClass().getName());
			/* e.printStackTrace(); */
		}
		System.out.println("程序进行到此处，已经结束了");
		// java.lang.ArithmeticException: / by zero
		// java.util.InputMismatchException
	}

}
