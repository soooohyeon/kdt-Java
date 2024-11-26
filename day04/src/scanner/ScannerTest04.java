package scanner;

import java.util.Scanner;

// 4번 : 입력 메소드 연습
public class ScannerTest04 {
	public static void main(String[] args) {
//		사용자로부터 주소를 입력받아 출력
//		3개의 next 메소드를 사용하며 '서울시 강남구 역삼동'으로 출력될 수 있도록 할 것
		
//		1. 입력클래스 import
		Scanner sc = new Scanner(System.in);

//		2. 출력 메세지(1번)
		System.out.println("주소 입력 → ");
		
//		3. 입력 메소드(.next()) 3개
		String city = sc.next();		// 입력 값을 공백 단위로 나누어서 저장
		String district = sc.next();
		String neighborhood = sc.next();
		
//		4. 출력
		System.out.printf("입력한 주소는 %s %s %s 입니다.", city, district, neighborhood);

//		5. Scanner 자원 해제 (이후부터 입력 메소드 사용 불가)
		sc.close();
	}
}
