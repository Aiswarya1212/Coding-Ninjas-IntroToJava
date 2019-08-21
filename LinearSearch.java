import java.util.Scanner;
public class LinearSearch {
	
	public static int linearSearch(int[] arr, int num){
		for (int i=0; i<arr.length; i++) {
            
            	if (arr[i] == num) {
            		return i;           		     
            } 
            	
		}
		return -1;
		
	}
	
	
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s.nextInt();
		System.out.print(LinearSearch.linearSearch(arr, num));
	}
}