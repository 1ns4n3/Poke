package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

public class BonjourWithNameCellTest {
	
	BonjourWithNameCell cell = new BonjourWithNameCell();

	@Test
	public void testBonjourWithNameSeb() {
		assertEquals("Bonjour Seb!", cell.answer("Je m'appelle Seb"));
	}
	
	@Test
	public void testBonjourWithNameBob() {
		assertEquals("Bonjour Bob!", cell.answer("Je m'appelle Bob"));
	}

	@Test
	public void testBonjourWithoutName() {
		assertEquals(null, cell.answer("Yo!"));
	}
}
