package com.hana.projectoop;

public class MyOOP_class_instance {

	public static void main(String[] args) {
		//인스턴스 만들기
//		Printforinstance p1 = new Printforinstance();
//		p1.delimiter2 = "****";
//		p1.A();
//		p1.B();
//		
//		Printforinstance p2 = new Printforinstance();
//		p2.delimiter2 = "--";
//		p2.A();
//		p2.B();
		
		//////////////////
		
		//원래는 위에서 인스턴스만들때 작업처리하기전에 구분자 delimiter값 꼭 셋팅해야 우리가 원하는 작업.
		//인스턴스 생성시 딜리미터값 지정하지않으면 우리가만든 클래스가 인스턴스화 되지않게 원천적으로 차단할수있게하기 .
		//딜리미터 변수를 인스턴스 생성시 지정하기
		//생성자constructor를 정의해줘야 가능.
		//생성자와 this
		Printforinstance pfi1 = new Printforinstance("****");
		pfi1.A();
		pfi1.B();
		
		Printforinstance pfi2 = new Printforinstance("--");
		pfi2.A();
		pfi2.B();

//		****
//		A
//		A
//		****
//		B
//		B
//		--
//		A
//		A
//		--
//		B
//		B
		
	}

}

class Printforinstance{
	//클래스 소속의 변수, 메소드를 사이에 담는다 
	//클래스의 멤버 - 변수, 메소드 (delimiter2, A(), B()) 
	public String delimiter2 = "";
	//인스턴스의 소속이길 원하니static 없앰 
	
	public Printforinstance(String delimiter) {
	// 생성자. 자바는 인스턴스 생성할때 클래스이름과 동일한 메소드있다면 그 메소드를 실행시킴. 
	// constuctor 메소드 안에 정의.초기화의 목적달성. 
		
	//Printforinstanc클래스가 인스턴스화될 "****", "--"같은 구분자 인자로 받을것
	//Printforinstanc메소드의 매개변수 delimiter 를 받는다. 
		this.delimiter2 = delimiter;
		//내가 생성한 인스턴스를 가리키는 이름 .this
	}

	
	
	public void A() {
		//static 은 클래스의 소속. 우리는 여기서 인스턴스 소속이길 원하니 static 없앰.
		System.out.println(this.delimiter2);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(this.delimiter2);
		System.out.println("B");
		System.out.println("B");
	}
}