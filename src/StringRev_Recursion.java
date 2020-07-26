
public class StringRev_Recursion 
{

	
	void reverse(String str)
	{
		
		if ((str==null)||(str.length()<=1))
		{
			System.out.println(str);
		}
			
		else
		{
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0,str.length()-1));
		}
		
	}	
	
	
	
	public static void main(String[] args) 
	{
		String str = "Sony Singh";
		StringRev_Recursion r = new StringRev_Recursion();
		System.out.print("Madam saas Madam:");
		r.reverse(str);
	}

}
