import java.io.*;
import java.util.*;
class MyOne
{
public static void main(String args[])
{
Scanner u=new Scanner(System.in);
int l,h,i,rem,sum,num;
System.out.println("ENTER LOWER NUMBER:");
l=u.nextInt();
System.out.println("ENTER HIGHER NUMBER:");
h=u.nextInt();
System.out.println("ARMSTRONG NUMBERS:");
for(i=l;i<=h;i++){
num=i;
sum=0;
while(num!=0){
rem=num%10;
sum=sum+(rem*rem*rem);
num=num/10;
}
if(sum==i)
System.out.println(i);
}
}
}