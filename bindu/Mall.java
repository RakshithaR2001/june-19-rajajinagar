class Mall{
	String name;
	int price;
	String items;
	String foodname;
	int quality;
	String location;
	String game;
	
	Mall()
	{
		super();
		System.out.println("invoking main in no arguments in mall constructer");
	}
	Mall(String name)
	{
		super();
		this.name=name;
		System.out.println("invoking main in string in mall constructer");
	}
	Mall(String name, int price)
	{
		this.name=name;
		this.price=price;
	System.out.println("invoking main in string,int  in mall constructer");

	}
	Mall(String name, int price,String items)
	{
		
		this(name,price);
		this.items=items;
	System.out.println("invoking main in string,int ,String in mall constructer");

	}
	Mall(String name, int price,String items,String foodname)
	{
		this(name,price,items);
		this.foodname=foodname;
		System.out.println("invoking main in string,int,String,String in mall constructer");

	}
	Mall(String name, int price,String items,String foodname,int quality)
	{
		this(name,price,items,foodname);
		this.quality=quality;
	System.out.println("invoking main in string,int,String,String,int in mall constructer");

	}	
	Mall(String name, int price,String items,String foodname,int quality,String location)
	{
		this(name,price,items,foodname,quality);
        this.location=location;
		System.out.println("invoking main in string ,int,String,String,int,String in mall constructer");

	}
	Mall(String name, int price,String items,String foodname,int quality,String location,String game)
	{
		this(name,price,items,foodname,quality,location);
        this.game=game;
		System.out.println("invoking main in string,int,String,String,int,String,String in mall constructer");
	}	
}