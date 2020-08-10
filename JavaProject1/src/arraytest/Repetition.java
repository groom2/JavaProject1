package arraytest;

public class Repetition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[7];
		a[0] = (int)(Math.random() * 10) + 1;
		
		for(int i = 0; i < a.length; i++) {
			int num = (int)(Math.random() * 10) + 1;
			
			for(int j = 0; j < i; j++) {
				if(a[j] == num) {
					i--;
				}
				else {
					a[i] = num;
				}
			}
		}
		
		for(int k = 0; k < a.length - 1; k++) {
			System.out.print(a[k] + " ");
		}
		System.out.print("+ " + a[a.length - 1]);
	}

}
