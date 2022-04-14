package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println("========변경 전 =====");
		/*
		int true;					// 식별자는 예약어로 사용할 수 없다.
		int #_of_workers;			// 식별자 특수문자는 $ 또는 _ 이외 다른 특수문자는 사용할 수 없다.
		int countOfLettersInString;	// 사용가능
		int 1stLevel1;				// 숫자로 시작할 수 없다.
		int person#;				// 식별자 특수문자는 $ 또는 _ 이외 다른 특수문자는 사용할 수 없다.
		int _person;				// 사용가능
		*/
		System.out.println("========변경 후 =====");
		
		int true01;					// 식별자는 예약어로 사용할 수 없다.
		int $_of_workers;			// 식별자 특수문자는 $ 또는 _ 이외 다른 특수문자는 사용할 수 없다.
		int countOfLettersInString;	// 사용가능
		int stLevel1;				// 숫자로 시작할 수 없다.
		int person$;				// 식별자 특수문자는 $ 또는 _ 이외 다른 특수문자는 사용할 수 없다.
		int _person;				// 사용가능
		
		true01 = 1;
		$_of_workers = 2;			
		countOfLettersInString = 3;
		stLevel1 = 4;				
		person$ = 5;			
		_person = 6;
		System.out.println(true01);
		System.out.println($_of_workers);
		System.out.println(countOfLettersInString);
		System.out.println(stLevel1);
		System.out.println(person$);
		System.out.println(_person);
		
		
	}
}
