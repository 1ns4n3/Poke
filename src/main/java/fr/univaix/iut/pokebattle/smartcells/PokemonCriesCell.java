package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.*;
import twitter4j.*;

/**
 * Reply to all.
 */
public class PokemonCriesCell implements SmartCell {

    public String ask(Status question) {
    	System.out.println(question.getUser());
    	String reponse = ("@" + question.getUser().getScreenName() + " Pika pika");
        return reponse;
    }




}
