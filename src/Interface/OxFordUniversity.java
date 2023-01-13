package Interface;

public class OxFordUniversity implements IndiaEduction, UKEducation, UsEducation{

	//Indian Education
	@Override
	public void phdSanskrit() {
		System.out.println("Indian Education - PHD in Sanskrit...");
		
	}

	@Override
	public void diplomaHindi() {
		System.out.println("Indian Education - Diploma in Hindi...");
		
	}

	//UK Education 
	@Override
	public void diplomaEnglish() {
		System.out.println("UK Education - Diploma in English...");
		
	}

	@Override
	public void phdScience() {
		System.out.println("UK Education - PHD in Science...");
		
	}

	@Override
	public void msCompScience(String country) {
		if(country.toLowerCase().equals("uk")) {
			System.out.println("UK Education - Masters in Computer Science...");
		}else if(country.toLowerCase().equals("us")){
			System.out.println("US Education - Masters in Computer Science...");
		}else {
			System.out.println("No degree has been listed for the country you provided...");
		}
		
	}

	//Us Education
	@Override
	public void mdNeurology() {
		System.out.println("US Education - Specialist in Neurology...");
		
	}
	
	//Individual methods
	
	public void getInfo() {
		System.out.println("Oxford University Individual Information Method is Called...");
		
	}

	
	

	
	

}
