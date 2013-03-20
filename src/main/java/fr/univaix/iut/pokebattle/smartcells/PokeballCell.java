package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.*;

public class PokeballCell implements SmartCell {

	@Override
	public String ask(Tweet question) {
		if(question.getText().contains("PokeBall"))
		{
			String reponse = "@" + question.getScreenName() + " ";
			
			OwnerCell test = new OwnerCell();
			Tweet tweet = new Tweet(question.getText() + " Owner?");
			String testOwner = test.ask(tweet);
			if (testOwner.contains("No owner")) 
				reponse += reponse + "is my owner";
			else
				reponse = testOwner;
			
			return reponse;
		}
		return null;
	}

}
