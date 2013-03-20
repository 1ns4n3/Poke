package fr.univaix.iut.pokebattle.SmartCells;

import fr.univaix.iut.pokebattle.*;
import fr.univaix.iut.pokebattle.smartcells.PokemonCriesCell;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class PokemonCriesCellTest {


    PokemonCriesCell cell = new PokemonCriesCell();

    @Test
    public void testSalut() {
    	Tweet tweet = new Tweet("Salut");
        assertEquals("@PaulMista Pika pika", cell.ask(tweet));
    }

}
