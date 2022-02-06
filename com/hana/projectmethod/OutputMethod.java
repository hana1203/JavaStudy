package com.hana.projectmethod;

public class OutputMethod {
	
	public static String a() {
		//...
		return "a";
		//a()라는 메소드는 return 뒤에있는 값이 된다
		//return 값이 문자열이기때문에 String a()
	}
	
	public static int one() {
		return 1;
	}
//  자바 메소드 output의 핵심 
//	1.메소드의 리턴값 뒤에있는 값이 메소드의 실행결과
//	2.리턴값은 메소드를 종료시킴
//	3.메소드는 리턴값이 어떤 데이터타입인지 정해줘야함.
//  void는 리턴값이 없는 메소드 
	

	public static void main(String[] args) {
		System.out.println(a());  //a라는 문자 출력되도
		System.out.println(one()); //1이라는 정수 출력되도
	
	}

}
