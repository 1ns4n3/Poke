package fr.univaix.iut.pokebattle.smartcells;

import fr.univaix.iut.pokebattle.SmartCell;

/**
 * Reply to Bonjour.
 */
public class BonjourCell implements SmartCell {

    public String ask(String question) {
        if (question.contains("Bonjour"))
            return "Bonjour!";
        else
            return null;
    }

}
