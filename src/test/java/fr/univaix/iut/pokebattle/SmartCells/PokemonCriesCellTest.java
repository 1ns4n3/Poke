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
    	status.setText("Salut");
        assertEquals("@PaulMista Pika pika", cell.ask(status));
    }
    /*
    @Test
    public void testNotSalut() {
        assertEquals("Pika pika", cell.ask("au revoir"));
    }
    */





}
