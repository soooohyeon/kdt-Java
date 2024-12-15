package methodTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task04 {
	public static void main(String[] args) {
//		문제 01.
//		사용자에게 0~9까지의 정수 10개를 입력을 받고 사용자가 입력한 10개의 정수의 합을 구하시오.
//		이 때 잘못된 정수를 입력하면 다시 입력을 받는다.
//		1. 메소드 사용을 위한 객체화
//		2. 정수형 10칸 배열 생성하고 메소드 호출 (배열 입력받고 값 담기)
//		3. 배열합 구하는 메소드 호출하고 결과 출력
//		Task04 t = new Task04();
//		int[] number = t.inputValue();
//		t.printSumt(number);
		
//		문제 02.
//		사용자에게 행과 열의 수를 입력받아 그에 맞게 한칸당 []를 출력해 행과 열을 표시한다
//		그리고 사용자에게 입력 받은 행 과 열의 곱을 제일 맨 마지막 []안에 기입해준다
//		1. Scanner 클래스 import
//		2. 메소드 사용을 위한 객체화
//		3. 행과 열 변수 선언 및 초기화
//		4. 메세지 출력하고 입력받은 값 변수에 담기
//			- 정수 외 입력시 예외 처리
//		5. [] 출력 메소드 호출
//		6. 입력클래스 종료
		Scanner sc = new Scanner(System.in);
		Task04 t = new Task04();
		int num1 = 0, num2 = 0;
		try {
			System.out.print("행 입력 : ");
			num1 = sc.nextInt();
			System.out.print("열 입력 : ");
			num2 = sc.nextInt();
			t.printArray(num1, num2);
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력입니다.");
		}
		sc.close();
	}
//	1-1.
//	사용자에게 0~9까지의 정수 10개를 입력받은 값 배열에 담기
//	리턴타입 : int[]
//	메소드명 : inputValue
//	실행코드 : while 사용
//	Sanner 클래스 import
//	정수형 10칸 배열 생성
//	메세지 출력 (i번째 정수 입력 : )
//	값 입력받기
//		- 정수 외 입력시 예외처리
//		- 0 ~ 9 범위 밖 정수 입력시 다시 입력받기
//		- 개수가 10개 되면 종료 후 배열 리턴
//	입력클래스 종료
	int[] inputValue() {
		Scanner sc = new Scanner(System.in);
		int[] number = new int[10];
		int count = 0;
		while (true) {
			System.out.print((count + 1) + "번째 정수 입력 : ");
			try {
				number[count] = sc.nextInt();
				if (number[count] >= 0 && number[count] < 10) {
					count++;
				} else {
					System.out.println("0 ~ 9 중 입력해주세요.");
				}
			} catch (InputMismatchException e) {
				sc = new Scanner(System.in); 
				System.out.println("잘못된 입력입니다.");
			}
			if (count == 10) {
				break;
			}
		}
		return number;
	}
	
//	1-2.
//	총 합 구하는 메소드
//	리턴타입 : void
//	메소드명 : printSum
//	매개변수 : int[]
//	실행코드 : 
//	총합 변수 선언 및 초기화
//	for (매개변수 배열의 길이만큼 반복)
//		총합 = 배열[i];
//	총합 출력
	void printSumt(int[] number) {
		int total = 0;
		for (int data : number) {
			total += data;
		}
		System.out.println("총합은 " + total + "입니다.");
	}
	
//	2.
//	전달받은 행과 열에 맞춰 [] 출력하고 마지막 값에 행 * 열 출력]
//	리턴타입 : void
//	메소드명 : printArray
//	매개변수 : int num1, int num2
//	실행코드
//	for (num1만큼 반복) 
//		for (num2만큼 반복)
//			if (i == num1 -1 && j == num2 - 1) {
//				num1 * num2 출력
//			} else
//				[] 출력 }
//			줄바꿈 } }
	void printArray(int num1, int num2) {
		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num2; j++) {
				if (i == (num1 - 1) && j == (num2 - 1)) {
					System.out.print("["+ (num1 * num2) + "]");
				} else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}
	}
}
