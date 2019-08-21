package lectures;
import java.util.Scanner;
public class CheckPalindrome {
	public static boolean checkPalindrome(String str) {
		int n = str.length();
		  for (int i = 0; i < (n/2); ++i) {
		     if (str.charAt(i) != str.charAt(n - i - 1)) {
		         return false;
		     }
		  }

		  return true;
		}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(CheckPalindrome.checkPalindrome(str));
	}


}
