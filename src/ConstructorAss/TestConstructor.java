package ConstructorAss;

public class TestConstructor {

	public static void main(String[] args) {
		
		String[] plugin = {"jdddddddf", "hfefe", "fjehwf"};
		
		
		ConstructorAssignment con = new ConstructorAssignment("Chrome", 15.0, plugin );
		
		System.out.println(con.toString());
		
		String[] newPlugin = {"Graco","Firefox","add"};
		
		con.setPlugin(newPlugin);
		con.setName("Safari");
		con.setVersion(18.9);

		System.out.println(con.toString());
	}

}
