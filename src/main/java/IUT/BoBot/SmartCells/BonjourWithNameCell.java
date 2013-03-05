package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

public class BonjourWithNameCell implements SmartCell {
	
	String question;

	public BonjourWithNameCell(String p_question) {
		question = p_question;
	}

	public String answer() {
		if (question.contains("m'appelle"))
			return "Bonjour " + extractName(question) + "!";
		else
			return null;
	}
	
	private String extractName(String question) {
		String bits[] = question.split("appelle ");
		String name = bits[bits.length - 1];
		
		return name;
	}

}
