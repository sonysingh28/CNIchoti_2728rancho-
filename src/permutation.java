import java.util.*;
public class permutation {

	public static void main(String[] args) 
	{
		String str;
		System.out.print("USER INPUT::");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		sc.close();
		permutation p = new permutation();
		int n = str.length();
		p.permutate(str, 0, n-1);
		

	}
	
	
	public  void permutate(String str, int l, int r)
	{
		
		if(l==r)
		{
			System.out.println(str);
		}
		
		else
		{
			for(int i=l;i<=r;i++)
			{
				str = swap(str,l,i);
				permutate(str,l+1,r);
				str = swap(str,l,i);
				
			}
		}
		
	}
	
	public String swap(String a, int i,int j)
	{
        char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
	}

}
