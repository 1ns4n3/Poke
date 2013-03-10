package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.SmartCell;

/**
 * Reply to Bonjour.
 */
public class PokemonCriesCell implements SmartCell {

    public String ask(String question) {
        if (question.contains("Salut"))
            return "Pika pika";
        else
            return null;
    }

}
