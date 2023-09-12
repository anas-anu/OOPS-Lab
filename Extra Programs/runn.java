import java.util.Scanner;

class fib implements Runnable
{
    int l,i;
    fib(int n)
    {
        l=n;
    }
    public void run()
    {
        int c,b=1;
        int a=0;
        System.out.print("\nFibonacci:\n"+a+"\n"+b);
        for(i=0;i<l;i++)
        {
            c=a+b;
            System.out.print("\n"+c);
            a=b;
            b=c;
        }
    }
}
class even implements Runnable
{
    int m,i;
    even(int n)
    {
        m=n;
    }
    public void run()
    {
        System.out.println("Even Numbers Upto "+m+" are:");
        for(i=0;i<m;i++)
        {
            if(i%2==0)
            {
                System.out.print("\n"+i);
            }
        }
    }
}
public class runn
{
    public static void main(String args[])
    {
        int flimit,elimit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Fibonacci limit:");
        flimit=sc.nextInt();
        System.out.println("Enter Limit of Even Numners:");
        elimit=sc.nextInt();
        fib f=new fib(flimit);
        Thread t1=new Thread(f);
        t1.start();
        even e=new even(elimit);
        Thread t2=new Thread(e);
        t2.start();
    }
}