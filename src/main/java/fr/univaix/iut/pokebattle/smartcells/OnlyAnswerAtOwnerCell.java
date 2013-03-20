package fr.univaix.iut.pokebattle.smartcells;

import twitter4j.Status;
import fr.univaix.iut.pokebattle.SmartCell;

public class OnlyAnswerAtOwnerCell implements SmartCell {

	@Override
	public String ask(Status question) {

		//pcreux: "@pikachuNyanNian #attack #foudre @bulbizare1"
		//pikachuNyanNian: "@pcreux @nedseb is my owner"
		String reponse = "";
		if (/*Owner != Twitteur*/) {
			reponse +=  "@" + question.getUser().getScreenName()
					  + " " /* + Owner*/ + " is my owner";
		}
		else
			/* Le pokemon répond normalement */
		
		return reponse;
	}
}
