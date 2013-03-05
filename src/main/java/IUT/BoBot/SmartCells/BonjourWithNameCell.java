package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

/**
 * Reply to "Je m'appelle ..."
 * 
 *
 */
public class BonjourWithNameCell implements SmartCell {

	public String ask(String question) {
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
