package Inheritance;

public class Audi extends Car{

	@Override
	public void start() {
		System.out.println("Car stop method is called!");
	}
	@Override
	public void stop() {
		System.out.println("Car start method is called!");
	}
	//Method Hidding
	public static void reverse() {
		System.out.println("Car reverse method is called!");
	}
	
}
