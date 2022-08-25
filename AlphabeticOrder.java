import java.util.*;
public class AlphabeticOrder {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	System.out.println("Enter the String");
	      String s= scan.nextLine();
	      String s1="";
	      char c;
	      int l=s.length();
	      for(int i=65;i<90;i++) {
	    	  for(int j=0;j<l;j++) {
	    	c	=  s.charAt(j);
	    	   if(c==(char)i|| c==(char)i+32) {
	    		   s1=s1+c;
	    	   }
	    	  }
	      }
     System.out.println(s1);
			   
			  
		   
	   

	}

}
