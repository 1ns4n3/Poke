package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

public class BonjourCellTest {
	
	BonjourCell cell = new BonjourCell();

	@Test
	public void testBonjour() {
		assertEquals("Bonjour!", cell.answer("Bonjour"));
	}
	
	@Test
	public void testNotBonjour() {
		assertEquals(null, cell.answer("au revoir"));
	}

}
