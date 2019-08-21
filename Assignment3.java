package assignments;
import java.util.Scanner;
public class Assignment3 {
	public static String reverseEachWord(String input) {
		
	        String[] words = input.split(" ");
	         
	        String reverseString = "";
	         
	        for (int i = 0; i < words.length; i++) 
	        {
	            String word = words[i];
	             
	            String reverseWord = "";
	             
	            for (int j = word.length()-1; j >= 0; j--) 
	            {
	                reverseWord = reverseWord + word.charAt(j);
	            }
	             
	            reverseString = reverseString + reverseWord + " ";
	        }
	         
	        
	         
	        return reverseString;
		}
	         
	       
	    
	
	
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Assignment3.reverseEachWord(input));
	}
}
