package lectures;
import java.util.Scanner;
public class SelectionSort { 
	public static void selectionSort (int [] input) {
		for (int i=0; i<input.length-1; i++) {
			int min=input[i];
			int minIndex=i;
			for (int j=i+1; j<input.length; j++) {
				if (input[j]<min) {
					min=input[j];
					minIndex=j;
				}
			}
			if (minIndex != 0) {
				input[minIndex]=input[i];
				input[i]=min;
				
			}
		}
	}
	
	
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		SelectionSort.selectionSort(arr);
		print(arr);
	}
}

