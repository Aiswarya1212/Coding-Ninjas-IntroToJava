import java.util.Scanner;
public class Relational {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		int j = s.nextInt();
		
		boolean isEq = (i == j);
		boolean isnEq = (i != j);
		boolean isgr = (i > j);
		boolean isless = (i < j);
		boolean islessEq = (i <= j);
		boolean isgrEq = (i >= j);
		
		System.out.println(isEq);
		System.out.println(isnEq);
		System.out.println(isgr);
		System.out.println(isless);
		System.out.println(islessEq);
		System.out.println(isgrEq);
		
		

	}

}
