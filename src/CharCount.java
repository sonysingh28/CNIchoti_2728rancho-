import java.util.*;

public class CharCount 
{

	public static void main(String[] args) 
	{
		
          String st;
          Scanner sc = new Scanner(System.in);
          st = sc.nextLine();
          sc.close();
          System.out.print("USER INPUT::");
          checkch(st);
          
	}
	
	public static void checkch(String str)
	{
		final int MAX_CHAR = 256;
		
		int i, j;
		int c=0;
		int count[] = new int[MAX_CHAR];
		
		int len= str.length();
		
		for(i=0;i<len;i++)
		{
			count[str.charAt(i)]++;
			
		}
		
		char ch[] =  new char[str.length()];
		
		for(i=0;i<len;i++)
		{
			ch[i] = str.charAt(i);
			for(j=0;j<=i;j++)
			{
				if(str.charAt(i)==ch[j])
					c++;
			}
		}
		
		if(c==1)
		{
			System.out.println("No. of occurence of "+str.charAt(i)+"is"+count[str.charAt(i)]);
		}
		
	}
	

}
