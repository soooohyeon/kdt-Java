package task;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
//      풀이한 내용 메모장에 따로 저장 후 강사님께 보내기 (파일명_이름)

//      Scanner 클래스 import
		Scanner sc = new Scanner(System.in);

//      ---------------------------------------------------------------------

//      1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기
//      *** 로직
//      1) 입력받을 금액 변수와 결과를 담을 변수 선언 및 초기화
//      2) 출력 메세지
//      3) 값을 입력받고 변수에 값 저장
//      4) 각각의 단위로 나눈 값 변수에 저장
//      5) 값 출력
//      6) 버퍼 비우기
		int money = 0, result1 = 0, result2 = 0, result3 = 0, result4 = 0;
		System.out.print("100000원이 넘는 금액 입력 : ");
		money = sc.nextInt();
		result1 = money / 50000;
		result2 = (money % 50000) / 10000;
		result3 = (money % 10000) / 5000;
		result4 = (money % 5000) / 1000;
		System.out.printf("50000원 짜리 : %d 장\n10000원 짜리 : %d 장\n", result1, result2);
		System.out.printf("5000원 짜리 : %d 장\n1000원 짜리 : %d 장\n", result3, result4);
		sc.nextLine();

//    ---------------------------------------------------------------------

//		2. 키와 몸무게를 입력받아 BMI 계산하기
//			공식 : 몸무게 / (키 * 키)
//      ** 로직
//      1) 키, 몸무게, BMI 담을 변수 선언 및 초기화
//		2) 출력 메세지
//      3) 키, 몸무게 입력 받고 변수에 저장
//      4) BMI 계산
//		5) 결과 출력
//      6) 버퍼 비우기
		int height = 0, weight = 0;
		double bmi = 0.0;
		System.out.print("키 입력 : ");
		height = sc.nextInt();
		System.out.print("몸무게 입력 : ");
		weight = sc.nextInt();
		bmi = weight / (double) (height * height);
		bmi = bmi * 10000;
		System.out.printf("BMI는 %.2f%% 입니다.\n", bmi);
		sc.nextLine();

//    ---------------------------------------------------------------------

//		3. 밑변과 높이를 입력받아 삼각형의 넓이 계산하기
//			공식 : 0.5 * 밑변 * 높이
//      1) 입력받을 밑변과 높이, 삼각형의 넓이 변수 선언 및 초기화
//      2) 출력 메세지
//		3) 밑변과 높이 입력 받고, 입력 받은 값 변수에 저장
//		4) 삼각형의 넓이 구하기
//		5) 결과 출력
//		6) 버퍼 비우기
		int width, height2 = 0;
		double result5 = 0.0;
		System.out.print("밑변과 높이 입력(띄어쓰기로 구분) : ");
		width = sc.nextInt();
		height2 = sc.nextInt();
		result5 = 0.5 * width * height2;
		System.out.println("삼각형의 넓이는 " + result5 + "입니다.");
		sc.nextLine();

//    ---------------------------------------------------------------------

//		4. 두 정수를 입력받아 0보다 큰지 출력하기 (true 또는 false로 출력할 것)
//      ** 로직
//      1) 입력받을 두 정수 변수 선언 및 초기화
//		2) 출력 메세지
//		3) 두 정수 입력받고 변수에 저장
//		4) 결과 출력
//      5) 버퍼 비우기
		int num1 = 0, num2 = 0;
		System.out.print("두 정수 입력 (띄어쓰기로 구분) : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("정수1이 0보다 큰가요? " + (num1 > 0));
		System.out.println("정수2가 0보다 큰가요? " + (num2 > 0));
		sc.nextLine();

//    ---------------------------------------------------------------------

//		5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
//			물건의 개수 : 3
//			물건의 개당 가격 : 15000
//			총액 : 금액원
//      ** 로직
//      1) 개수와 금액, 총액을 계산할 결과 변수 선언 및 초기화
//      2) 출력 메세지
//		3) 개수와 금액 입력받고 변수에 저장
//		4) 총액 계산
//		5) 결과 출력
//		6) 버퍼 비우기
		int count = 0, price = 0, total = 0;
		System.out.print("물건의 개수 : ");
		count = sc.nextInt();
		System.out.print("물건의 개당 가격: ");
		price = sc.nextInt();
		total = count * price;
		System.out.printf("총액 %d원\n", total);
		sc.nextLine();

//    ---------------------------------------------------------------------

//		6. 두 자리수 정수를 한 개 입력받아 각 자리의 숫자를 더하여 출력하기 (각 자리수의 합을 계산할 것)
//      ** 로직
//      1) 입력받을 정수와 결과를 넣을 변수 선언 및 초기화
//		2) 출력 메세지
//		3) 두자리 정수 입력받아 변수에 값 저장
//		4) 각 자리의 숫자 더한 결과값 계산
//		5) 결과 출력
//		6) 버퍼 비우기
		int num3 = 0, result6 = 0;
		System.out.print("두 자리의 정수 입력 : ");
		num3 = sc.nextInt();
		result6 = (num3 / 10) + (num3 % 10);
		System.out.println(num3 + "의 각 자리 수의 합 : " + result6);
		sc.nextLine();

//    ---------------------------------------------------------------------

//		7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
//			true or false
//      ** 로직
//      1) 입력받을 정수와 결과 변수 선언 및 초기화
//		2) 출력 메세지
//		3) 정수 입력받고 변수에 값 저장
//		4) 양수 && 짝수 결과 출력
//		5) 버퍼 비우기
		int num4 = 0;
		boolean result7 = false;
		System.out.print("정수 입력 : ");
		num4 = sc.nextInt();
		result7 = (num4 > 0) && (num4 % 2 == 0);
		System.out.println(num4 + "은 양수이면서 짝수인가요? " + result7);
		sc.nextLine();

//    ---------------------------------------------------------------------

//		8. 두 숫자를 입력받아 첫 번째 입력받은 숫자가 두 번째 숫자보다 크거나 같은지 여부 출력하기
//			true or false
//      ** 로직
//      1) 입력받을 두 정수 변수 선언 및 초기화
//		2) 출력 메세지
//		3) 입력 받은 두 정수 변수에 저장
//		4) 결과 출력
//		5) 버퍼 비우기
		int num5 = 0, num6 = 0;
		System.out.print("두 정수 입력 (띄어쓰기로 구분) : ");
		num5 = sc.nextInt();
		num6 = sc.nextInt();
		System.out.println("첫 번째 입력받은 숫자가 두 번째 숫자보다 크거나 같은가요? " + (num5 >= num6));
		sc.nextLine();

//    ---------------------------------------------------------------------

//   	9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
//			true or false
//  	** 로직
//		1) 입력받을 두 정수, 결과를 담을 변수 선언 및 초기화
// 		2) 출력 메세지
// 		3) 입력 받은 두 정수 변수에 저장
// 		4) 결과 비교 후 출력
// 		5) 버퍼 비우기
		int num7 = 0, num8 = 0;
		boolean result8 = false;
		System.out.print("두 정수 입력 (띄어쓰기로 구분) : ");
		num7 = sc.nextInt();
		num8 = sc.nextInt();
// 		result8 = ((num7>0) && (num8<=0))||((num7<0) && (num8>=0));
// 		곱셈으로도 구할 수 있음 (양수 * 양수 = 양수, 음수 * 음수 = 양수, 양수 * 음수 = 음수 를 활용)
		result8 = num7 * num8 < 0;
		System.out.println("한 숫자만 양수인가요? " + result8);
		sc.nextLine();

//---------------------------------------------------------------------

// 		10. 연도를 입력받아 윤년인지 아닌지 출력하기 (2024년, 2025년도로 확인할 것)
//    		true or false → true이면 0000년은 윤년입니다로 출력할 것, false이면 0000년은 윤년이 아닙니다 출력
//    		윤년 계산 : 연도가 4로 나누어 떨어지고 100으로 나누어 떨어지지 않거나 400으로 나누어 떨어져야 한다.
// 		** 로직
//		1) 입력받을 연도와 결과를 담을 변수 선언 및 초기화
// 		2) 메세지 출력
//		3) 년도 입력 받고 변수에 저장
// 		4) 윤년 계산
// 		5) 결과 출력
// 		6) sc.close();
		int year = 0;
		boolean result9 = false;
		System.out.print("년도 입력 : ");
		year = sc.nextInt();
		result9 = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
//		제어문이나 삼항 연산자를 사용하지않고 출력하는 방법은 모르겠어서 임시로 작성해서 제출합니다!
		System.out.printf(result9 ? "%d년은 윤년 입니다." : "%d년은 윤년이 아닙니다.", year);
		sc.close();
	}
}
