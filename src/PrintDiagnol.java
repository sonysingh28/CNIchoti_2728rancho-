
public class PrintDiagnol 
{
	static int MAX = 100;

	public static void main(String[] args) 
	{
		int n=3;
		int a[][] = { {1,2,3},
				      {4,5,6},
				      {7,8,9} };
		
		printarray(a,n);
		printarray1(a,n);
		}

	
	
	public static void printarray(int m1[][],int n1)
	{
		System.out.print("Principal Diagnol is::");
		int i,j;
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n1;j++)
			{
				if(i==j)
				{
					System.out.print(m1[i][j]+",");
				}
			}
			
		}
		
		System.out.println("");
		
	}
	
	public static void printarray1(int m1[][],int n1)
	{
		System.out.print("Non-Principal Diagnol is::");
		int i,j;
		for(i=0;i<n1;i++)
		{
			for(j=0;j<n1;j++)
			{
				if((i+j)==(n1-1))
				{
					System.out.print(m1[i][j]+ ",");
				}
			}
			
		}
		System.out.println("");

		
	}

	

}
