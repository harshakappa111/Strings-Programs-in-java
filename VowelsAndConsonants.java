import java.util.*;
public class VowelsAndConsonants {

	public static void main(String[] args) {
		Scanner sa = new Scanner(System.in);
		System.out.println("Enter the String");
		  String s= sa.nextLine();
		s = s.toLowerCase();
		  int vowels=0;
		  int consonants=0;
		  for(int i=0;i<s.length();i++) {
			  if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				  vowels++;
			  }
			  else
				  consonants++;
		  }
		  System.out.println("The number of vowels in the given string is  "+  vowels);
		  System.out.println("The number of consonants in the given string is "+  consonants);

	

}
}