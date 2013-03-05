package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhosAwesomeCellTest {
	
	WhosAwesomeCell cell = new WhosAwesomeCell();

	@Test
	public void testAwesome() {
		assertEquals("You're awesome!", cell.ask("Who's awesome?"));
	}
	
	@Test
	public void testNotAwesome() {
		assertEquals(null, cell.ask("Hey!"));
	}

}
