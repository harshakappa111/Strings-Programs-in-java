import java.util.*;
public class RepeatedCharacters {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
System.out.println("Enter the String");
	    String s =sc.next();
	    int count =0;
	    for(int i=0;i<s.length();i++) {
	    	for(int j=i+1;j<s.length();j++) {
	    		  if(s.charAt(i)==s.charAt(j)) {
	    			  count++;
	    		  }
	    	}
	    
	    }
	    System.out.println("the number of repeated values are "+count);
	}

}