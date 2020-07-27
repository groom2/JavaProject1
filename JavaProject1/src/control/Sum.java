package control;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			sum += i;
		}
		
		System.out.println("결과 : " + sum);
		
		int sum2 = 0;
		int i = 1;
		
		while(i <= 1000) {
			sum2 += i;
			i++;
		}
		System.out.println("결과 : " + sum2);
	}

}
