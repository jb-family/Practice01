package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final double mile = 1.609;
		
		System.out.print("마일을 입력하세요: ");
		double kilometer = sc.nextDouble();
		System.out.println(kilometer + "마일은 " + mile * kilometer + "킬로미터 입니다.");
		
		
		
		sc.close();
		
	}

}
