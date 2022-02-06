package com.hana.projectoop;
//상속과 생성자 
//생성자가 있는 클래스를 상속받는다면 생성자만들어 부모클래스를 반드시 호출해야됨. 
class Ccal{
	int v1, v2;
	Ccal(int v1, int v2){
		this.v1 = v1; this.v2 = v2;
		System.out.println("CCal 클래스에 대한 것 ");
		
	}
}

class Ccal2 extends Ccal{

	Ccal2(int v1, int v2) {
		super(v1, v2);
		//super 부모클래스의 생성자를 실행시킨다.
		System.out.println("Ccal2 클래스에 대한 것 ");
	}
	
}

public class Inheritance2 {
	public static void main(String[] args) {
		Ccal cc = new Ccal(0, 0);  
		//CCal 클래스에 대한 것 

		Ccal cc2 = new Ccal2(0, 0); 
		//CCal 클래스에 대한 것 
		//Ccal2 클래스에 대한 것 

	}
}