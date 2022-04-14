package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		/*
		double f = 80.0; //화씨 > 섭씨 정상적인 결과 값 나오도록 하기. 26.66666667
		System.out.println(5 / 9 * ( f - 32.0 );	// 화씨 > 섭씨 26.66667 섭씨 > 화씨 80
		*/
		
		System.out.println("============변경 후==========");
		double f = 80.0; //화씨 > 섭씨 정상적인 결과 값 
		System.out.println(5.0/9.0 * (f - 32.0));
		
		// 값이 0인 이유는 정수인 5/9 를 나누면 0이기 때문에 * 48을 해도 0의 결과 값을 얻음. 
		// 즉 실수로 바꿔주면 정상적으로 결과 값 나오게 된다.
	}

}
