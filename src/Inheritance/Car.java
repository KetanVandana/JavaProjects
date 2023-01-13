package Inheritance;

public class Car extends Vehicle{

	public void start() {
		System.out.println("Car stop method is called!");
	}
	public void stop() {
		System.out.println("Car start method is called!");
	}
	public void refuel() {
		System.out.println("Car refuel method is called!");
	}
	public static void reverse() {
		System.out.println("Car reverse method is called!");
	}
}
