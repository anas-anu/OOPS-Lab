import java.util.Scanner;

class product
{
    int pcode;
    String pname;
    double price;
    double lowest;
    void data(int c,String n,double p)
    {
        pcode=c;
        pname=n;
        price=p;
    }
    void display()
    {
        System.out.print(pcode+"\t \t"+pname+"\t \t"+price);
    }
    static void lowest(double p1,double p2,double p3)
    {
        if(p1<p2&&p1<p3)
        {
            System.out.println("\nFirst Product Price is Lower");
        }
        else if(p2<p1&&p2<p3)
        {
            System.out.println("\nSecound Product Price is Lower");
        }
        else if(p3<p1&&p3<p2)
        {
            System.out.println("\nThird Product Price is Lower");
        }
        else
        {
            System.out.println("\nProducts Have Same Price");
        }
    }
    public static void main(String args[])
    {
        int a,d,g;
        double c,f,i;
        Scanner sc=new Scanner(System.in);
        product pr1=new product();
        product pr2=new product();
        product pr3=new product();
        System.out.println("Enter First Product Details:\nProduct Code:");
        a=sc.nextInt();
        System.out.println("Name:");
        String str1=sc.next();
        System.out.println("Price:");
        c=sc.nextDouble();
        System.out.println("Enter Secound Product Details:\nProduct Code:");
        d=sc.nextInt();
        System.out.println("Name:");
        String str2=sc.next();
        System.out.println("Price:");
        f=sc.nextDouble();
        System.out.println("Enter Third Product Details:\nProduct Code:");
        g=sc.nextInt();
        System.out.println("Name:");
        String str3=sc.next();
        System.out.println("Price:");
        i=sc.nextDouble();
        pr1.data(a,str1,c);
        pr2.data(d,str2,f);
        pr3.data(g,str3,i);
        System.out.println("First Product Details");
        pr1.display();
        System.out.println("\nSecound Product Details");
        pr2.display();
        System.out.println("\nThird Product Details");
        pr3.display();
        lowest(pr1.price,pr2.price,pr3.price);
    }
}