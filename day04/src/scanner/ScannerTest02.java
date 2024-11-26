package scanner;

import java.util.Scanner;

// 2번 : 입력 메소드(로직구성)
public class ScannerTest02 {
	public static void main(String[] args) {
////		1. 입력 클래스 변수 만들기
//		Scanner sc = new Scanner(System.in);
//		
////		2. 출력 메세지(입력받은 내용이 어떤 것인지)
//		System.out.print("지금 배우고 있는 프로그래밍 언어 : ");
//		
////		3. String 변수명 = 입력 메소드
//		String subject = sc.next();
//		
////		4. 변수 출력
//		System.out.println(subject);
		
//		[ 실습 ]
//		이름을 입력하세요 : 000
//		000님 안녕하세요. → printf() 사용할 것
		
//		** 실습 로직구성
//		1. 입력 클래스 변수만들기
		Scanner sc = new Scanner(System.in);
		
//		2. 출력메세지 (입력받은 내용이 무엇인지)
		System.out.print("이름을 입력하세요 : ");
		
//		3. 변수에 입력받은 메세지 담기
		String name = sc.next();
		
//		4. 변수 출력하기
		System.out.printf("%s님 안녕하세요.", name);
	}
}
