package lectures;
import java.util.Scanner;
public class TwodArrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Rows: ");
		int rows=s.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols=s.nextInt();
		int input [][] = new int [rows][cols];
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				System.out.println("Enter element at" + i + "row" + j + "colums");
				input[i][j]=s.nextInt();
			}
		}
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				System.out.print(input[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
