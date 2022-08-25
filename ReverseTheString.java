import java.util.*;

public class ReverseTheString {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter the String");
	 String s=sc.next();
	 String k="";
	 for(int i=s.length()-1;i>=0;i--) {
		  k=k+s.charAt(i);
	 }
System.out.println(k);
}
}