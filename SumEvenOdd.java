package practice_1;
import java.util.Scanner;
public class SumEvenOdd {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int x;
	        int Even = 0, Odd = 0;
	        while (n != 0) {
	        	x = n % 10;
	        	if (x%2==0)
	        	{
	        		Even = Even + x;
	        	} else 
	        	{
	        		Odd = Odd + x;
	        	}
	        	n = n/10;
	        }
	        System.out.println(Even + " " + Odd);

		
	}
}