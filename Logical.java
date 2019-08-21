import java.util.Scanner;
public class Logical {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		boolean d = (a>=b) && (a<=c);
		boolean e = (a>=b) || (a<=c);
		boolean f = !(a>=b);
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
