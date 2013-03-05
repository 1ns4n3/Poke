package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

public class BonjourWithNameCellTest {

	@Test
	public void testBonjourWithNameSeb() {
		BonjourWithNameCell cell = new BonjourWithNameCell("Je m'appelle Seb");
		assertEquals("Bonjour Seb!", cell.answer());
	}
	
	@Test
	public void testBonjourWithNameBob() {
		BonjourWithNameCell cell = new BonjourWithNameCell("Je m'appelle Bob");
		assertEquals("Bonjour Bob!", cell.answer());
	}

	@Test
	public void testBonjourWithoutName() {
		BonjourWithNameCell cell = new BonjourWithNameCell("Yo!");
		assertEquals(null, cell.answer());
	}
}
