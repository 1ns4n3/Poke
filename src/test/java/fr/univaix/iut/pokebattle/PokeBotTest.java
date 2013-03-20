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
    	Tweet tweet = new Tweet("Salut");
    	assertEquals("@PaulMista Pika pika", pokeBot.ask(tweet));
    }
}
