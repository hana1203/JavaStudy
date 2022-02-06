package com.hana.projectoop;

class Print{
	//클래스 소속의 변수, 메소드를 사이에 담는다 
	//클래스의 멤버 - 변수, 메소드 (delimiter2, A(), B()) 
	public static String delimiter2 = "";	
	public static void A() {
		System.out.println(delimiter2);
		System.out.println("A");
		System.out.println("A");
	}
	
	public static void B() {
		System.out.println(delimiter2);
		System.out.println("B");
		System.out.println("B");
	}
}