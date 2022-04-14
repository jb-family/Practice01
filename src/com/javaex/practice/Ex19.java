package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		long min = 60;
		long hours = min * 60;
		long day = hours * 24;
		long year = day * 365;
		long right = year * 300000; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("빛이 1년 동안 가는 거리는" + right + " km 입니다." );
		
		
		sc.close();
		
		
		
	}

}
