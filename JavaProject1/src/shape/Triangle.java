package shape;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k;
		
		for(i = 1; i <= 6; i++) {
			for(j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(i = 0; i < 6; i++) {
			for(j = i; j < 6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for(i = 1; i <= 6; i++) {
			for(j = 1; j <= 6 - i; j++) {
				System.out.print(" ");
			}
			for(k = j; k <= 6; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for(i = 0; i < 6; i++) {
			for(j = 1; j <= 6 - i; j++) {
				System.out.print("*");
			}
			for(k = j; k <= 6; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}
		
