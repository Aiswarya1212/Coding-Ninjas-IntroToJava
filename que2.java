import java.util.Scanner;
public class que2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i,j;
		for(i=1;i<=n;i++){  
		      for(j=1;j<=n;j++){  
		          if(i==j)  
		             System.out.print("*");  
		            else  
		           System.out.print("0");  
		      }  
		      j--;  
		       System.out.print("*");  
		      while(j>=1){  
		          if(i==j)  
		           System.out.print("*");  
		          else  
		           System.out.print("0");  
		          j--;  
		      }  
		    System.out.println("");  
		  }  
		         }  
		}  