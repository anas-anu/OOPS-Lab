public class cpu
{
    double price;
    static class processor
    {
        int cores;
        String manufacturer;
        processor(int c,String m)
        {
            cores=c;
            manufacturer=m;
        }
        void display()
        {
            System.out.println("Processor Informations\nNumber of Cores:-\n"+cores+"\nManufacturer:-\n"+manufacturer);
        }
    }
    static class ram
    {
        int memmory;
        String manufacturer;
        ram(int mem,String manu)
        {
            memmory=mem;
            manufacturer=manu;
        }
        void display()
        {
            System.out.println("RAM Informations\nMemmory Size:-\n"+memmory+"\nManufacturer:-\n"+manufacturer);
        }
    }
    public static void main(String args[])
    {
        cpu c=new cpu();
        cpu.ram ra=new cpu.ram(16000,"Crucial");
        ra.display();
        cpu.processor pro=new cpu.processor(8,"intel");
        pro.display();
    }
}