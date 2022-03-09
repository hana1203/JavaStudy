//파일명이랑 똑같아야됨 안그럼 에러
public class Datatype{
	public static void main(String[] args) {
		System.out.println(6);  //Number
		System.out.println("6"); //String
		System.out.println("six"); //String
		
		System.out.println(6+6); //12
		System.out.println("6"+"6"); //66
		
		System.out.println(6*6);
//		System.out.println("6"*"6");
		//The operator * is undefined for the argument type(s) java.lang.String, java.lang.String
	    System.out.println("1234".length());  //4
//	    System.out.println(1234.length());
	   
	    System.out.println("Hello World"); //String 문자열
	    System.out.println('H'); //Char 문자
	    System.out.println("H"); //Char
	
	}
}

//데이터 타입에 어울리는 연산들이 달라서 엄격하게 분리할 필요있음 

//** 에러 Editor does not contain a main type 에러뜨고 안됨
// Problem is that your folder is not identified as a Source folder.
//Src 소스코드폴더 
//문제는 프로젝트 가장 최상위폴더에 Datatype파일을 생성했는데 그건 소스폴더가 아님. 그렇기때문에 자바는 Datatype.java 를 소스코드로 인식하지 않기때문에 실행불가. 
//
//1.처음에 프로젝트 만들때 Use project folder as root for sources and class files 체크하기 ..했는데도 안됨.
//2. 파일 (Datatype.java) 자체를 src 폴더로 옮김
//3. 최상위 디렉토리에서도 실행 되게하려면 프로젝트속성 지정
//Properties - Java Build Path - src 폴더 지워버리고 add folder 해서 프로젝트폴더 (Data_Operation) ok누름  -> 이제 최상위 디렉토리는 프로젝트를 담는 폴더됨. 
//Default Output folder 도 프로젝트 폴더 Data_Operation 지정하기 ->클래스파일이 프로젝트 폴더에 생성되게됨
