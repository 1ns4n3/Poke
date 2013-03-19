package fr.univaix.iut.pokebattle.SmartCells;

import org.junit.Test;

import fr.univaix.iut.pokebattle.pokeStatus;
import fr.univaix.iut.pokebattle.smartcells.AttackCell;

import static org.junit.Assert.assertEquals;
public class AttackCellTest {

	AttackCell cell = new AttackCell();
	
	@Test
	public void testAttack() {
		pokeStatus status = new pokeStatus();
		status.setText("@1ns4n3_ #attack #bouze @PokeWill1");
		assertEquals("@PokeWill1 #attack #bouze! /cc @PaulMista", cell.ask(status));
	}
}
