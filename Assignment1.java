package assignments;
import java.util.Scanner;
public class Assignment1 {
	public static void insertionSort(char [] arr) {
		for (int i=1; i<arr.length; i++) {
			int j=i-1;
			char temp=arr[i];
			while (j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		
	}
	
	public static boolean isPermutation(String input1, String input2) {
		if (input1.length() != input2.length()) {
		      return false;
		    }
		    int[] count = new int[256];
		    for (int i = 0; i < input1.length(); i++) {
		      int index = input1.charAt(i) - '0';
		      count[index] += 1;
		    }
		    for (int i = 0; i < input2.length(); i++) {
		      int index = input2.charAt(i) - '0';
		      count[index] -= 1;
		    }
		    for (int i = 0; i < count.length; i++) {
		      if (count[i] != 0) return false;
		    }
		    return true;  
		  }
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input1 = s.next();
		String input2 = s.next();
		System.out.println(Assignment1.isPermutation(input1, input2));
	}
}

