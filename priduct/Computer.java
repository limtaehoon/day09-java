package inheritanse;

public class Computer extends Product {
	public Computer(int price) {
		super(price, price);
	
	}
	public String toString() {
		return "Computer";
}
}