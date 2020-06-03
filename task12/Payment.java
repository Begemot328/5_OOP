package by.module5.task12;

import java.util.ArrayList;

public class Payment {
	
	public ArrayList<Good> list;
	int id; 
	
	public Payment(int id) {
		this.id = id;
		list = new ArrayList<Good>();
	}

	public class Good {
		public final String EMPTY_NAME = "GOOD";
		private double price;
		private String name;
		
		public Good(String name, double price) {
			this.name = name;
			if(name.isEmpty()) {
				this.name = EMPTY_NAME;
			}
			this.price = price;
			if (price < 0) {
				this.price = - price;
			}
		}

		@Override
		public String toString() {
			return "Good [price=" + price + ", name=" + name + "]";
		}

		public double getPrice() {
			return price;
		}

		public String getName() {
			return name;
		}
	}
	
	public void addGood(String name, double price) {
		list.add(new Good(name, price));
	}
	
	public double getSum() {
		double result = 0;
		
		for (Good good: list) {
			result += good.getPrice();
		}
		
		return result;
	}

	@Override
	public String toString() {
		String result = new String();
		result = "Payment id=" + id;
		for (Good good: list) {
			result += "\n" + good;
		}
		result += "\nTOTAL: " + getSum();
		return result;
	}
}
