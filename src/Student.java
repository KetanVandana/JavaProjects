
public class Student {

	String name;
	int rollno;
	int grade;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();		
		s1.name="Nick";
		s1.rollno=101;
		s1.grade=5;		
		
		Student s2 = new Student();
		s2.name="Jack";
		s2.rollno=102;
		s2.grade=6;
			
		Student s3 = new Student();
		s3.name="John";
		s3.rollno=103;
		s3.grade=5;
			
		Student s4 = new Student();
		s4.name="Jose";
		s4.rollno=104;
		s4.grade=6;
		
		s1=s2;
		s2=s3;
		s3=s4;
		s4=s1;
		
		System.out.println(s1.name+" "+s1.rollno+" "+ s1.grade);
		System.out.println(s2.name+" "+s2.rollno+" "+ s2.grade);
		System.out.println(s3.name+" "+s3.rollno+" "+ s3.grade);
		System.out.println(s4.name+" "+s4.rollno+" "+ s4.grade);
		


	}

}
