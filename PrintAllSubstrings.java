package lectures;
import java.util.Scanner;
public class PrintAllSubstrings {
	public static void printSubstrings(String str) {
		for (int i=0; i<str.length()+1; i++) {
			for (int j=i+1; j<str.length()+1; j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		PrintAllSubstrings.printSubstrings(str);
	}


}