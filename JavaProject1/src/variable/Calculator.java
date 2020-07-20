package variable;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 11, num2 = 22;
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = (double)num1 / (double)num2;
		
		System.out.println(num1 + " + " + num2 + " = " + sum + "\n");
		System.out.println(num1 + " - " + num2 + " = " + sub + "\n");
		System.out.println(num1 + " * " + num2 + " = " + mul + "\n");
		System.out.println(num1 + " / " + num2 + " = " + div + "\n");
		
	}

}
