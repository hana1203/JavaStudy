package com.hana.projectoop;
class Cal {
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	
	//Overloading
	//같은이름의 메소드를 여러개 형태다르게 과적할수있다.
	public int sum(int v1, int v2, int v3) {
		return v1 + v2 + v3;
		//return this.sum(v1, v2) + v3;
		//이때 this는 자기자신가리킴. 위의 자기자신 클래스 Cal() 
		//public int sum(int v1, int v2) {
		//return v1 + v2; 실행시킨 결과에다가 v3를 더한다. 
		
	}
}
class Cal2 extends Cal{
	//부모가 안가지고있는 메소드 추가. 
	public int minus(int v1, int v2) {
		return v1-v2;
	}
	
	//Overriding
	//부모가 갖고있는 메소드를 재정의.
	//부모가 가지고있는 기능을 덮어쓰다. 올라타다. 
	public int sum(int v1, int v2) {
		System.out.println("Cal2");
//		return v1 + v2;
		return super.sum(v1, v2); //부모클래스의 sum 가져옴. 
	}
}


public class Inheritance {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(1,2)); //3
		
		Cal2 c2 = new Cal2();
		System.out.println(c2.minus(2, 1)); //1
		System.out.println(c2.sum(4,5)); 
		//위의코드
		//System.out.println("Cal2");
		//return v1 + v2; 
		//Cal2
		//9
		
		//return super.sum(v1, v2); //일때  
		
		
		System.out.println(c2.sum(0, 0)); 
		//Cal2
		//0

		
		System.out.println(c.sum(1,2,3));
		//6

	}

}


