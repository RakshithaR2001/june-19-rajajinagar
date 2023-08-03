package com.google.cast.util;

import com.google.cast.app.app1.app2.CaramelChocolate;
import com.google.cast.app.app1.app2.Chocolate;
import com.google.cast.app.app1.app2.DarkChocolate;

public class ChocolateUtil extends Chocolate {
	
	public void run(Chocolate chocolate)
	{

		Chocolate chocolate2 = new Chocolate();
		chocolate2.taste();
		
		if (chocolate  instanceof  CaramelChocolate)
		{
			Chocolate dark = new DarkChocolate();
			dark.taste();

			DarkChocolate dark2 = (DarkChocolate) dark;
			dark2.getCost();
		}
                                                
		
		if (chocolate instanceof CaramelChocolate) 
		{
			CaramelChocolate caramel = new CaramelChocolate();
			caramel.taste();

			CaramelChocolate caramel2 = (CaramelChocolate) caramel;
			caramel2.getNoOfPieces();
		}

		
	}

}
