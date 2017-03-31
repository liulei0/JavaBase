package com.ll.javacore.Array;

import java.util.Arrays;
import java.util.Scanner;

import javax.naming.ldap.SortControl;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Array {

	private static int i;

	public static void main(String[] args) {
		int[] score = new int[10];
		int sum = 0;
		int max = 0;
		int min = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入10位的数：");
		for (int i = 0; i < score.length; i++) {
			{
				score[i] = input.nextInt();
			}

			Arrays.sort(score);
			System.out.print("学员成绩升序排列：");
			System.out.print(score[i] + "，");
			
			{sum =sum +score[i];
			}

			{
				if (score[i] > max)
					max = score[i];
			}{
				if (score[i] < min)
					min = score[i];

			}
		}

		System.out.println("最小的值是：" + min);// 最小值
		System.out.println("最大的值是：" + max);// 最大值
		System.out.println("平均分是： " + (double) sum / score.length);// 平均分
	}
}
