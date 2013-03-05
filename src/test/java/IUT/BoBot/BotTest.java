package IUT.BoBot;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * Integration tests ensuring that the Bot
 * uses some of the SmartCells.
 *
 */
public class BotTest 
{
	Bot bot = new Bot();
	
    @Test
    public void testBonjour()
    {
        assertEquals("Bonjour!", bot.ask("Bonjour"));
    }
    
    @Test
    public void testJeMAppelle()
    {
        assertEquals("Bonjour Seb!", bot.ask("Je m'appelle Seb"));
    }
    
    @Test
    public void testNull()
    {
        assertEquals(null, bot.ask("This is not a question."));
    }
}
