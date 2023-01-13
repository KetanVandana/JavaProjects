import java.util.Arrays;

public class EmployeeData {

	public String[] employeeDevice(String empName) {
		
		
		if (empName.equals("Tom")) {
			String device[] = {"Macbook", "Ipad", "Iphone", "Mouse", "Keyboard"};	
			return device;
		}else if(empName.equals("John")) {
			String device[] = {"Samsung Laptop", "Iphone", "Mouse", "Keyboard"};
			return device;
		}else if(empName.equals("Jack")) {
			String device[] = {"HP Laptop","Keyboard"};
			return device;
		}else{
			System.out.println("Employee not found..." + empName);
			String[] device = {};
			return device;
			
		}
		
	}
	public static void main(String[] args) {
		EmployeeData emp = new EmployeeData();
		String[] empData = emp.employeeDevice("vandana");
		System.out.println(empData.length);
		System.out.println(Arrays.toString(empData));
	}
}
