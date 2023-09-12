import java.util.Scanner;

interface proto
{
    void getdata();
    void area();
    void perimeter();
}
class circle implements proto
{
    double r,pi=3.14;
    Scanner sc=new Scanner(System.in);
    @Override
    public void getdata()
    {
        System.out.println("Enter Radius:");
        r=sc.nextDouble();
    }
    @Override
    public void area()
    {
        System.out.println("Area of Circle:"+(pi*r*r));
    }
    @Override
    public void perimeter()
    {
        System.out.println("Perimeter is:"+(2*pi*r));
    }
}
class rectangle implements proto
{
    double w,l;
    Scanner sc=new Scanner(System.in);
    @Override
    public void getdata()
    {
        System.out.println("Enter the Width of Rectangle:");
        w=sc.nextDouble();
        System.out.println("Enter the Length of Rectangle:");
        l=sc.nextDouble();
    }
    @Override
    public void area()
    {
        System.out.println("Area of Rectangle is:"+(w*l));
    }
    @Override
    public void perimeter()
    {
        System.out.println("Perimeter of Rectangle is:"+(2*(w+l)));
    }
}
public class menu
{
    public static void main(String args[])
    {
        int ch;
        Scanner sc=new Scanner(System.in);
        circle c=new circle();
        rectangle re=new rectangle();
        do
        {
            System.out.print("\n1.Circle\n2.Rectangle\n3.Exit\nEnter Your Choice:\n");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    c.getdata();
                    c.area();
                    c.perimeter();
                    break;
                case 2:
                    re.getdata();
                    re.area();
                    re.perimeter();
                    break;
                case 3:
                    System.out.println("......Exitted......");
                    System.exit(0);
            }
        }
        while(true);
    }
}