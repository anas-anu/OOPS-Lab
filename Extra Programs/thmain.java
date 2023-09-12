import java.util.Scanner;

class prime extends Thread
{
    int i,j,count,pcount=0;
    Scanner sc=new Scanner(System.in);
    prime(int count)
    {
        this.count=count;
    }
    public void run()
    {
        System.out.println("Prime Numbers upto "+count+" is:");
        for(i=1;pcount<count;i++)
        {
            boolean flag=true;
            if(i==1)
            {
                i++;
            }
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                System.out.print(" "+i);
                pcount++;
            }
        }    
    }
}
class table extends Thread
{
    int i,count;
    table(int count)
    {
        this.count=count;
    }
    public void run()
    {
        System.out.println("Multiplication Table of 5:");
        for(i=1;i<=count;i++)
        {
            System.out.print("\n5x"+i+"="+(5*i));
        }
    }
}
public class thmain
{
    public static void main(String srgs[])
    {
        int n,mul;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Prime Number Limit:");
        n=sc.nextInt();
        System.out.println("Enter Multiplication Table Limit:");
        mul=sc.nextInt();
        table m=new table(mul);
        m.start();
        prime p=new prime(n);
        p.start();
    }
}