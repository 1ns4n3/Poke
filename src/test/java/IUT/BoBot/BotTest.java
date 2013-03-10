package IUT.BoBot;

import static org.junit.Assert.*;

import fr.univaix.iut.pokebattle.Bot;
import org.junit.Test;

/**
 * Integration tests checking the Bot
 * behavior. We just test some cases to make sure that the
 * Bot is using SmartCells properly.
 */
public class BotTest {
    Bot bot = new Bot();

    @Test
    public void testBonjour() {
        assertEquals("Bonjour!", bot.ask("Bonjour"));
    }

    @Test
    public void testJeMAppelle() {
        assertEquals("Bonjour Seb!", bot.ask("Je m'appelle Seb"));
    }

    @Test
    public void testNull() {
        assertEquals(null, bot.ask("This is not a question."));
    }
}
