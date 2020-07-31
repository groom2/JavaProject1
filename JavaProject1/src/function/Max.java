package function;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, maxx;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		System.out.println("최대 공약수 : " + fuction1(num1, num2, num3));
	}
	
	static int fuction1(int a, int b, int c) {
		int min = a;
		
		if( b <= a && b <= c) {
			min = b;
		}
		else if (c <= a && c <= b){
			min = c;
		}
		int i = 0;
		
		for(i = min; i > 0; i--) {
			if(a % i == 0 && b % i == 0 && c % i == 0) {
				break;
			}
		}
		return i;
	}
}
