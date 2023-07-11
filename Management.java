import java.util.Scanner;

public class Employee
{
    int eNo;
    String eName;
    double eSalary;
    public void details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Details of Employee");
        System.out.print("Employee Number:");
        eNo=sc.nextInt();
        System.out.print("Employee Name:");
        eName=sc.nextLine();
        System.out.print("Employee Salary:");
        eSalary=sc.nextDouble();
    }
    void display()
    {
        System.out.print("Emp Number:-"+eNo);
        System.out.print("Emp Name:-"+eName);
        System.out.print("Emp Salary:-"+eSalary);
    }
    public static void main(String args[])
    {
        int n,i,search,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Employees:");
        n=sc.nextInt();
        Employee arr[]=new Employee[n];
        for(i=0;i<n;i++)
        {
            arr[i]=new Employee();
            arr[i]=details();
            System.out.println("Informations About Employees");
            for(i=0;i<n;i++)
            {
                arr[i].display();
            }
            System.out.println("Enter the Employee Number You Want to Search:");
            search=sc.nextInt();
            for(i=0;i<n;i++)
            {
                if(arr[i].eNo==search)
                {
                    System.out.print("Employee Found\nEmp Number:"+employee.searchno+"\nEmp Name:"+employee.searchname+"\nEmp Salary:"+employee.searchsal);
                    flag=1;
                }             
            }
        }
        if(flag==0)
        {
            System.out.println("Employee Does not Excist");
        }
    }
}