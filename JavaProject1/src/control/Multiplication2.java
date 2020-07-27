package control;

public class Multiplication2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i <= 9; i+=2) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + i * j + "\t");
				if(i <= 8) {
					System.out.print((i + 1) + " * " + j + " = " + (i + 1) * j);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
