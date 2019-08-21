import java.util.Scanner;
public class ArraySum {
	public static int [] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int input [] = new int[size];
		for (int i = 0; i < size; i++) {
			input [i] = s.nextInt();
		}
		return input;
	}
	
	public static int sum (int[] input) {
		int sum=0;
		for (int i = 0; i<input.length; i++) {
			
			sum = sum+input[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[] = takeInput();
		int sum = sum(arr);
		System.out.println(sum);

	}

}
