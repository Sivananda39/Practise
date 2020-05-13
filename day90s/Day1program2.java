package day90s;

public class Day1program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2. Check for the palindrome of the given string: Input: "malayalam" output:
		 * Yes, Palindrome Input: "testleaf" output: No, not a palindrome.
		 */
		
		String pal = "TENET";
		
		String rev = "";
		
		for (int i = pal.length()-1;i >= 0; i--) {
			
			rev +=pal.charAt(i);
			
		}
		
		if (rev.equals(pal)) {
			System.out.println("Yes, Palindrome");
		}
		else {
			System.out.println("No, Not a palindrome");
		}
		
		
		
		
		
		
	}

}
