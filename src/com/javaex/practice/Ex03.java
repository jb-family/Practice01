package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		int a = ++x * 2;
		int b = y++ * 2;
		
		System.out.println("a= " + a);	// 예상 값 4
		System.out.println("x= " + x);	// 예상 값 2
		System.out.println("b= " + b);	// 예상 값 2
		System.out.println("y= " + y);	// 예상 값 2
			
		
	}
}
