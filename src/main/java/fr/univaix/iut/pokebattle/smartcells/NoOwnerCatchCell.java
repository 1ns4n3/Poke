package fr.univaix.iut.pokebattle.smartcells;

import twitter4j.Status;
import fr.univaix.iut.pokebattle.*;

public class NoOwnerCatchCell implements SmartCell {

	@Override
	public String ask(Status question) {
		if(question.getText().contains("Pokeball"))
		{	
			// ask contains pcreux: "pcreux: "@pikachuNyanNyan Pokeball!"
			// answer should contains : pikachuNyanNian: "@pcreux @pcreux is my owner"
			
			String ownerAsk = question.getUser().getScreenName();
			
			//check owner exist
			
			String response = "@" + ownerAsk + " @" +ownerAsk+ " is my owner";
			
			return response;
		}
		return null;
	}

}
