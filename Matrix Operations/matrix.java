import java.util.Scanner;

class matrix
{
    public static int i,j,r,c,count=1;
    public static Scanner sc=new Scanner(System.in);

    public static void main(String args[])
    {
        int ch,r1,c1;
        System.out.println("Enter Number of Rows:");
        r=sc.nextInt();
        System.out.println("Enter Number of Columns:");
        c=sc.nextInt();
        int m1[][]=new int[r][c];
        int m2[][]=new int[r][c];
        System.out.println("Enter the Elements of First Matrix:\n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
               m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the Elements of Secound Matrix:\n");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
               m2[i][j]=sc.nextInt();
            }
        }
        do
        {
            System.out.println("\n1.ADDITION\n2.SUBTRACTION\n3.TRANSPOSE\n4.SYMMETRIC OR NOT\n5.DISPLAY\n6.EXIT\nEnter Your Choice:");
            ch=sc.nextInt();
            switch(ch)
            {
            case 1:
                int s[][]=new int[r][c];
                System.out.println("Summed Matrix is:");
                for(i=0;i<r;i++)
                {
                    for(j=0;j<c;j++)
                    {
                        s[i][j]=m1[i][j]+m2[i][j];
                        System.out.print(s[i][j]+"\t");
                    }
                }
                break;
            case 2:
                int sub[][]=new int[r][c];
                System.out.println("Subtracted Matrix is:");
                for(i=0;i<r;i++)
                {
                    for(j=0;j<c;j++)
                    {
                        sub[i][j]=m1[i][j]-m2[i][j];
                        System.out.print(sub[i][j]+"\t");
                    }
                }
                break;
            case 3:
                int tra1[][]=new int[c][r];
                int tra2[][]=new int[c][r];
                System.out.println("First Matrix is:");
                for(i=0;i<r;i++)
                {
                    for(j=0;j<c;j++)
                    {
                        System.out.print(m1[i][j]+"\t");
                    }
                }
                System.out.println("\nSecound Matrix is:");
                for(i=0;i<r;i++)
                {
                    for(j=0;j<c;j++)
                    {
                        System.out.print(m2[i][j]+"\t");
                    }
                }
                System.out.println("\nTranspose of First Matrix is:");
                for(i=0;i<r;i++)
                {
                    for(j=0;j<c;j++)
                    {
                        tra1[j][i]=m1[i][j];
                    }
                }
                for(i=0;i<c;i++)
                {
                    for(j=0;j<r;j++)
                    {
                        System.out.print(tra1[i][j]+"\t");
                    }
                }
                System.out.println("\nTranspose of Secound Matrix is:\n");
                for(i=0;i<r;i++)
                {
                    for(j=0;j<c;j++)
                    {
                        tra2[j][i]=m2[i][j];
                    }
                }
                for(i=0;i<c;i++)
                {
                    for(j=0;j<r;j++)
                    {
                        System.out.print(tra2[i][j]+"\t");
                    }
                }
                break;
            case 4:
                System.out.println("Enter Number of Rows:");
                r1=sc.nextInt();
                System.out.println("Enter Number of Columns:");
                c1=sc.nextInt();
                int m3[][]=new int[r1][c1];
                int tran[][]=new int[c1][r1];
                System.out.println("Enter the Elements of Matrix:\n");
                for(i=0;i<r1;i++)
                {
                    for(j=0;j<c1;j++)
                    {
                       m3[i][j]=sc.nextInt();
                    }
                }
                System.out.println("\nMatrix is:");
                for(i=0;i<r1;i++)
                {
                    for(j=0;j<c1;j++)
                    {
                        System.out.print(m3[i][j]+"\t");
                    }
                }
                System.out.println("\nTranspose of Matrix is:");
                for(i=0;i<r1;i++)
                {
                    for(j=0;j<c1;j++)
                    {
                        tran[j][i]=m3[i][j];
                    }
                }
                for(i=0;i<c1;i++)
                {
                    for(j=0;j<r1;j++)
                    {
                        System.out.print(tran[i][j]+"\t");
                    }
                }
                for(i=0;i<r1;i++)
                {
                    for(j=0;j<c1;j++)
                    {
                        if(m3[i][j]!=tran[i][j])
                        {
                            count++;
                            break;
                        }
                    }
                }
                if(count==1)
                {
                    System.out.println("\nIts a Symmetric Matric");
                }
                else
                {
                    System.out.println("\nIts a Skew Symmetric Matrix");
                }
                break;
            case 5:
                System.out.println("First Matrix is:\n");
                for(i=0;i<r;i++)
                {
                    for(j=0;j<c;j++)
                    {
                        System.out.print(m1[i][j]+"\t");
                    }
                }
                System.out.println("\nSecound Matrix is:");
                for(i=0;i<r;i++)
                {
                    for(j=0;j<c;j++)
                    {
                        System.out.print(m2[i][j]+"\t");
                    }
                }
                break;
            case 6:
                return;
            default:
                System.out.println("Please Choose a Valid Option");
            }
        }
        while(ch!=6);
    }   
}