package com.hana.projectoop;

public class MyOOP {
	//3. 
	public static String delimiter2 = "";

	public static void main(String[] args) {
		printA("--1.");
		//refactor ->extract method 로 메소드 간단히 만들수있음 
		
		printB("**1.");
		//Q1. PrintB의 구분자 *로 바꾸고싶다면? 
//		--1.
//		A
//		A
//		**1.
//		B
//		B		
		//Q2. 코드가 1억개라고 가정하면 메소드 안에 값 일일이 다바꿔야되는데.. 한번에 바꾸려면?
		//2. delimiter를 main에서 정해주면 delimiter 사용하는 메소드의 모든 인자값 바꾸면서 한번에 바꾸는거 가능. 폭발적효과
		String delimiter = "--2.";
		printA(delimiter);
		
		delimiter = "**2.";
		printB(delimiter);
//		--2.
//		A
//		A
//		**2.
//		B
//		B
		
		//Q3. printA() printB() 라는 코드가 1억개면 인자로 변수주는것도 귀찮..
		//메소드 안에서 정의된 변수는 메소드 안에서만 사용가능 .
		//여기서 delimiter - main method에 소속된 변수.  밑의 printA() 라는 메소드에서 쓸 수 없음. -유효범위. 
		//3. class소속의 변수로 만듬. myOOP 소속 변수로 가져감.
		
		delimiter2 = "--3.class에서정의한 delimiter";
		printA();
		
		delimiter2 = "**3.class에서정의한 delimiter";
		printB();
		
//		--3.class에서정의한 delimiter
//		A
//		A
//		**3.class에서정의한 delimiter
//		B
//		B

		
	}	
//	public static void printA(); {
//		System.out.println("----");
//		System.out.println("A");
//		System.out.println("A");
//	}
//
//	public static void printB(); {
//		System.out.println("----");
//		System.out.println("B");
//		System.out.println("B");
//	}

	
	//1. 각각의 메소드에 파라미터 매개변수를 준다 
	//2. 파라미터 매개변수 그대로.
	public static void printA(String delimiter) {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}

	public static void printB(String delimiter) {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}

	//3.class소속변수 만들때 메소드 호출방법 
	public static void printA() {
		System.out.println(delimiter2);
		System.out.println("A");
		System.out.println("A");
	}
	
	public static void printB() {
		System.out.println(delimiter2);
		System.out.println("B");
		System.out.println("B");
	}

}
