import java.util.Scanner;

class employee
{
    String empname,addr,empid;
    double sal;
    employee(String id,String name,double sal,String addr)
    {
        this.empid=id;
        this.empname=name;
        this.sal=sal;
        this.addr=addr;
    }
    void display()
    {
        System.out.println("Employee id:"+this.empid+"\nEmployee Name:"+this.empname+"\nSalary:"+this.sal+"\nAddress:"+this.addr);
    }
}
class teacher extends employee
{
    String dept,sub;
    teacher(String id,String name,double sal,String addr,String dept,String sub)
    {
        super(id,name,sal,addr);
        this.dept=dept;
        this.sub=sub;
    }
    void display()
    {
        super.display();
        System.out.println("Department:"+this.dept+"\nSubject:"+this.sub);
    }
}
public class empmain
{
    public static void main(String args[])
    {
        int n,i;
        String name,add,id,subj,dep;
        double salary;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Employees:");
        n=sc.nextInt();
        teacher arr[]=new teacher[n];
        System.out.println("Enter Employee Details:");
        for(i=0;i<n;i++)
        {
            int m=i+1;
            System.out.println(m+"th Employee Name:");
            name=sc.next();
            System.out.println(m+"th Employee id:");
            id=sc.next();
            System.out.println(m+"th Employee Salary:");
            salary=sc.nextDouble();
            System.out.println(m+"th Employee Address:");
            add=sc.next();
            System.out.println(m+"th Employee Subject:");
            subj=sc.next();
            System.out.println(m+"th Employee Department:");
            dep=sc.next();
            arr[i]=new teacher(id,name,salary,add,dep,subj);
        }
        for(i=0;i<n;i++)
        {
            arr[i].display();
        }
    }
}