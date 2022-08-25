import java.util.*;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String1");
		 String s=sc.nextLine();
		 System.out.println("Enter a String2");
		 String s1=sc.nextLine();
		      char [] c1 =s.toCharArray();
		      char[] c2= s1.toCharArray();
		      if(c1.length!=c2.length) {
		    	  System.out.println(" It is not an Anagram");
		    	  System.exit(0);
		      }
		      Arrays.sort(c1);
		      Arrays.sort(c2);
		      for(int i=0;i<c1.length;i++) {
		    	  if(c1[i]!=c2[i]) {
		    		  System.out.println("It is not an Anagram");
			    	  System.exit(0);
		    	  }
		      }
		      System.out.println("It is an Anagram");
		      
	}

}
