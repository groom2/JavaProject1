package abstractclass;

import java.util.Scanner;

public class Main extends Player{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String song = sc.next();
		Main m = new Main();
		m.play(song);
		m.pause();
		m.stop();
		
	}

	@Override
	void play(String song) {
		// TODO Auto-generated method stub
		System.out.println(song+" ���");
	}

	@Override
	void pause() {
		// TODO Auto-generated method stub
		System.out.println("�Ͻ�����");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

}
