package assignments;
import java.util.Scanner;
public class Assignment2 {
	public static String removeConsecutiveDuplicates(String input) {
		String k = " ";
		for (int i=0; i<input.length(); i++) {
			k = input.replaceAll("(.)\\1{1,}", "$1");
		}
		return k;
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(Assignment2.removeConsecutiveDuplicates(input));
	}
}
