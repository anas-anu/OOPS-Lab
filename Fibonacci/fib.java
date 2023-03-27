import java.util.Scanner;
class fib
{
	public static void main(String args[])
	{
		int lim,res,i,a,b;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Enter the Limit:");
		lim=sc.nextInt();
		res=0;
		a=0;b=1;
		System.out.println("Fibonacci Series is:");
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(i=0;i<lim;i++)
		{
			res=a+b;
			System.out.print(res+" ");
			a=b;
			b=res;
		}
	}
}