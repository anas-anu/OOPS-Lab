import java.util.Scanner;

class strings
{
    public static void main(String args[])
    {
        String s1,s2,s3,s4,ch,re,in;
        int co,n,a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String:-");
        s1=sc.nextLine();
        System.out.println("Enter Secound String:-");
        s2=sc.nextLine();
        System.out.println("Joined String is:-");
        s3=s1.concat(s2);
        System.out.println(s3);
        System.out.println("Comare "+s1+" "+s2+" is:-");
        co=s1.compareTo(s2);
        System.out.println(co);
        System.out.println("Enter Character to Replace:-");
        ch=sc.nextLine();
        System.out.println("Enter Character to Input:-");
        in=sc.nextLine();
        re=s3.replace(ch,in);
        System.out.println(re);
        System.out.println("Enter a String With White Space:-");
        s4=sc.nextLine();
        System.out.println("Trimmed String is:-");
        System.out.println(s4.trim());
        System.out.println("Enter the Possition of Character you Want:-");
        n=sc.nextInt();
        System.out.println("Character at POssition "+n+" is:-");
        System.out.println(s3.charAt(n));
        System.out.println("Sub String is:-");
        System.out.println("Initial Possition:-");
        a=sc.nextInt();
        System.out.println("Final Possition:-");
        b=sc.nextInt();
        System.out.println(s3.substring(a,b));
    }
}
