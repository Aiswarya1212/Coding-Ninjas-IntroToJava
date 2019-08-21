import java.util.Scanner;
public class FahToCel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int f = s.nextInt();
		
		int cel1 = (5*(f-32))/9;
		
		int cel2 = (int)((5.0/9)*(f-32));
		
		System.out.println(cel1);
		System.out.println(cel2);

	}

}
