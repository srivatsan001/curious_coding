public class Pattern11
{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=i-1;j++)
		    
		    {
		        System.out.print(" ");

		}
			for(int j=1;j<=(n*2)-(2*i-1);j++)
		        {
		            System.out.print("*");
		        }
		        System.out.println(" ");
		    }
		    
	}
	
}