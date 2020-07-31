package arraytest;

public class Repetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[7];
		a[0] = (int)(Math.random() * 10) + 1;
		
		for(int i = 0; i < a.length; i++) {
			int check = 0;
			int num = (int)(Math.random() * 10) + 1;
			
			for(int j = 0; j < i; j++) {
				if(a[j] == num) {
					check = 1;
				}
				else {
					a[i] = num;
				}
			}
			if(check == 1) {
				i--;
				continue;
			}
		}
		
		for(int k = 0; k < a.length - 1; k++) {
			System.out.print(a[k] + " ");
		}
		System.out.print("+ " + a[a.length - 1]);
	}

}
