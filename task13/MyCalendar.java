package by.module5.task13;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

import by.module5.task12.Payment.Good;

public class MyCalendar {
	private Calendar calendar;
	private ArrayList<Holiday> list;
	private Locale locale;
	
	public MyCalendar(Locale locale) {
		calendar = Calendar.getInstance();
		list = new ArrayList<Holiday>();
		this.locale = locale;
	}
	
	public void addHoliday(String name, Calendar calendar) {
		list.add(new Holiday(name, calendar));
	}
	
	public class Holiday {
		private String name;
		private int month;
		private int day;
		
		private Holiday(String name, int month, int day) {
			this.name = name;
			this.day = day;
			this.month = month;
		}
		
		@Override
		public String toString() {
			Calendar calendar = Calendar.getInstance(MyCalendar.this.locale);
			calendar.set(Calendar.DAY_OF_MONTH, day);
			calendar.set(Calendar.MONTH, month);
			return "Holiday [name=" + name + ", on "  
			+ new SimpleDateFormat("d MMMMMMMMMM", MyCalendar.this.locale).format(calendar.getTime()) + "]";
			
		}

		private Holiday(String name, Calendar calendar) {
			this.name = name;
			this.day = calendar.get(Calendar.DAY_OF_MONTH);
			this.month = calendar.get(Calendar.MONTH);
		}
	}

	@Override
	public String toString() {
		String result = new String();
		result += "MyCalendar";
		for (Holiday  holiday: list) {
			result += "\n" + holiday;
		}
		return result;
	}
	
	
}
