package fr.univaix.iut.pokebattle;

import twitter4j.Status;
<<<<<<< HEAD:PokeBotDemo/src/main/java/fr/univaix/iut/pokebattle/PokeBot.java
import fr.univaix.iut.pokebattle.smartcells.AttackCell;
=======
>>>>>>> ac42c2523dc0d6e42e45f87f14b9d349620c6f4b:src/main/java/fr/univaix/iut/pokebattle/PokeBot.java
import fr.univaix.iut.pokebattle.smartcells.PokemonCriesCell;


public class PokeBot implements Bot {
    /**
     * List of SmartCells the questions go through to
     * find an answer.
     */
    final SmartCell[] smartCells = new SmartCell[]{
    		new PokemonCriesCell(),
            new AttackCell(),
    };

    /**
     * Ask something to BoBot, it will respond to you.
     *
     * @param question The question you ask.
     * @return An answer... or null if it doesn't get it.
     */
    @Override
    public String ask(Status question) {
        for (SmartCell cell : smartCells) {
            String answer = cell.ask(question);
            if (answer != null)
                return answer;
        }
        return null;
    }
<<<<<<< HEAD:PokeBotDemo/src/main/java/fr/univaix/iut/pokebattle/PokeBot.java
=======



>>>>>>> ac42c2523dc0d6e42e45f87f14b9d349620c6f4b:src/main/java/fr/univaix/iut/pokebattle/PokeBot.java
}
