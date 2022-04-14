package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		final double PI = 3.14;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요:");
		int circle = sc.nextInt();
		System.out.print("원의 넓이는" + circle * circle * PI );
		
		sc.close();
	}
}
