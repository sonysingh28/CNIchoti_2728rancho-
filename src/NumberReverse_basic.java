import java.util.Scanner;

/*public class NumberReverse_basic 

{
    public static void numrev(int num)
    {
    	int rev;
    	int s = 0;
    	
    	while(num>0)
    	{
    		rev = num % 10;
    		s = (s*10)+rev;
    		num = num/10;
    	}	
    
    }
	
	
	
	public static void main(String[] args) 
	{
		int n ;
		System.out.println("USER INPUT::");
		Scanner s = new Scanner(System.in);
        n = s.nextInt();
        s.close();
	    System.out.println("REVERSED INPUT IS::"+numrev(s));
        

	}

}*/


class NumberReverse_basic
{
  public static void main(String args[])
  {
    int n, reverse = 0;

    System.out.println("Enter an integer to reverse");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();

    while(n != 0)
    {
      reverse = reverse * 10;
      reverse = reverse + n%10;
      n = n/10;
    }

    System.out.println("Reverse of the number is " + reverse);
  }
}


