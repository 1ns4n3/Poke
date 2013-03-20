package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.*;

/**
 * Reply to all.
 */
public class PokemonCriesCell implements SmartCell {

    public String ask(Tweet question) {
    	if(question.getText().contains("Salut")){
	    	String reponse = ("@" + question.getScreenName() + " Pika pika");
	        return reponse;	
    	}
    	return null;
    }

}
