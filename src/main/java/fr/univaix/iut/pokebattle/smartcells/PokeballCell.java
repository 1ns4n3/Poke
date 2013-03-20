package fr.univaix.iut.pokebattle.smartcells;

import twitter4j.Status;
import fr.univaix.iut.pokebattle.SmartCell;
import fr.univaix.iut.pokebattle.pokeStatus;

public class PokeballCell implements SmartCell {

	@Override
	public String ask(Status question) {
		if(question.getText().contains("PokeBall"))
		{
			String reponse = "@" + question.getUser().getScreenName() + " ";
			
			OwnerCell test = new OwnerCell();
			pokeStatus status = new pokeStatus();
			status.setText(question.getText() + " Owner?");
			String testOwner = test.ask(status);
			if (testOwner.contains("No owner")) 
				reponse += reponse + "is my owner";
			else
				reponse = testOwner;
			
			return reponse;
		}
		return null;
	}

}
