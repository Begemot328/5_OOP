package by.module5.task13;

import java.util.Calendar;
import java.util.Locale;

/*  @author Yury Zmushko
 * 	Task 2.
 * Задача 3.
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
 * выходных и праздничных днях.
 */

public class Task13 {
	
	public static void main(String[] args) {
		MyCalendar myCalendar;
		Calendar calendar;
		
		myCalendar = new MyCalendar(Locale.US);
		calendar = Calendar.getInstance(Locale.US);
		calendar.set(Calendar.MONTH, Calendar.APRIL);
		calendar.set(Calendar.DAY_OF_MONTH, 19);
		myCalendar.addHoliday("Easter", calendar);
		
		calendar.set(Calendar.MONTH, Calendar.MAY);
		calendar.set(Calendar.DATE, 1);
		myCalendar.addHoliday("Laborers' day", calendar);
		
		calendar.set(Calendar.MONTH, Calendar.MAY);
		calendar.set(Calendar.DATE, 9);
		myCalendar.addHoliday("Victory day", calendar);
		
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.DATE, 7);
		myCalendar.addHoliday("Christmas day", calendar);
		
		System.out.println(myCalendar);
	}	
}


