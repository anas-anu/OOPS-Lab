import java.util.Scanner;
class sum
{
	public static void main(String args[])
	{
		int lim,res,i;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Enter the Limit:");
		lim=sc.nextInt();
		res=0;
		for(i=0;i<=lim;i++)
		{
			res+=i;
		}
		System.out.println("Sum is:\n"+res);
	}
}