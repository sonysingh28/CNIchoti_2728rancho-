import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) 
	{
		String st;
		System.out.print("Enter the String::");
		//System.out.println("");
		Scanner s = new Scanner(System.in);
		st = s.nextLine();
		s.close();
		Reverse(st);
		System.out.print("Reversed string is::"+Reverse(st));

	}
	
	public static String Reverse(String str)
	{
	
		int l = str.length()-1;
		int i;
		String rev = "";
		
		for(i=l;i>=0;i--)
		{
			
			rev= rev+str.charAt(i);
		}
		
		return rev;
	}
	
	

}
