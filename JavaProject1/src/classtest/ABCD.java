package classtest;

import java.util.Scanner;

public class ABCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student abcd[] = new Student[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < abcd.length; i++) {
			System.out.println("ÀÌ¸§ : ");
			String name = sc.next();
			System.out.println("¼ºº° : ");
			String gender = sc.next();
			System.out.println("Å° : ");
			double height = sc.nextDouble();
			System.out.println("¸ö¹«°Ô : ");
			double weight = sc.nextDouble();
			
			abcd[i] = new Student(name, i + 1, gender, height, weight);
		}
		
		for(int i = 0; i < abcd.length; i++) {
			System.out.println(abcd[i].getName() + ", " + abcd[i].getNumber() + ", " + abcd[i].getGender() + ", " + abcd[i].getHeight() + ", " + abcd[i].getWeight());
		}
		
		Student cjh = new Student("ÃÖÁØÇõ", 1, "³²ÀÚ", 181.7 , 123.0);
		Student chm = new Student("ÃÖÇý¹Î", 2, "¿©ÀÚ", 167.7 , 0.1);
		
	}

}
