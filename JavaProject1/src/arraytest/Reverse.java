package arraytest;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[10];
		int b[] = new int[10];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100 + 1);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		int k = 0;
		
		for(int j = a.length - 1; j >= 0; j--) {
			b[k] = a[j];
			System.out.print(b[k] + " ");
			k++;
		}
		
		// a = b;
		for(int i = 0; i < a.length; i++) {
			a[i] = b[i];
			System.out.print(b[i] + " ");
		}
	}

}
