package IUT.BoBot;

import IUT.BoBot.SmartCells.*;


public class Bot 
{
	final SmartCell[] smartCells = new SmartCell[] {
		new BonjourCell(),
		new BonjourWithNameCell(),
		new WhosAwesomeCell()
	};

	
	public String ask(String question) {
		for(SmartCell cell:smartCells) {
			String answer = cell.ask(question);
			if(answer != null)
			  return answer;
		}
		return null;
	}
	
}
