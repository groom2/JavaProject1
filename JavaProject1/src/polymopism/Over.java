package polymopism;

public class Over {
	
	void print(int a) {
		System.out.println("�����Դϴ�.");
	}
	void print(int a, int b) {
		System.out.println("���� �ΰ��Դϴ�.");
	}
	void print(String a) {
		System.out.println("�����Դϴ�.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Over m = new Over();
		
		m.print(1);
		m.print(1, 2);
		m.print("1");
		
	}
}
