package fr.univaix.iut.pokebattle.smartcells;

import java.util.Calendar;

import fr.univaix.iut.pokebattle.SmartCell;

/**
 * Reply to "Quel jour est-il?"
 */
public class TodayCell implements SmartCell {

    Calendar calendar;

    /**
     * Initialize the cell with the date of today.
     */
    public TodayCell() {
        this.calendar = Calendar.getInstance();
    }

    /**
     * Initialize the cell with the date passed in.
     */
    public TodayCell(Calendar calendar) {
        this.calendar = calendar;
    }

    public String ask(String question) {
        if (!question.contains("Quel jour"))
            return null;

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        return weekDays[dayOfWeek - 1];
    }

    private String[] weekDays = new String[]{
            "Dimanche", "Lundi", "Mardi", "Mercredi",
            "Jeudi", "Vendredi", "Samedi"
    };


}
