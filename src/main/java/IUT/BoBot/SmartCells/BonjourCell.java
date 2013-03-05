package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

public class BonjourCell implements SmartCell {
	
	public String ask(String question) {
		if(question.contains("Bonjour"))
		  return "Bonjour!";
		else
		  return null;
	}

}
