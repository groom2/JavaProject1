package numberbaseball;

import java.util.Scanner;

public class Numberbaseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		
		for(int i = 0; i < a.length; i++) {
			int num = (int)(Math.random() * 10);
			
			for(int j = 0; j < i; j++) {
				if(a[0] == 0) {
				i--;
				}
				if(a[j] == num) {
					i--;
				}
				else {
					a[i] = num;
				}
			}
		}
		
		for(int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
		
		System.out.println();
		
		int b[] = new int[4];
		int count = 1;
		
		while(true) {
			int strike = 0, ball = 0;
			int ans = 0;
			
			System.out.println("Turn " + count + ") 4자리 수를 입력 하시오 : ");
			ans = sc.nextInt();
			
			for(int i = 0; i < b.length; i++) {
				b[i] = ans / (int) Math.pow(10, 3 - i);
				ans %= (int) Math.pow(10, 3 - i);
			}
			
			for(int i = 0; i < b.length; i++) {
				if(b[i] == a[i]) {
					strike++;
				}
			}

			for(int i = 0; i < b.length; i++) {
				for(int j = 0; j < a.length; j++) {
					if(j != i && b[i] == a[j]) {
						ball++;
					}
				}
			} // ball
			count++;
			if(strike == 0 && ball == 0) {
				System.out.println("out");
			}
			else if(strike == 4) {
				System.out.println("You Win");
				break;
			}
			else {
				System.out.println(strike + " strike " + ball + " ball ");
			}
			
		}
	}
}
