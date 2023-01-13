package Interface;

public class TestUniversity {

	public static void main(String[] args) {
		
		OxFordUniversity oxford = new OxFordUniversity();
		
		//UK Education
		oxford.msCompScience("UK");
		oxford.diplomaEnglish();
		oxford.phdScience();
		
		//variable declared in interface are static and final by default. so we can access via className/ InterfaceName
		System.out.println(UKEducation.tutionFee);
		System.out.println(OxFordUniversity.tutionFee);
		
		//UKEducation.tutionFee = 600; final variable can't assign 
		
		
		//US Education
		oxford.mdNeurology();
		oxford.msCompScience("US");
		
		//Indian Education
		oxford.diplomaHindi();
		oxford.phdSanskrit();
		
		//Individual method
		oxford.getInfo();
		
		//up Casting
		System.out.println("---------------");
		UKEducation uk = new OxFordUniversity();
		
		uk.diplomaEnglish();
		uk.phdScience();
		uk.msCompScience("uk");
		//uk.getInfo(); Reference type check get failed
		
		//Down Casting is not allowed for interface because only method declaration is present - no definition
		 //OxFordUniversity ox1 = new UsEducation();
	
		

	}

}
