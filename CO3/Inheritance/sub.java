class main
{
    int id=2355;
}
class sub extends main
{
    int roll=15;
    public static void main(String args[])
    {
        sub s=new sub();
        System.out.println("Roll ni is:-"+s.roll);
        System.out.println("Id of Studentis:-"+s.id);
    }
}