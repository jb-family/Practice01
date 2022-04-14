package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money500 = 500;
		int money100 = 100;
		int money50 = 50;
		int money10 = 10;
		
		System.out.print("500원 개수 : ");
		int moneybox1 = sc.nextInt();
		System.out.print("100원 개수 : ");
		int moneybox2 = sc.nextInt();
		System.out.print("50원 개수 : ");
		int moneybox3 = sc.nextInt();
		System.out.print("10원 개수 : ");
		int moneybox4 = sc.nextInt();
		System.out.println("동전의 총합은 : " + (money500 * moneybox1 + money100 * moneybox2 + money50 * moneybox3 + money10 * moneybox4) + " 원 입니다.");
		
		
		sc.close();
		
	}

}
