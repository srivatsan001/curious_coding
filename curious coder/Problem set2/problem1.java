import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x<0)
		{
		    x = -x;
		}
		for(int i=0;i<y;i++)
		{
		    System.out.println(x);
		}
		
	}
}