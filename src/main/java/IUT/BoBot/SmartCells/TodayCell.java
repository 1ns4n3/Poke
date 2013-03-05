package IUT.BoBot.SmartCells;

import java.util.Calendar;

import IUT.BoBot.SmartCell;

public class TodayCell implements SmartCell {
	
	Calendar calendar;

	TodayCell() {
		this.calendar = Calendar.getInstance();
	}
	
	TodayCell(Calendar calendar) {
		this.calendar = calendar;
	}
	
	public String ask(String question) {
		if(!question.contains("Quel jour"))
			return null;
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		return weekDays[dayOfWeek - 1];
	}
	
	private String[] weekDays = new String[] { 
			"Dimanche", "Lundi", "Mardi", "Mercredi",
			"Jeudi", "Vendredi", "Samedi" 
			};



}
