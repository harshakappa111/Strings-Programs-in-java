import java.util.*;
class ReverseTheSentence {

	public static void main(String[] args) {
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter the sentence");
	 String o= sc.next();
	 String rvn="";
	   String []a   = o.split(" ");
	    for(int i=0;i<a.length;i++) {
	    	String w= a[i];
	    	String rv="";
	    	for(int j=w.length()-1;j>=0;j--) {
	    		rv=rv+w.charAt(j);
	    	}
	    	rvn=rvn+rv;
	    }
	    System.out.println(rvn);
}
}