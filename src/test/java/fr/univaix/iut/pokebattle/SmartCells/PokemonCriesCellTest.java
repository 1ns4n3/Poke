package fr.univaix.iut.pokebattle.SmartCells;

import fr.univaix.iut.pokebattle.pokeStatus;
import fr.univaix.iut.pokebattle.smartcells.PokemonCriesCell;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class PokemonCriesCellTest {

    PokemonCriesCell cell = new PokemonCriesCell();

    @Test
    public void testSalut() {
    	pokeStatus status = new pokeStatus();
<<<<<<< HEAD:PokeBotDemo/src/test/java/fr/univaix/iut/pokebattle/SmartCells/PokemonCriesCellTest.java
    	status.setText("Salut");
=======
>>>>>>> ac42c2523dc0d6e42e45f87f14b9d349620c6f4b:src/test/java/fr/univaix/iut/pokebattle/SmartCells/PokemonCriesCellTest.java
        assertEquals("@PaulMista Pika pika", cell.ask(status));
    }
    /*
    @Test
    public void testNotSalut() {
        assertEquals("Pika pika", cell.ask("au revoir"));
    }
    */



}
