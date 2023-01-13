package MethodOverloading;

public class FoodDelivery {

	String username;
	String password;
	int OTP;
	long phoneNumber;
	
	
	 
	public FoodDelivery(String username, String password, int oTP, long phoneNumber) {
		super();
		this.username = username;
		this.password = password;
		OTP = oTP;
		this.phoneNumber = phoneNumber;
	}

	public boolean login(String username, String password) {
		 if (this.username.equals(username) && this.password.equals(password)) {
			 System.out.println("Login successfully");
			 return true;
		 }else {
			 return false;
		 }
		
	}

	public boolean login(long phone, String password) {
		 if (this.phoneNumber== phone && this.password.equals(password)) {
			 System.out.println("Login successfully");
			 return true;
		 }else {
			 return false;
		 }
		
	}
	public boolean login(int otp, String password) {
		 if (this.OTP == otp && this.password.equals(password)) {
			 System.out.println("Login successfully");
			 return true;
		 }else {
			 return false;
		 }
		
	}
	public boolean login(int otp, long phoneNumber) {
		 if (this.OTP == otp && this.phoneNumber == phoneNumber) {
			 System.out.println("Login successfully");
			 return true;
		 }else {
			 return false;
		 }
		
	}

	public static void main(String[] args) {
		
		FoodDelivery f = new FoodDelivery("Vandana123", "Vand", 98, 9876544);
		
		System.out.println(f.login("Vandana123", "Vand"));
		
		System.out.println(f.login(98, 9876544));
		
		
		
	}
	
}
