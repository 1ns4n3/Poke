package IUT.BoBot;

import IUT.BoBot.SmartCells.*;


public class Bot 
{
	/**
	 * List of smartCells the questions are asked to.
	 */
	final SmartCell[] smartCells = new SmartCell[] {
		new BonjourCell(),
		new BonjourWithNameCell(),
		new WhosAwesomeCell()
	};

	/**
	 * Ask something to BoBot, it will respond to you.
	 * 
	 * @param question The question you ask.
	 * @return An answer... or null if it doesn't get it.
	 */
	public String ask(String question) {
		for(SmartCell cell:smartCells) {
			String answer = cell.ask(question);
			if(answer != null)
			  return answer;
		}
		return null;
	}
	
}
