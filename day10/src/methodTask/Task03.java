package methodTask;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.SeparatorUI;

public class Task03 {
//	문제 01. 10x10 크기의 2차원 배열에 1부터 100까지의 자연수를 차례대로 저장한 후, 
//			사용자로부터  입력 받은 두 수에 대해 해당 숫자의 배수들을 각각 찾아 
//			배수들의 개수, 합, 평균을 계산하여 출력하는 프로그램을 작성하세요.
//		[조건]
//		1. 입력된 두 숫자는 1부터 100 사이의 자연수여야 하며,
//		  범위위 밖의 숫자가 입력되면 다시 입력을 받는다.
//		2. 2차원 배열에 값을 저장할 때, 메소드명은 insertValue 을 사용한다.
//		3. 배수의 개수를 구할 때  메소드명은  findMultiple 을 사용한다.
//		4. 배수들의 합, 평균을 구하고 , 최종 결과를 출력하는 메소드명은 findValue 를 사용한다.
//		5. 계산된 평균은 소수점 둘째 자리까지 출력
//		6. 2차원 배열에 값을 저장/ 최종 결과를 출력하는 메소드를 제외하고는 모두 매개변수와 리턴값이 존재한다.
//	** 로직
//	1. 2차원 배열에 값을 저장하는 메소드
//		1) 리턴 타입 : void
//		2) 메소드명 : intsertValue
//		3) 매개변수 : int[][]
//		4) 코드
//			2차원 배열 생성 및 선언
//			값 저장할 변수 = 1;
//			for (행 길이만큼 반복) {
//				for (열 길이만큼 반복) {
//					배열명[i][j] = 값 저장 변수++;
//			}
//			2차원 배열 리턴
	int[][] intsertValue() {
		int[][] number = new int[10][10];
		int idx = 1;
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				number[i][j] = idx++;
			}
		}
		return number;
	}
//	2. 배수의 개수를 구하는 메소드명
//		1) 리턴 타입 : int[]
//		2) 메소드명 : findMultiple
//		3) 매개변수 : int num1, num2
//		4) 코드
//			2차원 배열 변수 = intsertValue();
//			개수 누적 변수 선언 및 초기화
//			for (행 길이 반복) {
//				for (열 길이 반복) {
//					if (배열[i][j] % num1 == 0 || 배열[i][j] % num1 == 0 ) {
//					누적변수++; } }
//			return 개수 누적 변수;
	int findMultiple(int num1, int num2) {
		int[][] numbers = intsertValue();
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] % num1 == 0 || numbers[i][j] % num2 == 0) {
					count++;
				}
			}
		}
		return count;
	}
//	3. 배수들의 합, 평균을 구하는 메소드
//		1) 리턴 타입 : int []
//		2) 메소드명 : findValue 
//		3) 매개변수 : int num1, num2
//		4) 코드
//			2차원 배열 변수 = findValue ();
//			합과 평균 변수 를 담을 배열 선언 및 생성
//			개수 누적 변수 선언 및 초기화
//			for (int[] data : 2차원 배열) {
//				for (int data2 : data) {
//					if (data2 % num1 == 0 || data2 % num2 == 0) {
//						배열[0] += data2; } } }
//			배열[1] = (double)합 / 개수 변수;
//			return 결과 배열;
	double[] findValue(int num1, int num2) {
		int[][] numbers = intsertValue();
		double[] result = new double[2];
		int count = 0;
		for (int[] data : numbers) {
			for (int data2 : data) {
				if (data2 % num1 == 0 || data2 % num2 == 0) {
					result[0] += data2;
					count++;
				}
			}
		}
		result[1] = (double)result[0] / count;
		return result;
	}
	
//	==============================================================
	
//	문제 02. 0~15까지의 숫자를 입력받은 뒤 이를 세로로 이진수로 출력하기
//		[조건]
//		1. 0~15범위 밖의 숫자를 입력받을 시 “잘못된 입력입니다 다시 입력해주세요 : “를 출력하고 제대로 받을 때까지 반복
//		2. 0은 0으로 만든 5*5크기의 0으로 만들 것
//		3. 1은 1으로 만든 5*5크기의 1로 만들 것 (1은 중간에 있어야함 왼쪽 또는 오른쪽으로 치우치면 안됨)
//		4. 0또는 1을 출력한 뒤 줄바꿈을 할 것
//		5. 메소드로 만들어서 사용할 것 : 2진수로 변환하는 코드, 0을 출력하는 코드, 1을 출력하는 코드 (총 3가지)
//			** 전부 매개변수 자유, 리턴값 자유, static 사용 불가
//			** 10진수를 2진수로 변환하는 “toBinaryString()” 사용금지
//	** 로직
//	1. 2진수로 변환 메소드
//		1) 리턴 타입 : int[]
//		2) 메소드명 : changeBinary
//		3) 매개변수 : int num
//		4) 코드
//			2진수를 담을 4칸 짜리 배열 선언 및 생성
//			몫을 담을 변수 선언 및 초기화
//			for (배열길이만큼 반복) {
//				배열[i] = num % 2;	// 0, 1 나머지를 담아 배열에 저장
//				num /= 2; }			// 그다음 계산을 해줄 나누고 몫을 누적함
//			return 2진수 배열;
		int[] changeBinary(int num) {
			int[] binary = new int[4];
			for (int i = binary.length-1; i >= 0 ; i--) {
				binary[i] = num % 2;
				num /= 2;
			}
			return binary;
		}
//		2. 0으로 만든 5*5크기의 0 출력
//			1) 리턴 타입 : void
//			2) 메소드명 : printZero
//			3) 코드
//				for (5번 반복) {
//					for (5번 반복) {
//						문자 = i가 1 ~ 3이고 j가 1 ~ 3 ? " " : "0";
//						문자 변수 줄바꿈없이 출력 }
//					줄바꿈 출력 } }
		void printZero() {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					String zero = i >= 1 && i <= 3 && j >= 1 && j <= 3 ? " " : "0";
					System.out.print(zero);
				}
				System.out.println();
			}
		}
//		3. 1으로 만든 5*5크기의 1 출력
//			1) 리턴 타입 : void
//			2) 메소드명 : printOne
//			3) 코드
//			for (5번 반복) {
//				for (5번 반복) {
//					문자 = j == 2 ? "1" : " ";
//					문자 변수 줄바꿈없이 출력 }
//				줄바꿈 출력 } }
		void printOne() {
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					String one = j == 2 ? "1" : " ";
					System.out.print(one);
				}
				System.out.println();
			}
		}

//		==============================================================
		
//	문제 03. 충전한 교통금액을 입력하고 한달간 택시, 버스, 지하철 이용횟수를 입력하여 잔액표시하기
//		충전한 교통금액을 입력받고 한달간 택시, 버스, 지하철 이용횟수를 입력하여 잔액표시하기
//		잔액을 초과한 경우 다음달 청구금액으로 표시
//			- 택시 5000원
//			- 버스 1500원
//			- 지하철 1200원
//			- 각 요금은 변하지 않는다
//		** 로직
//		1. 한달동안 나올 요금 계산 메소드
//			1) 리턴 타입 : int
//			2) 메소드명 : payTrafficCharge
//			3) 매개변수 : int num1, num2, num3
//			4) 코드
//				요금 상수로 선언, 총액 계산할 결과값 선언 및 초기화
//				결과 = 각각의 요금 * 횟수 전부 더하기
		int payTrafficCharge(int num1, int num2, int num3) {
			final int TAXI = 5000;
			final int BUS = 1500;
			final int SUBWAY = 1200;
			int total = 0;
			total = TAXI * num1 + BUS * num2 + SUBWAY * num3;
			return total;
		}
				
	public static void main(String[] args) {
//		문제 01. 배수들의 개수, 합, 평균을 계산하여 출력하는 프로그램
//		** 로직
//		1) Scanner 클래스 import 및 Task03 클래스 객체화
//		2) 입력받을 정수 2개 선언 및 초기화
//		3) while(true) {
//		4)	"정수 입력" 메세지 출력 및 정수 2개 입력받기
//		5)		if (정수 2개가 전부 1보다 크고 100보다 작을 때) { 반복 종료 }
//				else { "다시 입력하세요" 메세지 출력 } }
//		6) 결과 출력
//		7) 버퍼 비우기
		Scanner sc = new Scanner(System.in);
		Task03 t = new Task03();
		
		int num1 = 0, num2 = 0;
		while (true) {
			System.out.print("정수 2개 입력 (띄어쓰기로 구분) : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
				break;
			} else {
				System.out.println("잘못된 숫자입니다. 다시 입력해주세요.");
			}
		}
		int result1 = t.findMultiple(num1, num2);
		int result2 = (int)(t.findValue(num1, num2)[0]);
		double result3 = t.findValue(num1, num2)[1];
		System.out.printf("%d, %d의 배수의 개수는 총 %d개 이고, 합은 %d,"
				+ " 평균은 %.2f 입니다.", num1, num2, result1, result2, result3);
		sc.nextLine();

//		==============================================================
		
//		문제 02. 0~15까지의 숫자를 입력받은 뒤 이를 세로로 이진수로 출력하기
//		** 로직
//		1) Scanner 클래스 import 및 Task03 클래스 객체화
//		2) 입력받을 정수 1개 선언 및 초기화
//		3) while(true) {
//		4)	"정수 입력" 메세지 출력 및 정수 1개 입력받기
//		5)		if (정수 1개가 0보다 크고 15보다 작을 때) { 반복 종료 }
//				else { "다시 입력하세요" 메세지 출력 } }
//		6) for-each문 사용해서 0일 떄 printZero()호출, 1일때 printOne() 호출
//		7) 버퍼 비우기
//		Scanner sc = new Scanner(System.in);
//		Task03 t = new Task03();
		
		int num3 = 0;
		while (true) {
			System.out.print("정수 1개 입력 : ");
			num3 = sc.nextInt();
			if (num3 >= 0 && num3 <= 15) {
				break;
			} else {
				System.out.println("잘못된 숫자입니다. 다시 입력해주세요.");
			}
		}
		for (int data : t.changeBinary(num3)) {
			if (data == 0) {
				t.printZero();
			} else {
				t.printOne();
			}
			System.out.println();
		}
		sc.nextLine();

//		==============================================================
		
//		문제 03. 충전한 교통금액을 입력하고 한달간 택시, 버스, 지하철 이용횟수를 입력하여 잔액표시하기
//		** 로직
//		1) Scanner 클래스 import 및 Task03 클래스 객체화
//		2) 충전 금액, 잔액변수, 각각의 이용횟수 변수 선언 및 초기화 총 5개
//		3) 토탈 요금을 담을 변수 선언하고 담기
//		4) if (토탈요금 >= 충전금액) { 결과 및 잔액 출력
//		5) } else { 이월금액 출력 }
//		6) 버퍼 비우기
//		Scanner sc = new Scanner(System.in);
//		Task03 t = new Task03();
		
		int charge = 0, balance = 0, taxi = 0, bus = 0, subway = 0;
		System.out.print("충전할 금액 : ");
		charge = sc.nextInt();
		System.out.print("한달간 택시, 버스, 지하철 이용횟수 입력 (띄어쓰기로 구분) : ");
		taxi = sc.nextInt();
		bus = sc.nextInt();
		subway = sc.nextInt();
		int total = t.payTrafficCharge(taxi, bus, subway);
		if (total <= charge) {
			System.out.println("택시 : " + taxi + ", 버스 : " + bus + ", 지하철 : " + subway);
			System.out.printf("이번달 교통대금은 %d원 입니다.\n결제 후 잔액은 %d원 입니다", total, (charge-total));
		} else {
			System.out.println("충전 금액을 초과했습니다.");
			System.out.printf("다음달 청구 금액은 %d원 입니다.", (total-charge));
		}
		sc.close();
	}
}
