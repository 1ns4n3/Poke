package fr.univaix.iut.pokebattle;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Integration tests checking the PokeBot
 * behavior. We just test some cases to make sure that the
 * PokeBot is using SmartCells properly.
 */
public class PokeBotTest {
    PokeBot pokeBot = new PokeBot();

    @Test
    public void testSalut() {
    	pokeStatus status = new pokeStatus();
    	status.setText("Salut");
    	assertEquals("@PaulMista Pika pika", pokeBot.ask(status));
    }
}
