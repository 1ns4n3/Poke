package IUT.BoBot;

import fr.univaix.iut.pokebattle.PokeBot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Integration tests checking the PokeBot
 * behavior. We just test some cases to make sure that the
 * PokeBot is using SmartCells properly.
 */
public class BotTest {
    PokeBot pokeBot = new PokeBot();

    @Test
    public void testBonjour() {
        assertEquals("Bonjour!", pokeBot.ask("Bonjour"));
    }

    @Test
    public void testNull() {
        assertEquals(null, pokeBot.ask("This is not a question."));
    }
}
