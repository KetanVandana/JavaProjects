package Encapsulation;

public class EmpAction {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Vandana", 101, 5000.00, "Parkerson Road, NJ", "sales");
		System.out.println(emp.getEmpInfo());
		
		Employee emp1 = new Employee();
		emp1.setName("Ketan");
		emp1.setEmpId(102);
		emp1.setAddress("Rossel Park, NJ");
		emp1.setSalary(10000.00);
		emp1.dept = "Manager";
		
		System.out.println(emp1.getEmpInfo());
		System.out.println("Change ketan address to Washington Ave and Vandana to California");
		
		emp1.setAddress("Washington Avenue, NJ");
		emp.setAddress("Fremont, California");
		
		System.out.println(emp.getEmpInfo());
		System.out.println(emp1.getEmpInfo());
		
	}

}
