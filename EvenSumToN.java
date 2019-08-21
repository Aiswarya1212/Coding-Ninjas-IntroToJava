package while_loop;
import java.util.Scanner;
public class EvenSumToN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int  i = 1;
		int d = 0;
		s = new Scanner(System.in);
		
		int N = s.nextInt();	
		
		
		
		while(i <= N)
		{
			if(i % 2 == 0)
			{
				d = d + i; 
			}
						i++;
		}
		System.out.println(d);
		
	}
}
