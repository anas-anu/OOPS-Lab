class Adder
{
    static int add(int a)
    {
        return a;
    }
    static int add(int a,int b)
    {
        return a+b;
    }
    static int add(int a,int b,int c)
    {
        return a+b+c;
    }
    static int add(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }
    static int add(int a,int b,int c,int d,int e)
    {
        return a+b+c+d+e;
    }
}
class Overloading
{
    public static void main(String args[])
    {
        System.out.println(Adder.add(10));
        System.out.println(Adder.add(10,10));
        System.out.println(Adder.add(10,10,10));
        System.out.println(Adder.add(10,10,10,10));
        System.out.println(Adder.add(10,10,10,10,10));
    }
}
