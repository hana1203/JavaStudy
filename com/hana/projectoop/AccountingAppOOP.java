package com.hana.projectoop;
class Accounting{
//	// 클래스화. 
//	// 공급가액 
//    public static double valueOfSupply;
	
	//인스턴스에서 쓰이려면 static 빼야함
	public double valueOfSupply;
    
	// 부가가치세율
    public static double vatRate = 0.1;
 
    // 부가가치세 
    //public static double getVAT() {
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
     
    //합계  
    //public static double getTotal() {
    public double getTotal() {
        return valueOfSupply + getVAT();
    }
}
public class AccountingAppOOP {
 
    public static void main(String[] args) {
//    	//클래스화. 
//    	Accounting.valueOfSupply = 10000.0;
//        System.out.println("Value of supply : " + Accounting.valueOfSupply);
//        System.out.println("VAT : " + Accounting.getVAT());
//        System.out.println("Total : " + Accounting.getTotal());

        
        //계속해서 바뀌어야하는 코드?
        //공급가액 만원에대한것 VAT는 2만원에대한것 토탈은 10만원에 대한것 ..
        //하나의 클래스를 수십개의 내부적 상태로 이루어져있는데 계속해 바꾸어야되면? 
        //어카운팅에 대한 하나의 클래스를 여러상태로 돌려서 사용하고있음
        //어카운팅 클래스복제한 인스턴스를 만들어서 고유한상태를 주게되 독립된 인스턴스 제어.
        
        Accounting a1 = new Accounting();
        a1.valueOfSupply = 10000.0;
        
        Accounting a2 = new Accounting();
        a2.valueOfSupply = 20000.0;
         
        System.out.println("Value of supply : " + a1.valueOfSupply);
        System.out.println("Value of supply : " + a2.valueOfSupply);
        System.out.println("VAT: " + a1.getVAT());
        System.out.println("VAT: " + a2.getVAT());
        System.out.println("Total: " + a1.getTotal());
        System.out.println("Total: " + a2.getTotal());
    
    } 
 
}
