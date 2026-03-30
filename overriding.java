package com.maven;
class bank{
	double intrestrate() {
		return 0.0;
	}
}
class sbi extends bank{
	double intrestrate(){
		return 5.4;
	}
}
class hdfc extends bank{
	double intrestrate() {
		return 8.2;
	}
}
public class overriding {
public static void main(String args[]) {
	sbi sc=new sbi();
	System.out.println(sc.intrestrate());
	hdfc ob=new hdfc();
	System.out.println(ob.intrestrate());
}
}
