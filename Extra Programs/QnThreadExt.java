import java.util.Scanner;

 class PrimeNumbers extends Thread {
 int count;
 int primeCount = 0;
    PrimeNumbers(int count){
    this.count=count;
    }
 public void run() {
            for(int i=1;primeCount<count;i++){
            boolean isPrime=true;
                if(i==1)
                {
                i++;
                }
            for (int j=2;j<i;j++){
                if(i%j==0){
                isPrime = false;
                break;
                }
            }
            if (isPrime){
                System.out.println("Prime Number : "+i);
                primeCount++;
             }
         }
 }
}


class MultiTable5 extends Thread {
 int count;
 MultiTable5(int count){
 this.count=count;
 }
 public void run() 
{
 for (int i=0;i<=count;i++){
 System.out.println("5 x "+i+" = "+(5*i));
 }
 }
}


public class QnThreadExt {
        public static void main(String[] args)
        {
        Scanner scanner = new Scanner(System.in);
        int primeCount,multipleCount;
        System.out.println("Enter number of Prime Numbers to be listed : ");
        primeCount = scanner.nextInt();
        System.out.println("Enter number of Multiples of 5 to be listed : ");
        multipleCount = scanner.nextInt();
        PrimeNumbers thread1 = new PrimeNumbers(primeCount);
        thread1.start();
        MultiTable5 thread2 = new MultiTable5(multipleCount);
        thread2.start();
        }
}