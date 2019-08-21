import java.util.Scanner;
public class que3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		
		int temp, rem, ans=0, num=0;
		temp=n;
		
		while (temp!=0) {
			temp/=10;
			++num;
		}
		temp=n;
		while (temp!=0) {
			rem=temp%10;
			ans+=Math.pow(rem, num);
			temp/=10;
		}
		if (ans==n) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		

	}

}
