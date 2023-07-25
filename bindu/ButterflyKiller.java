class ButterflyKiller{
	
	public static void main (String[] values)
	{
		
		System.out.println("invocking main in ButterflyKiller");
		
	    Butterfly butterfly=new Butterfly(5.0d,true);
		Butterfly.printStatic();
		butterfly.printInstance();
		
		System.out.println("\n");
		
		Butterfly butterfly1=new Butterfly(3.0d,false);
		Butterfly.printStatic();
		butterfly.printInstance();
		System.out.println(butterfly1.bodyLength);
		System.out.println(butterfly1.canFly);
		
		
	}
}