package by.module5.task12;

/*  @author Yury Zmushko
 * 	Task 2.
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из
 * нескольких товаров.
 * 
 */

public class Task12 {
	
	public static void main(String[] args) {
		Payment payment = new Payment(0);
		
		payment.addGood("ice cream", 1.34);
		payment.addGood("milk", 1.69);
		payment.addGood("", -2.34);
		
		System.out.println(payment);
	}	
}


