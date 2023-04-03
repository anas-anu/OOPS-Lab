class shop
{
	public static void main(String args[])
	{
		int nRose,nOrchid,nLily,nLotus,rose,orchid,lily,lotus,r,o,l,lo;
		nRose=20;
		nOrchid=15;
		nLily=9;
		nLotus=14;
		rose=30;
		orchid=30;
		lily=20;
		lotus=20;
		r=nRose*rose;
		o=nOrchid*orchid;
		l=nLily*lily;
		lo=nLotus*lotus;
		System.out.println("Total Sales:");
		System.out.println("Total Number of Rose Saled:"+nRose);
		System.out.println("Total Number of Orchid Saled:"+nOrchid);
		System.out.println("Total Number of Lily Saled:"+nLily);
		System.out.println("Total Number of Lotus Saled:"+nLotus+"\n");
		System.out.print("Total Collection:\n");
		System.out.println("Collection of Rose:"+r);
		System.out.println("Collection of Orchid:"+o);
		System.out.println("Collection of Lily:"+l);
		System.out.println("Collection of Lotus:"+lo);
	}
}