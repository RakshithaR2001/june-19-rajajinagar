class Butterfly{
	
	static String color;
	static boolean isAdult;
	double bodyLength;
	boolean canFly;
	

    Butterfly(double bodyLength,boolean canFly)   
	{
		this.bodyLength=bodyLength;
		this.canFly=canFly;
		System.out.println("invocking double, boolean in Butterfly");
		System.out.println("\n");
	}	
	
	static { 
        color="Red";
		isAdult=true;
		System.out.println("invocking static block in Butterfly");
		System.out.println("\n");
	}
	
	static void printStatic()            
	{
        System.out.println("Running printStatic block in Butterfly");
		System.out.println(color);
		System.out.println(isAdult);
		System.out.println("\n");
	}
	
	void printInstance()                   
	{
		System.out.println("Running printInstance block in Butterfly");
		System.out.println(this.bodyLength);
		System.out.println(this.canFly);
		
	}
}