package com.hana.projectmethod;

public class WhyMethod {
	
//	메소드의 기본형식
	public static void printTwoTimesq() {
		System.out.println("-");
		System.out.println("q");
		System.out.println("q");
	}

	
//  함수()안에 입력값을 주면 입력값에따라 메소드가 다르게 동작하게 할때
	public static void printTwoTimes(String text, String delimeter) {
		System.out.println(delimeter);
		System.out.println(text);
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		//원하는만큼 내가만든 메소드를 반복할수있음.코드 만줄넘을때 일괄수정가능.
		printTwoTimesq();
		printTwoTimesq();
		printTwoTimesq();
		
		
		// 입력값준 메소드
		printTwoTimes("a", "-");
		printTwoTimes("a", "*");
		printTwoTimes("a", "!");
		
	
		
	}

}
