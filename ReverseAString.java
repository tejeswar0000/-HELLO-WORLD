package practiseJava;

public class ReverseAString {

	public static void main(String[] args) {
		String s="tejeswara";
		String r="";
		char c;
		System.out.println("Original string is: "+s);
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			r=c+r;
		}
		System.out.println("Reversed string is: "+r);
		
	}

	
	
	
}
