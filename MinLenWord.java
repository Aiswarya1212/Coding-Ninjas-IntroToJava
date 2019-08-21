import java.util.Scanner;
public class MinLenWord {
	
	
	public static String minLengthWord(String input) {
		String str = input + " ";
		  char ch = ' ';
		  int len = str.length(), l = 0;
		  int min = len, max = 0;
		  String shortest_word = "", longest_word = "", word = "";
		  for (int i = 0; i < len; i++) {
		   ch = str.charAt(i);
		   if (ch != ' ') {
		    word += ch;
		   }                                    
		   else {
		    l = word.length();
		    if (l < min) {
		     min = l;
		     shortest_word = word;
		    }                                     
		    if (l > max) {
		     max = l;
		     longest_word = word;
		    }
		    word = "";
		   }
		  }
		 return shortest_word;
		 
		 }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println(MinLenWord.minLengthWord(str));
	}

}
