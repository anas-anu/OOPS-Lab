import java.util.*;
class member
{
    String name,address;
    int age,phno,salary;
    member(String mn,String addr,int Ag,int no,int sal)
    {
        name=mn;
        address=addr;
        age=Ag;
        phno=no;
        salary=sal;
    }
    public void printSalary()
    {
        System.out.println("Salary");
        System.out.println("\n"+salary);
    }
}
class Employee extends member{
    String specilization;
    Employee(String name,String address,int age,int phno,int salary,String spec)
    {
        super(name,address,age,phno,salary);
        specilization=spec;
    }
}
class Manager extends member{
    String Department;
    Manager(String name,String address,int age,int phno,int salary,String specilization,String dept)
    {
        super(name,address,age,phno,salary,specilization);
        Department=dept;
    }
    void display(String name,String address,int age,int phno,int salary,String specilization,String Department )
    {
        System.out.println(name+"\t"+age+"\t"+phno+"\t"+address+"\t"+salary+"\t"+specilization+"\t"+Department);
        
    }
}
class inherit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String ename,eaddr,esp,mdp;
        int eage,ephno,esalary;
        System.out.println("Enter the details:");
        System.out.print("enter the name of member: ");
        ename=sc.next();
        System.out.print("enter the age of member: ");
        eage=sc.nextInt();
        System.out.print("enter the phone number of member: ");
        ephno=sc.nextInt();
        System.out.print("enter the address of member: ");
        eaddr=sc.next();
        System.out.print("enter the salary of member: ");
        esalary=sc.nextInt();
        System.out.print("enter the specialization of employee: ");
        esp=sc.next();
        System.out.print("enter the department of manager: ");
        mdp=sc.next();
        member obj=new member(String ename;String eaddr;String esp;String mdp;int eage;int ephno;int esalary;);
       for(Manager obj:m)
       {
        m.display();
       }
    }
}