package polymopism;

public class Over {
	
	void print(int a) {
		System.out.println("숫자입니다.");
	}
	void print(int a, int b) {
		System.out.println("숫자 두개입니다.");
	}
	void print(String a) {
		System.out.println("문자입니다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Over m = new Over();
		
		m.print(1);
		m.print(1, 2);
		m.print("1");
		
	}
}
