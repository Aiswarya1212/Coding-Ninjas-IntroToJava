import java.util.Scanner;
public class SwapAlternate {
	
	public static void swapAlternate(int[] input){
		if (input.length%2==0) { 
		for (int i=0; i<input.length; i=i+2) {
			int temp;
			temp = input [i];
			input [i] = input[i+1];
			input[i+1] = temp;
		}
		} else {
			for (int i=0; i<input.length-1; i=i+2) {
				int temp;
				temp = input[i];
				input[i] = input[i+1];
				input[i+1] = temp;
			}
		}
	}
	
	
		static Scanner s = new Scanner(System.in);
		public static int[] takeInput(){
			
			int size = s.nextInt();
			int[] input = new int[size];
			for(int i = 0; i < size; i++){
				input[i] = s.nextInt();
			}
			return input;
		}
		
		public static void main(String[] args) {
			
			int[] input = takeInput();
			SwapAlternate.swapAlternate(input);
			for(int i = 0; i < input.length; i++){
				System.out.print(input[i] +" ");
			}
			
		}

	}