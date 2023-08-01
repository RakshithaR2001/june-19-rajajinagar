package com.xworkz.rakshitha.app;

public class Sport {
	
	public String name;
	public Player[] players;
	
	
	public Sport(String name,Player[] players)
	{
		this.name = name;
		this.players = players;
	}
	
	public void printInfo()
	{
		System.out.println("name: "+ this.name);
		
		for(int index=0;index<this.players.length;index++)
		{
			Player ref = players[index];
			ref.printInfo();
			
		}
	}
 
}
