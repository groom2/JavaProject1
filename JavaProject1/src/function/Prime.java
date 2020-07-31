package function;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("소수 : " + num);
		}
		else {
			System.out.println("소수 : " + f(num));
		}
	}
	
	static int f(int a) {
		int i;
		
		for(i = a; i > 1; i--) {
			int count = 0;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					count = 1;
					break;
				}
			}
			if(count == 0) {
				break;
			}
		}
		return i;
	}
}
