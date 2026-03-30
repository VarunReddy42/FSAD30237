package com.maven;
class vehicle{
	void start() {
		System.out.println("vehicle is starting");
	}
}
class car extends vehicle{
	void drive() {
		System.out.println("vehicle is being driven");
	}
}
class electriccar extends car{
	void charge() {
		System.out.println("car is being charged");
	}
}
public class multilevel {
	public static void main(String args[]) {
		electriccar ob= new electriccar();
		ob.start();
		ob.drive();
		ob.charge();
	}

}
