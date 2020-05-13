package day90s;

public class Day1program1 {

	public static void main(String[] args) {
	
		/*
		 * Write a Java Program to find the occurance of the character 'o' in the
		 * following String. 
		 * Input: "You have no choice other than following me!"
		 * output: Occurance of o is: 6
		 */
		
		String txt = "You have no choice other than following me!";
		char ch = 'o';
		
		//convert string int toCharArray();
		char[] charArray = txt.toCharArray();
		//System.out.println(charArray[2]);
		
		//intialise hashmap to store char and its count
		
		//Map<Character, Integer> mp = new HashMap<Character, Integer>();
		int count =0;
		
		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i]==ch) {
				count = count + 1;
				
			}
			
		}
		System.out.println(count);
		
		
	}
}
