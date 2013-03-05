package IUT.BoBot.SmartCells;

import IUT.BoBot.SmartCell;

public class WhosAwesomeCell implements SmartCell {

	public String ask(String question) {
		if(question == "Who's awesome?")
		  return "You're awesome!";
		else
		  return null;
	}

}
