package classtest;

public class Node1 {

	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Node1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Node1 center(Node1 n) {
		return new Node1((this.x + n.x)/2 , (this.y + n.y)/2);
	}
	
}
