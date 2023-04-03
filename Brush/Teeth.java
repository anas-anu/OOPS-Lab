import java.util.Scanner;
import java.util.Timer;   
import java.util.TimerTask;


class Teeth
{
	static void urgent()
	{
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() 
		{
			int i=30;
            public void run() 
            {
            	System.out.println("Secounds Left "+i--);
                if (i< 0)
                {
                	timer.cancel();
                	System.out.println("Finished Now Wash Your Teeth");
                }
            }
        }, 0, 1000);
    }
	static void normal()
	{
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() 
		{
			int i=35;
            public void run() 
            {
            	System.out.println("Secounds Left "+i--);
                if (i< 0)
                {
                	timer.cancel();
                	System.out.println("Finished Now Wash Your Teeth");
                }
            }
        }, 0, 1000);
	}
	static void free()
	{
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() 
		{
			int i=40;
            public void run() 
            {
            	System.out.println("Secounds Left "+i--);
                if (i< 0)
                {
                	timer.cancel();
                	System.out.println("Finished Now Wash Your Teeth");
                }
            }
        }, 0, 1000);
	}
	public static void main(String args[])
	{
		int op;
		do
		{
			System.out.println("1.Urgent\n2.Normal\n3.Free\n4.Exit\nChoose Your Current Situation:\n");
			Scanner sc=new Scanner(System.in);
			op=sc.nextInt();
			switch(op)
			{
				case 1:
					urgent();
					break;
				case 2:
					normal();
					break;
				case 3:
					free();
					break;
				case 4:
					return;
				default:
					System.out.println("Please Choose a Correct Option");
			}
		}
		while(op!=4);
	}
	
}