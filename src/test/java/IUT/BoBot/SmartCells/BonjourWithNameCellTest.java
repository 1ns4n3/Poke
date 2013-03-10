package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import fr.univaix.iut.pokebattle.smartcells.BonjourWithNameCell;
import org.junit.Test;

public class BonjourWithNameCellTest {

    BonjourWithNameCell cell = new BonjourWithNameCell();

    @Test
    public void testBonjourWithNameSeb() {
        assertEquals("Bonjour Seb!", cell.ask("Je m'appelle Seb"));
    }

    @Test
    public void testBonjourWithNameBob() {
        assertEquals("Bonjour Bob!", cell.ask("Je m'appelle Bob"));
    }

    @Test
    public void testBonjourWithoutName() {
        assertEquals(null, cell.ask("Yo!"));
    }
}
