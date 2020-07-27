package variable;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("num1 : ");
		int num1 = sc.nextInt();
		System.out.println("+_*/ : ");
		String s =sc.next();
		System.out.println("num2 : ");
		int num2 = sc.nextInt();
		
		switch(s) {
		case "+":
			int sum = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + sum + "\n");
			break;
		case "-":
			int sub = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + sub + "\n");
			break;
		case "*":
			int mul = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + mul + "\n");
			break;
		case "/":
			double div = (double)num1 / (double)num2;
			System.out.println(num1 + " / " + num2 + " = " + div + "\n");
			break;
		}
		
		if(s.equals("+")) {
			int sum = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + sum + "\n");
		}
		else if(s.equals("-")) {
			int sub = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + sub + "\n");
		}
		else if(s.equals("*")) {
			int mul = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + mul + "\n");
		}
		else if(s.equals("/")) {
			double div = (double)num1 / (double)num2;
			System.out.println(num1 + " / " + num2 + " = " + div + "\n");
		}
		else {
			System.out.println("잘못 입력하였습니다.");
		}
	}

}
