import java.util.Scanner;

class complex
{
	public static void main(String args[])
	{
		int real,imaginary,a1,a2,b1,b2,a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Complex Number");
		System.out.println("Real Part:");
		a1=sc.nextInt();
		System.out.println("Imaginary Part:");
		b1=sc.nextInt();
		System.out.println("Enter the Secound Complex Number");
		System.out.println("Real Part:");
		a2=sc.nextInt();
		System.out.println("Imaginary Part:");
		b2=sc.nextInt();
		System.out.println("Complex Numbers Are:");
		System.out.println(a1+"+"+"i"+b1);
		System.out.println(a2+"+"+"i"+b2);
		a=a1+a2;
		b=b1+b2;
		System.out.println("Sum of Complex Number is:\n"+a+"+"+"i"+b);
	}
}