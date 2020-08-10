package maplestory;

import java.util.Scanner;

public class Maplestory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menu, max = 0, nth; // �޴�, ���� ��, n��° ����
		User user[] = new User[10];
		boolean doing = true;
		
		while(doing) {
			showmenu();
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				max = makeaccount(max, user);
				break;
			
			case 2:
				nth = login(max, user);
				if(nth < max) {
					makecharacter(nth, user);
					userInfo(nth, user);
				}
				break;
				
			case 3:
				System.out.println("�����մϴ�.");
				doing = false;
				break;
			}
		}
	}
	
	static void showmenu() { // �޴�
		System.out.println("1. ȸ������");
		System.out.println("2. �α���");
		System.out.println("3. ����");
	}
	
	static int makeaccount(int max, User user[]) { // ���������
		Scanner sc = new Scanner(System.in);
		String ID, Password;
		System.out.println("�� ���̵� �Է� : ");
		ID = sc.next();
		
	
		if (checkID(ID, user, max) == true) {
			System.out.println("�ߺ��� ���̵��Դϴ�.");
		}
		else {
			System.out.println("��й�ȣ �Է� : ");
			Password = sc.next();
			user[max] = new User(ID, Password);
			max++;
		}
	
		return max;
	}
	
	static boolean checkID(String ID, User user[], int max) { // ���̵� �ߺ� Ȯ��
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		
		for(int i = 0; i < max; i++) {
			if(user[i].getNexonID().equals(ID)) { 
				check = true; // ���̵� �ߺ��Ǹ� true
			}
		}
		return check;
	}
	
	static int login(int max, User user[]) { // �α����ϱ�
		Scanner sc = new Scanner(System.in);
		String ID, Password;
		int i = 0, nth = max + 1;
		
	
		System.out.println("���̵� �Է� : ");
		ID = sc.next();
		boolean IDcheck = false;
		
		for(i = 0; i < max; i++) {
			if(ID.equals(user[i].getNexonID())) { // ID�� ��ġ�� i��° ����
				IDcheck = true; // ID�� ��ġ�ϸ� true
				System.out.println("��й�ȣ �Է� : ");
				Password = sc.next();
				
				if(Password.equals(user[i].getPassword())) { // i��° ������ ��й�ȣ
					System.out.println("�α��� �Ǿ����ϴ�.");
					nth = i;
				}
				else {
					System.out.println("��й�ȣ�� �߸� �Է��Ͽ����ϴ�.");
				}
				break;
			}
		}
		
		if(IDcheck == false) {
			System.out.println("���̵� �߸� �Է��Ͽ����ϴ�.");
		}
	return nth;
}
	
	static void makecharacter(int nth, User user[]) {
		Scanner sc = new Scanner(System.in);
		String UserName, ClassName;
		
		System.out.println("ĳ���� �̸�");
		UserName = sc.next();
		
		System.out.println("���� ����");
		ClassName = sc.next();
		
		user[nth].setUserName(UserName); // n��° ������ �̸�
		user[nth].setClassName(ClassName); // n��° ������ ����
	}
	
	static void userInfo(int nth, User user[]) { // ���� ����
		System.out.println("ID : " + user[nth].getNexonID());
		System.out.println("Password : " + user[nth].getPassword());
		System.out.println("ĳ���� �̸� : " + user[nth].getUserName());
		System.out.println("���� : " + user[nth].getClassName());
	}
}
