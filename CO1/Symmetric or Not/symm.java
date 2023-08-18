import java.util.Scanner;

class symm
{
	public static void main(String args[])
	{
		int i,j,r,c,flag=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Order:-");
		n=sc.nextInt();
		System.out.println("Enter the Elements:-");
		int m[][]=new int[n][n];
		int tra[][]=new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				m[i][j]=sc.nextInt();
			}
		}
		System.out.println("Original Matrix is:-");
		for(i=0;i<n;i++)
		{
			System.out.println("\n");
			for(j=0;j<n;j++)
			{
				System.out.print(m[i][j]+"\t");
			}
		}
		System.out.println("\nTranspose of Matrix:-");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				tra[j][i]=m[i][j];
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println("\n");
			for(j=0;j<n;j++)
			{
				System.out.print(tra[i][j]+"\t");
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(tra[i][j]==m[i][j])
				{
					flag++;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("\nIts a Symmetric Matrix");
		}
		else
		{
			System.out.println("\nIts Skew Symmetric Matrix");
		}
	}
}

