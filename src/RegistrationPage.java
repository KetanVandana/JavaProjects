public class RegistrationPage {
	String fName;
	String lName;
	String email;
	long phoneNumber;
	String password;
	String confirmPassword;
	


	public RegistrationPage(String fName, String lName, String email, long phoneNumber, String password,
			String confirmPassword) {
		
		if(password != confirmPassword ) {
			System.out.println("Password and confirmpassword doesnot match! Please try again.");
		}else if(phoneNumber <1000000000L || phoneNumber> 9999999999L) {
			System.out.println("Please enter valid phone number: "+ phoneNumber);
		}
		else {
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
		}
	}

	public static void main(String[] args) {

		System.out.println("First customer details!");
		RegistrationPage r1 = new RegistrationPage("Vandana", "Patel", "Van@gmail.com", 7323456789L, "van123", "van123");
		System.out.println(r1.fName+ " "+r1.lName+" "+ r1.email+" "+r1.phoneNumber+" "+r1.password+" "+r1.confirmPassword);
		
		System.out.println("===============================================================");
		
		System.out.println("Secome customer details!");
		RegistrationPage r2 = new RegistrationPage("Tom", "Jerry", "tom@gmail.com", 9879876543L, "tom123", "tom123");
		System.out.println(r2.fName+" "+r2.lName+" "+r2.email+" "+r2.phoneNumber+" "+r2.password+" "+r2.confirmPassword);

	}

}
