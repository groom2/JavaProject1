package interfaceclass;

public class Main implements Cat, Dog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.crying();
		m.print();
		m.print2();
	}

	@Override
	public void crying() {
		// TODO Auto-generated method stub
		System.out.println("�߿�");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}

	@Override
	public void print2() {
		// TODO Auto-generated method stub
		System.out.println("��");
	}

}
