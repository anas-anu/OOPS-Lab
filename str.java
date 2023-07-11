import java.util.Scanner;
import java.util.Arrays;

class str
{
	public static void main(String args[])
	{
		String str,newstr;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		str=sc.nextLine();
		System.out.println("Entered String is:\n"+str);
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		newstr=new String(ch);
		System.out.println("String After Sort is:\n"+newstr);
	}
}