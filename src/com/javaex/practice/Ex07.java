package com.javaex.practice;

public class Ex07 {

	public static void main(String[] args) {
		int i = 10;
		int n = ++i % 2;
		
		System.out.println(i);	// 예상 값 11
		System.out.println(n);	// 예상 값 1
		
		// 다른점 : i의 증감연산자의 위치가 다르다.
		// i앞에 ++이 붙는 경우 피연산자의 값을 바로 증가하여 대입하지만 i뒤에 ++이 붙는 경우 피연산자의 값을 대입 후에 적용시킨다. 
		
	}

}
