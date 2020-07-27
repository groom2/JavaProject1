package arraytest;

public class Table {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[100];
		
		for(int i = 0; i < 100; i++) {
			arr[i] = (int) (Math.random()*100) + 1;
		}
		
		int max = arr[0], min = arr[0];
		int sum = 0, avg;
		
		for(int j = 0; j < 100; j++) {
			if(arr[j] > max) {
				max = arr[j];
			}
			if(arr[j] < min) {
				min = arr[j];
			}
			sum += arr[j];
		}
		
		avg = sum / arr.length;
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		
		
	}

}
