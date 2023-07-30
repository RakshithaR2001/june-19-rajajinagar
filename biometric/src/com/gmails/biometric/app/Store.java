package com.gmails.biometric.app;

public class Store {
	
	
	public void email(String[] mails)
	{
		for(int i = 0;i<= mails.length-1;i++)
		{
			System.out.println(mails[i]);
		}
		
	}
	public void groceryItems(String[] items)
	{
		for(int i = 0; i<= items.length-1;i++ )
		{
			System.out.println(items[i]);
		}
	}
	
	public void iplTeams(String[] teams)
	{
		for(int i = 0; i<= teams.length-1;i++)
		{
			System.out.println(teams[i]);
		}
	}

	

}
