package practiseJava;

public class findAVowel {
	public static void main(String[] args) {
		
		System.out.println(findVowelsInAString("tejeswara"));
	}
	
	public static boolean findVowelsInAString(String S) {
		
		return S.matches(".*[aeiou].*");
	}
}
