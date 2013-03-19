package fr.univaix.iut.pokebattle.smartcells;

import twitter4j.Status;
import fr.univaix.iut.pokebattle.*;

public class AttackCell implements SmartCell {

	@Override
	public String ask(Status question) {
		if(question.getText().contains("#attack"))
		{	
			String alias = question.getText();
			String[] alias2 = alias.split(" ");
			String pokemonAttacked = alias2[3];
			String attackName = alias2[2];
			String dresseur = question.getUser().getScreenName();
			String response = pokemonAttacked + " #attack " + attackName + "! /cc @" + dresseur;
			return response;
		}
		return null;
	}

}
