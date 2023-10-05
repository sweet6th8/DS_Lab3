package lab3_algorithms;

public class OrderItem implements Comparable<OrderItem> {
	private Product p;
	private int quatity;

	public OrderItem(Product p, int quatity) {
		super();
		this.p = p;
		this.quatity = quatity;
	}

	@Override
	public String toString() {
		return "OrderItem [p=" + p + ", quatity=" + quatity + "]";
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quality) {
		this.quatity = quality;
	}

	@Override
	public int compareTo(OrderItem o) {

		return p.compareTo(o.getP());
	}

	

}
