package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhosAwesomeCellTest {
	
	WhosAwesomeCell cell = new WhosAwesomeCell();

	@Test
	public void testAwesome() {
		assertEquals("You're awesome!", cell.answer("Who's awesome?"));
	}
	
	@Test
	public void testNotAwesome() {
		assertEquals(null, cell.answer("Hey!"));
	}

}
