package lectures;
import java.util.Scanner;
public class RowWiseSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		int input [][]=new int [m][n];
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				input[i][j]=s.nextInt();
			}
		}
		int sum=0;
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				sum=sum+input[i][j];
				}
			System.out.print(sum+ " ");
			sum=0;
			
		}
		

	}

}
