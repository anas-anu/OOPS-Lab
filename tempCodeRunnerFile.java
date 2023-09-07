import java.util.Scanner;

class sports
{
    String sport;
    int rating;
    sports(String spr,int ra)
    {
        sport=spr;
        rating=ra;
    }
}
class student extends sports
{
    String grade;
    double overall;
    student(String spr,int ra,String gr,double ov)
    {
        super(spr,ra);
        grade=gr;
        overall=ov;
    }
}
public class result extends student
{
    result(String spr,int ra,String gr,double ov)
    {
        super(spr,ra,gr,ov);
    }
    void show()
    {
        System.out.println("Sports Details of Student:\nSport:"+sport+"Rating:"+rating+"Academic Details of Student:\nGrade:"+grade+"Everall Percentage"+overall+);
    }
    public static void main(String args[])
    {
        String s,gr;
        int ra;
        double ov;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sports Details of Student:");
        s=sc.next();
        System.out.println("Enter Rating out of 10:");
        ra=sc.nextInt();
        System.out.println("Enter Academic Grade:");
        gr=sc.next();
        System.out.println("Enter Overall Percentage:");
        ov=sc.nextDouble();
        result r=new result(s,ra,gr,ov);
        r.show();
    }
}