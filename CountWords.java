package lectures;
import java.util.Scanner;
public class CountWords {
	public static int countWords(String str) {
		int count=0;
		char ch[]= new char[str.length()];     
        for(int i=0;i<str.length();i++)  
        {  
            ch[i]= str.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count;  
    }  
	
	
	
	
	
static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		String str = s.nextLine();
		System.out.println(CountWords.countWords(str));
	}

}