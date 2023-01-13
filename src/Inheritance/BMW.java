package Inheritance;

public class BMW extends Car{

	@Override
	public void start() {
		System.out.println("BMW remote start method is called!");
	}
	
	public static void reverse() {
		System.out.println("BMW reverse method with Back Camera is called!");
	}
	//Individual method
	public void billing() {
		System.out.println("BMW billing methid is called!");
	}
	
}
