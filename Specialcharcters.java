import java.util.*;
public class Specialcharcters {

	public static void main(String[] args) {
		Scanner se= new Scanner(System.in);
	System.out.println("Enter the String");
	  String s=se.nextLine();
	  int letters = 0,numbers = 0,specialcharacters = 0,spaces = 0;
	   for(int i=0;i<s.length();i++) {
		char[] c   = s.toCharArray();
	  if(Character.isLetter(c[i])) {
		  letters++;
	  }
	  else if(Character.isDigit(c[i])){
		  numbers++;
	  }else if(Character.isSpaceChar(c[i])){
		  spaces++;
	  }
	  else
		  specialcharacters++;
	  }
		System.out.println("The number of letters present in the string is  "+letters);
		System.out.println("The number of number present in the string is  "+numbers);
		System.out.println("The number of spaces present in the string is  "+spaces);
		System.out.println("The number of special characters present in the string is  "+specialcharacters);
		
		


	}

}