package practice_1;
import java.util.Scanner;
public class PowOfNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int n = s.nextInt();
		long result = 1;
		while (n != 0)
		{
			result *= x;
			--n;
		}
		System.out.println(result);
	}

}
