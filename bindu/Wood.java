class Wood
{
	String name;
	String shape;
	double price;
	int density;
	int weight;
	
	Wood()
	{
		super();
		System.out.println("invoking main in no argument constructor");
		
	}
	
	Wood(String name)
	{
	    super();
		this.name = name;
		System.out.println("invoking main String constructor");
		
	}
	Wood(String name,String shape)
	{
		
		this(name);
		this.shape = shape;
		System.out.println("invoking main String,String in constructor");
	}
	Wood (String name,String shape,double price)
	{
	   
		this(name,shape);
		this.price = price;
		System.out.println("invoking main String,String,double in constructor");
		
	}
	Wood(String name,String shape,double price,int density)
	{
		
		this(name,shape,price);
		this.density  = density;
		System.out.println("invoking main String,String,double,int in constructor");
	}
	Wood(String name,String shape,double price,int density,int weight)
	{
		
		this(name,shape,price,density);
		this.weight = weight;
		System.out.println("invoking main String,String,double,int,int in constructor");

	}
}