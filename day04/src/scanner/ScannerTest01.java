package scanner;

import java.util.Scanner; // JRE에서 가져옴 / 다른 클래스를 불러옴

// 1번 : 입력 클래스 (Scanner)
public class ScannerTest01 {
	public static void main(String[] args) {
//		자동 import 단축키 : ctrl + shift + s + o
//		sc를 사용해서 Scanner클래스의 메소드 사용
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();		// next() 메소드는 입력을 받고, 받은 값을 String 타입으로 가져오는 기는
		System.out.println(name);
		
		System.out.print("날짜 입력 : ");
		String date = sc.next();
		System.out.println(date);
	}
}
