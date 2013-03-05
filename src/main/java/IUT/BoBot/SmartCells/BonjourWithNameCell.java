package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

public class BonjourWithNameCell implements SmartCell {
	
	String question;

	public BonjourWithNameCell(String p_question) {
		question = p_question;
	}

	public String answer() {
		return "Bonjour Seb!";
	}

}
