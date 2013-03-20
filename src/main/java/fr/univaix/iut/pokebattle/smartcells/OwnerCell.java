package fr.univaix.iut.pokebattle.smartcells;

import twitter4j.Status;
import fr.univaix.iut.pokebattle.*;

public class OwnerCell implements SmartCell {

	@Override
	public String ask(Status question) {
		if(question.getText().contains("Owner"))
		{	
			// ask contains pcreux: "pcreux: "@pikachuNyanNian Owner?"
			// answer should contains : "pikachuNyanNian: "@pcreux No owner"
			
			String ownerAsk = question.getUser().getScreenName();
			
			//check owner exist
			
			String response = "@" + ownerAsk + " @Albert" + " is my owner";
			
			return response;
		}
		return null;
	}

}
