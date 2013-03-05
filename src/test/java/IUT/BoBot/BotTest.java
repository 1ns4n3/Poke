package IUT.BoBot;

import static org.junit.Assert.*;

import org.junit.Test;

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
    public void testWhosAwesome()
    {
        assertEquals("You're awesome!", bot.ask("Who's awesome?"));
    }
}
