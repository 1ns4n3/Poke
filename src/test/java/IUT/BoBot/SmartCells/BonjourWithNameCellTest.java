package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

public class BonjourWithNameCellTest {

	@Test
	public void testBonjourWithName() {
		BonjourWithNameCell cell = new BonjourWithNameCell("Je m'appelle Seb");
		assertEquals("Bonjour Seb!", cell.answer());
	}

}
