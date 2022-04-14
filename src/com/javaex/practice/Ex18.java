package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("화씨 :");
		double fa = sc.nextDouble();
		double ce = 5.0 / 9.0 * (fa - 32); 
		System.out.println("화씨" + fa + " 의 섭씨온도는 " + ce + " 입니다.");
		
		
		sc.close();
	}

}
