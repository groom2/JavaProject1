package polymopism;

public class Fruit {
	String name;
	int price;
	int fresh;
	
	
	public Fruit(String name, int price, int fresh) {
		super();
		this.price = price;
		this.fresh = fresh;
		this.name = name;
	}
	
	void print() {
		System.out.println(name + ":" + price + ":" + fresh);
	}
	
}
