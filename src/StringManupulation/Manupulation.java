package StringManupulation;

import java.util.Arrays;

public class Manupulation {
	
	public static void main(String[] args) {
		
		String s1 = "Your Id is testautomation so please login";
		
		System.out.println(s1.substring(s1.indexOf("is")+ 3, s1.indexOf("so")-1));
		
		String[] s2 = s1.split(" ");
		
		for(int i=0; i< s2.length; i++) {
			
			System.out.println(s2[i]);
		}
		
		String s3 = "Your Id is testautomation";
		System.out.println(s3.substring(s3.indexOf("is")+3, s3.length()));
		
		String s4 = "vandana Patel";
		StringBuilder sb4 = new StringBuilder(s4);
		sb4.reverse();
		System.out.println(sb4);
		
		System.out.println("================");
		String rev = "";
		
		for(int i=s4.length()-1; i>=0; i--) {
			rev = rev + s4.charAt(i);
		}
		System.out.println(rev);
		
		
		String sp = "ltVandanaltLTPatelLTXTketanLTPRManviGPLTNyra" ;
		String[] sp1 = sp.split("LT");
		
		System.out.println(Arrays.toString(sp1));
		
		String dob = "09/14/1987";
		System.out.println(dob.replace("/", "-"));
		
		String str = "PatelKetanVandanaPatel";
		
		System.out.println(str.substring(str.indexOf("Vandana"), str.indexOf("Patel", 5)));
				
		
	}
}
