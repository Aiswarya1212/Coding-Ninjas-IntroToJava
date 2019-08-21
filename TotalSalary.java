package practice_1;
import java.util.Scanner;
public class TotalSalary {

	public static void main(String[] args) {
		 double t_sal,allow;
		  
		  Scanner s = new Scanner(System.in);
		  
		  double basic = s.nextInt();
		 
		  char grade = s.next().charAt(0);
		  
		  double hra = ((basic*20/100.0));
		 
		  double da = ((basic*50/100.0));
		 
		  double pf = ((basic*11/100.0));
		 
		  
		  
		  if(grade == 'A')
		  {
		   allow = 1700;
		  }
		  
		  else if(grade == 'B')
		  {
		   allow = 1500;
		   
		  }
		  else
		  {
		   allow = 1300;
		   
		  }
		  
		  t_sal = basic + hra + da + allow - pf;
		  
		   System.out.println(Math.round(t_sal));

		  
		   
		 }

		}
