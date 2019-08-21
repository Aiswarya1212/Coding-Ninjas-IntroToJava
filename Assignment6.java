package assignments;
import java.util.Scanner;
public class Assignment6 {
	static final int ASCII_SIZE=256;
	public static String compress(String inputString) {
		if (inputString==null) {
			return null;
		}
		if (inputString.length()==0) {
			return "";
		}
		String op=inputString.charAt(0)+"";
		int count=1;
		for (int i=1; i<inputString.length(); i++) {
			if (inputString.charAt(i)==inputString.charAt(i-1)) {
				count++;
				if (i==inputString.length()-1) {
					op += count;
				}
			} else {
				if (count>1) {
					op += count + "" + inputString.charAt(i);
				} else {
					op += inputString.charAt(i);
				}
				count=1;
			}
		}
		
		return op;
		
			}
	
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Assignment6.compress(input));
	}
}

