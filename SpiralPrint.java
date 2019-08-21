package lectures;
import java.util.Scanner;
public class SpiralPrint {
	public static void spiralPrint(int matrix[][]) { 
		if (matrix.length == 0 || matrix[0].length == 0) {
	        return;
	    }
	 
	    int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
	    int dir = 1;
	 
	    while (top <= bottom && left <= right) {
	        if (dir == 1) {    // left-right
	            for (int i = left; i <= right; ++i) {
	                System.out.print(matrix[top][i] + " ");
	            }
	 
	            ++top;
	            dir = 2;
	        } else if (dir == 2) {     // top-bottom
	            for (int i = top; i <= bottom; ++i) {
	                System.out.print(matrix[i][right] + " ");
	            }
	 
	            --right;
	            dir = 3;
	        } else if (dir == 3) {     // right-left
	            for (int i = right; i >= left; --i) {
	                System.out.print(matrix[bottom][i] + " ");
	            }
	 
	            --bottom;
	            dir = 4;
	        } else if (dir == 4) {     // bottom-up
	            for (int i = bottom; i >= top; --i) {
	                System.out.print(matrix[i][left] + " ");
	            }
	 
	            ++left;
	            dir = 1;
	        }
	    }
	}
	
	
static Scanner s = new Scanner(System.in);
	
	public static int[][] takeInput2D(){
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
		int a[][] = takeInput2D();
		SpiralPrint.spiralPrint(a);
	}
}
