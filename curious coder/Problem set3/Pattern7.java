import java.util.Scanner;
public class Pattern7
{
	public static void main(String[] args) {
		int n;
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();
		for(int i=n;i>=1;i--)  
		{
		    for(int j=i;j>=1;j--)
		    {
		        System.out.print(j);
		    }
		    System.out.println("");
		}
		 
	}
}