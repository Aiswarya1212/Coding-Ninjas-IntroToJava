import java.util.Scanner;
public class TwoDArray {
	public static void print2DArray(int input[][]) {
		int k= input.length;
		for (int i=0; i<input.length; i++) {
			for (int l=k-1; l>=0; l--) {
				for (int j=0; j<input[i].length; j++) {
					System.out.print(input[i][j]+" ");
				}
				System.out.println();
			}
			k--;
		}
	}
	
	
	
	
	
	
static Scanner s = new Scanner(System.in);
	
	public static int[][] takeInput(){
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) {
		int[][] input = takeInput();
		TwoDArray.print2DArray(input);
	}
}
