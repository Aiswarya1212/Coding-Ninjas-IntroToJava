import java.util.Scanner;
public class ArrangeNum {
	
	public static int[] arrange(int n) {
		int arr [] = new int [n];
		arr[0] = 1;
		arr[1] = 3;
		arr[n-2] = 4;
		arr[n-1] = 2;
		
		if (n%2==0) {
			arr[n/2] = n;
			 
			for (int i = 2; i<(n/2); i++) {
				arr[i] = arr[i-1]+2;
			}
			for (int i = (n/2)+1; i<n-2; i++) {
				arr[i] = arr[i-1] - 2;
			}
		} else {
			
			arr[(n-1)/2] = n;
			arr[(n-1)/2+1] = n-1;
			for (int i=2; i<(n-1)/2; i++) {
				arr[i]=arr[i-1]+2;
			}
			for (int i= ((n-1)/2)+2; i<n-2; i++) {
				arr[i]=arr[i-1]-2;
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {
		
			
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int arr[] = ArrangeNum.arrange(n);
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] +" ");
			}	

	}

}
