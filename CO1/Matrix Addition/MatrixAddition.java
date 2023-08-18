import java.util.Scanner;

class MatrixAddition
{
	public static void main(String args[])
	{
		int i,j,r,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Order:-");
		System.out.println("Rows:-");
		r=sc.nextInt();
		System.out.println("Columns:-");
		c=sc.nextInt();
		System.out.println("Enter the Elements  of First Matrix:-");
		int m1[][]=new int[r][c];
		int m2[][]=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				m1[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter the Elements  of First Matrix:-");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				m2[i][j]=sc.nextInt();
			}
		}
		System.out.println("First Matrix is:-");
		for(i=0;i<r;i++)
		{
			System.out.println("\n");
			for(j=0;j<c;j++)
			{
				System.out.print(m1[i][j]+"\t");
			}
		}
		System.out.println("Secound Matrix is:-");
		for(i=0;i<r;i++)
		{
			System.out.println("\n");
			for(j=0;j<c;j++)
			{
				System.out.print(m2[i][j]+"\t");
			}
		}
		int s[][]=new int[r][c]; 
		System.out.println("\nSummed Matrix is:-");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				s[i][j]=m1[i][j]+m2[i][j];
			}
		}
		for(i=0;i<r;i++)
		{
			System.out.println("\n");
			for(j=0;j<c;j++)
			{
				System.out.print(s[i][j]+"\t");
			}
		}
	}
}

