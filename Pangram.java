import java.util.*;
public class Pangram {

	public static void main(String[] args){
		Scanner sa= new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sa.nextLine();
		s.toLowerCase();
	boolean b	  = isPangram(s);
	    if(b==true) {
	    	System.out.println("It is a Pangram");
	    	
	    }
	    else
	    	System.out.println("It is not a Pangram");
	 
	}
	
	private static boolean isPangram(String s) {
		    if(s.length()< 26) {
		    return false;
		    }
		    else {
		    	for( char c='a';c<'z';c++) {
		    		if(s.charAt(c)<0)
		    			return false;
		    	}
	}	
		    return true;
	}


}
