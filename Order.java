package lab3_algorithms;

import java.util.Arrays;

public class Order {
	private OrderItem[] items;

	public Order(OrderItem[] items) {
		super();
		this.items = items;
	}

	public double cost() {
		int total = 0;
		for (OrderItem orderItem : items) {
			total += orderItem.getQuatity() * orderItem.getP().getPrice();
		}
		return total;
	}

	// using binary search approach
	public boolean contains(Product p) {
		int n = items.length;
		int start = 0;
		int end = n - 1;
		for (int i = 0; i < items.length; i++) {
			int mid = start + (end - start) / 2;

			if (items[i].getP().compareTo(p) == 0) {
				return true;
			} else if (items[i].getP().compareTo(p) > 0) {
				end = mid + 1;
			} else {
				start = mid - 1;
			}
		}
		return false;
	}

	// get all products based on the given type using
	// linear search

	public Product[] filter(String type) {
		int count = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i].getP().getType().equals(type)) {
				count++;
			}
		}
		Product[] p = new Product[count];
		int index = 0;
		for (int i = 0; i < items.length; i++) {
			if (items[i].getP().getType().equals(type)) {
				p[index++] = items[i].getP();
			}
		}
		return p;
	}
}
