import java.util.Scanner;

public class StringRev_UserInput 
{

	public static String reverse(String str)
	{
	
		if (str.isEmpty())
			return str;
		
		
		return reverse(str.substring(1))+str.charAt(0);
		
	}

	public static void main(String[] args) 
	{
		
        String str;
        System.out.print("USER INPUT::");
        Scanner s = new Scanner(System.in);
        str = s.nextLine();
        s.close();
        String reversed = reverse(str);
        System.out.println("Rversed Data :"+reversed);
	}

}
