package shape;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, l;
		

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4 - 2 * i; j++) {
				System.out.print(" ");
			}
			for (l = j; l < 8 + 2*i; l++) {
				System.out.print("*");			
			}
			System.out.println();
		}
		for (i = 3; i > 0; i--) {
			for (j = 0; j < 6 - 2 * i; j++) {
				System.out.print(" ");
			}
			for (l = j; l < 6 + 2*i; l++) {
				System.out.print("*");			
			}
			System.out.println();
		}
	}

}
