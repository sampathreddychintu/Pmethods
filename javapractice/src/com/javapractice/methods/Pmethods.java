package com.javapractice.methods;

public class Pmethods {
	public static void main(String[] args) {
		//Addition (5,10);
		Pmethods pmethods=new Pmethods();
		int h=pmethods.Addition(5,10);
		vinayak();
		
		pmethods.Sub(20,30);
        pmethods.Mult(25,30);
       System.out.println(h);
	}
static int Addition(int a,int b) {
	System.out.println(a+b);
	return a+b;
}
int Sub(int c,int d) {
System.out.println(c-d);
return c-d;
}
int Mult(int e, int f) {
	System.out.println(e*f);
	return e;
} 
 static String vinayak() {
	System.out.println("vinayak");
	sai();
	return "1";
	
}
 static String sai() {
	 System.out.println("sai");
	 Sampath();
	 return "b";
 }
	static  String Sampath() {
		System.out.println("sampathreddy");
		System.out.println("friends");
		vinayak();
		return "l";
	}


	


}



