import java.util.Scanner;

class Employee
{
    int n,i,id;
    String na,add;
    float sa;
}
class Teacher extends Employee()
{
    public static void main(Stringh args[])
    {
        System.out.pritln("Enter Amount of Employees:-\n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Employee[] data=new Employe e[n];
        for(i=1;i<=n;i++)
        {
            System.out.println("Enter the Data of "+i+"th Employee");
            System.out.println("Enter the Empid:-\n");
            id=sc.nextInt();
            System.out.println("Enter the Name:-\n");
            na=sc.nextLine();
            System.out.println("Enter the Salary:-\n");
            sa=sc.nextFloat();
            System.out.println("Enter the Address:-\n");
            add=sc.nextLine();
            data[i]=new Employee
        }
    }
}