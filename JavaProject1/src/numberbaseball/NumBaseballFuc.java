package numberbaseball;

import java.util.Scanner;

public class NumBaseballFuc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[], count = 1;
		a = make();
		boolean more = true;
		while(more) {
			int ans = putans(count);
			more = checkans(ans, a);
			count++;
		}
	}
	
	static int[] make() {
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
		return a;
	}
	
	static int putans(int count) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		
		System.out.println("Turn " + count + ") 4자리 수를 입력 하시오 : ");
		ans = sc.nextInt();
		
		return ans;
	}
	
	static boolean checkans(int ans, int a[]) {
		int b[] = new int[4];
		int check;
		int strike = 0, ball = 0;
		
		for(int i = 0; i < b.length; i++) {
			b[i] = ans / (int) Math.pow(10, 3 - i);
			ans %= (int) Math.pow(10, 3 - i);
		}
			
		for(int i = 0; i < b.length; i++) {
			if(b[i] == a[i]) {
				strike++;
			}
			else {
				for(int j = 0; j < a.length; j++) {
					if(b[i] == a[j]) {
						ball++;
					}
				}
			}
		}
			
		if(strike == 4) {
			System.out.println("You Win");
			return false;
		}
		else if(strike == 0) {
			System.out.println("out");
			return true;
		}
		else {
			System.out.println(strike + " strike " + ball + " ball ");
			return true;
		}
	}
}

