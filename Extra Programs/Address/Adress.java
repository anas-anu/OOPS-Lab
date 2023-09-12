import java.util.Scanner;
class Adress
{
	public static void main(String args[])
	{
		String adr,name;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.println("Enter Your Name:\n");
		name=sc.nextLine();
		sc=new Scanner(System.in);
		System.out.println("Enter Your Address:");
		adr=sc.nextLine();
		System.out.println("\nHi "+name);
		System.out.println("Your Address is:\n"+adr);
	}
}