package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

public class WhosAwesomeCell implements SmartCell {
	
	String question;

	public WhosAwesomeCell(String p_question) {
		question = p_question;
	}

	public String answer() {
		if(question == "Who's awesome?")
		  return "You're awesome!";
		else
		  return null;
	}

}
