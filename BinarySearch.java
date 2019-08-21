package lectures;
import java.util.Scanner;
public class BinarySearch {
	public static int binarySearch(int[] arr, int num) {
		 int l = 0, r = arr.length - 1; 
	        while (l <= r) { 
	            int m = l + (r - l) / 2; 
	  
	             
	            if (arr[m] == num) 
	                return m; 
	  
	             
	            if (arr[m] < num) 
	                l = m + 1; 
	  
	             
	            else
	                r = m - 1; 
	        } 
	  
	         
	        return -1; 
	    } 
	
	
	
	
	
	
	static Scanner s1 = new Scanner(System.in);
	
	public static int[] takeInput() {
		int size = s1.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s1.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s1.nextInt();
		System.out.print(BinarySearch.binarySearch(arr, num));
		

	}

}
