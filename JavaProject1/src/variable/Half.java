package variable;

public class Half {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 2.7;
		double num2 = 3.4;
		
		int half1;
		
		if ((num2%1) >= 0.5) {
			half1= (int)num2 + 1;
		}
		else {
			half1 = (int)num2;
		}
		
		System.out.println(half1);
	}

}
