class shape
{
    static int area(int a)
    {
        return a*a;
    }
    static int area(int a,int b)
    {
        return a*b;
    }
    static double area(double r)
    {
        return 3.14*r*r;
    }
}
class main
{
    public static void main(String args[])
    {
        System.out.println("Area of a Square is:"+shape.area(10));
        System.out.println("Area of a Rectangle is:"+shape.area(10,5));
        System.out.println("Area of a Circle is:"+shape.area(3.0));
    }
}