class Park{
	
	String name;
	int people;
	int trees;
	String location;
	int chairs;
	String games;
	int plants;
	int agePeoples;
	String wether;

	Park()
	{
		super();
		System.out.println("invoking main in no arguments in Park constructer");
	}
	Park(String name)
	{
		super();
		this.name=name;
		System.out.println("invoking main in String in Park constructer");
	}
	Park(String name,int people)
	{
		super();
		this.name=name;
		this.people=people;
		System.out.println("invoking main in String,int   in Park constructer");
	}
	Park(String name,int people,int trees)
	{
		
		this(name,people);
		this.trees=trees;
		System.out.println("invoking main in String,int,int   in Park constructer");
	}
	Park(String name,int people,int trees,String location)
	{
		
		this(name,people,trees);
		this.location=location;
		System.out.println("invoking main in  String,int,int,String in Park constructer");
	}
	Park(String name,int people,int trees,String location,int chairs)
	{
		
		this(name,people,trees,location);
		this.chairs=chairs;
		System.out.println("invoking main in String,int,int,String,int  in Park constructer");
	}
	Park(String name,int people,int trees,String location,int chairs,String games)
	{
		this(name,people,trees,location,chairs);
		this.games=games;
		System.out.println("invoking main in  String,int,int,String,int,String  in Park constructer");
	}
	Park(String name,int people,int trees,String location,int chairs,String games,int plants)
	{
		
		this(name,people,trees,location,chairs,games);
		this.plants=plants;
		System.out.println("invoking main in String,int,int,String,int,String,int  in Park constructer");
	}
	Park(String name,int people,int trees,String location,int chairs,String games,int plants,
	int agePeoples)
	{
		
		this(name,people,trees,location,chairs,games,plants);
		this.agePeoples=agePeoples;
		System.out.println("invoking main in String,int,int,String,int,String,int,int  in Park constructer");
	}
	Park(String name,int people,int trees,String location,int chairs,String games,int plants,
	int agePeoples,String wether)
	{
		
		this(name,people,trees,location,chairs,games,plants,agePeoples);
		this.wether=wether;
		System.out.println("invoking main in String,int,int,String,int,String,int,int ,String  in Park constructer");
	}
	
}