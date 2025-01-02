package synchronization;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainEx {
	public static void main(String[] args) {
		ThreadEx te = new ThreadEx();
		Thread t1 = new Thread(te);
		String[] btn = { "-1", "종료" };

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		t1.start();
		while (true) {
//			choice = sc.nextInt();
//			JOptionPane : 기본 값을 여러개 넣어줌, 계산기 만들때 사용하기도 함 - 중요하진 않음
			choice = JOptionPane.showOptionDialog(null, "", "숫자놀이", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, btn, null);
			if (choice == 0) {
				te.user();
			} else {
				t1.interrupt();
				System.exit(0);
				break;
			}
		}

	}
}
