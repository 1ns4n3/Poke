package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

public class TodayCellTest {
	
	Calendar mockCalendar = Calendar.getInstance();
	TodayCell cell = new TodayCell(mockCalendar);
	
	@Before
	public void setUp() {
		mockCalendar.set(2013, 2, 8);
	}
	
	@Test
	public void testToday() {
		assertEquals("Vendredi", cell.ask("Quel jour est-il?"));
	}
	
	@Test
	public void testNotToday() {
		assertEquals(null, cell.ask("Quel ours jette-il?"));
	}

}
