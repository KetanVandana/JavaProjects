package Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW bmwCar = new BMW();
		bmwCar.reverse();
		bmwCar.battery();
		bmwCar.start();
		bmwCar.engine();
		bmwCar.aerodynamics();
		bmwCar.thermodynamics();
		
		System.out.println("---------------------------");
		
		Car c1 = new Car();
		c1.battery();
		c1.refuel();
		
		System.out.println("---------------------------");
		
		Vehicle v1 = new Vehicle();
		v1.battery();
		v1.engine();
		System.out.println("---------------------------");
		
		//Upcasting
		Car c2 = new BMW();
		// Trying to access billing method from BMW which is not available on Car class
		//c2.billing(); 
		c2.start();
		c2.stop();
		
		//Class Cast Exception - Downcasting is not allowed
		//BMW b1 = (BMW) new Car();
		
		Audi a1 = new Audi();
		a1.reverse();
		a1.refuel();
		
	}

}
