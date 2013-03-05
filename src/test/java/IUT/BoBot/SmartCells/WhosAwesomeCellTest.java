package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

public class WhosAwesomeCellTest {

	@Test
	public void testAwesome() {
		WhosAwesomeCell cell = new WhosAwesomeCell("Who's awesome?");
		assertEquals("You're awesome!", cell.answer());
	}
	
	@Test
	public void testNotAwesome() {
		WhosAwesomeCell cell = new WhosAwesomeCell("Hey!");
		assertEquals(null, cell.answer());
	}

}
