import java.util.Scanner;

public class StringReverse_basic 
{

	
	
	public static String reverse(String str)
	{
		String rev= "";
		int i, l;
		l= str.length()-1;
		
		for(i=l;i>=0;i--)
		{
			rev= rev+str.charAt(i);
			
		}
		return rev;
		
	}
	
	public static void main(String[] args) 
	
	{   
		String data;
		System.out.print("USER INPUT ::");
		Scanner s = new Scanner(System.in);
	    data = s.nextLine();
	    s.close();
	    System.out.println("REVERSED INPUT IS::"+reverse(data));
   
	    
	    
	}

}
