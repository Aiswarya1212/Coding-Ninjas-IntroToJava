import java.util.Scanner;
public class Leaders {
	public static void leaders(int[] input) {
		for (int i = 0; i < input.length; i++)
        {
            boolean flag = true;
 
            for (int j = i+1; j < input.length; j++)
            {
                if (input[j] > input[i])
                {
                    flag = false;
 
                    break;
                }
            }
 
            if (flag)
            {
                System.out.print(input[i]+" ");
            }
        }
    }
	
		
	
	
//		for (int i = 0; i < input.length; i++)  
//        { 
//            int j; 
//            for (j = i + 1; j < input.length; j++)  
//            { 
//                if (input[i] <= input[j]) 
//                    break; 
//            } 
//            if (j == input.length)  
//                System.out.print(input[i] + " "); 
//        } 
//    } 
	
	
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++){
			input[i] = s.nextInt();
		}
		Leaders.leaders(input);		
	}

}
