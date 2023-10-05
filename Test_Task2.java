package lab3_algorithms;

import java.util.Arrays;

import javax.print.attribute.standard.MediaSize.Other;

public class Test_Task2 {
public static void main(String[] args) {
	Product p1 = new Product("1", "Pepsi", 5, "Nho");
	Product p2= new Product("2", "Pepsi", 10, "Lon");
	Product p3 = new Product("3", "Coca", 5, "Nho");
	Product p4 = new Product("4", "7up", 1, "Nho");
	OrderItem o1 = new OrderItem(p1, 2);
	OrderItem o2 = new OrderItem(p2, 4);
	OrderItem o3 = new OrderItem(p3, 6);
	OrderItem o4 = new OrderItem(p4, 8);
	Order order1 = new Order(new OrderItem[] {o1,o2});
	Order order2 = new Order(new OrderItem[] {o1,o2,o3,o4});
	System.out.println(order1.cost());
	System.out.println(order1.contains(p4));
	System.out.println(order1.contains(p3));
	System.out.println(order1.contains(p2));
	System.out.println(order1.contains(p1));
	
	System.out.println(Arrays.toString(order2.filter("Nho")));

}
}
