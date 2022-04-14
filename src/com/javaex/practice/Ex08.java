package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		System.out.println("=======변경 전=======");
		/*
		int x, y = 0;			//x와 y를 모두 0으로 초기화
		char grade = "A";		//문자 A를 grade에 대입
		int salary = 2,000,000;	//salary에 2,000,000을 대입
		byte n = 1000;			//n에 1000을 대입
		*/
		
		System.out.println("=======변경 후=======");
		int x = 0;
		int y = 0;					//x와 y를 모두 0으로 초기화
		char grade = 'A';				//문자 A를 grade에 대입
		String salary = "2,000,000";	//salary에 2,000,000을 대입
		int n = 1000;					//n에 1000을 대입
		
		System.out.println(x);		// 0
		System.out.println(y);		// 0
		System.out.println(grade);	// A
		System.out.println(salary);	// 2,000,000
		System.out.println(n);		// 1000
		
		
	}

}
