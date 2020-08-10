package maplestory;

import java.util.Scanner;

public class Maplestory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menu, max = 0, nth; // 메뉴, 유저 수, n번째 유저
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
				System.out.println("종료합니다.");
				doing = false;
				break;
			}
		}
	}
	
	static void showmenu() { // 메뉴
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
	}
	
	static int makeaccount(int max, User user[]) { // 계정만들기
		Scanner sc = new Scanner(System.in);
		String ID, Password;
		System.out.println("새 아이디 입력 : ");
		ID = sc.next();
		
	
		if (checkID(ID, user, max) == true) {
			System.out.println("중복된 아이디입니다.");
		}
		else {
			System.out.println("비밀번호 입력 : ");
			Password = sc.next();
			user[max] = new User(ID, Password);
			max++;
		}
	
		return max;
	}
	
	static boolean checkID(String ID, User user[], int max) { // 아이디 중복 확인
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		
		for(int i = 0; i < max; i++) {
			if(user[i].getNexonID().equals(ID)) { 
				check = true; // 아이디가 중복되면 true
			}
		}
		return check;
	}
	
	static int login(int max, User user[]) { // 로그인하기
		Scanner sc = new Scanner(System.in);
		String ID, Password;
		int i = 0, nth = max + 1;
		
	
		System.out.println("아이디 입력 : ");
		ID = sc.next();
		boolean IDcheck = false;
		
		for(i = 0; i < max; i++) {
			if(ID.equals(user[i].getNexonID())) { // ID가 일치한 i번째 유저
				IDcheck = true; // ID가 일치하면 true
				System.out.println("비밀번호 입력 : ");
				Password = sc.next();
				
				if(Password.equals(user[i].getPassword())) { // i번째 유저의 비밀번호
					System.out.println("로그인 되었습니다.");
					nth = i;
				}
				else {
					System.out.println("비밀번호를 잘못 입력하였습니다.");
				}
				break;
			}
		}
		
		if(IDcheck == false) {
			System.out.println("아이디를 잘못 입력하였습니다.");
		}
	return nth;
}
	
	static void makecharacter(int nth, User user[]) {
		Scanner sc = new Scanner(System.in);
		String UserName, ClassName;
		
		System.out.println("캐릭터 이름");
		UserName = sc.next();
		
		System.out.println("직업 선택");
		ClassName = sc.next();
		
		user[nth].setUserName(UserName); // n번째 유저의 이름
		user[nth].setClassName(ClassName); // n번째 유저의 직업
	}
	
	static void userInfo(int nth, User user[]) { // 유저 정보
		System.out.println("ID : " + user[nth].getNexonID());
		System.out.println("Password : " + user[nth].getPassword());
		System.out.println("캐릭터 이름 : " + user[nth].getUserName());
		System.out.println("직업 : " + user[nth].getClassName());
	}
}
