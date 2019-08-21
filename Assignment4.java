package assignments;
import java.util.Scanner;
public class Assignment4 {
	public static String removeAllOccurrencesOfChar(String input, char c) {
		 StringBuilder strBuilder = new StringBuilder();
	        char[] rmString = input.toCharArray();
	        for(int i=0; i<rmString.length; i++){
	            if(rmString[i] == c){

	            } else {
	                strBuilder.append(rmString[i]);
	            }
	        }
	        return strBuilder.toString();
	    }
	
		
    
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		char c = s.next().charAt(0);
		System.out.println(Assignment4.removeAllOccurrencesOfChar(input, c));
	}
}
