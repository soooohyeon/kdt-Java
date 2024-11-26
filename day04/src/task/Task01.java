package task;

import java.util.Scanner;

public class Task01 {
   public static void main(String[] args) {
//      풀이한 내용 메모장에 따로 저장 후 강사님께 보내기 (파일명_이름)
      
//      Scanner 클래스 import
      Scanner sc = new Scanner(System.in);
      
//      1. 100000원이 넘는 금액을 입력받아 5만원, 1만원, 5천원, 1천원 단위로 나누어 출력하기
//      *** 로직
//      1) 입력받을 금액 변수와 결과를 담을 변수 선언 및 초기화
//      2) 출력 메세지
//      3) 값을 입력받고 변수에 값 저장
//      4) 각각의 단위로 나눈 값 변수에 저장
//      5) 값 출력
      int money = 0, result1 = 0, result2 = 0, result3 = 0, result4 = 0;
      System.out.print("100000원이 넘는 금액 입력 : ");
      money = sc.nextInt();
      result1 = money / 50000;
      result2 = (money % 50000) / 10000;
      result3 = (money % 10000) / 5000;
      result4 = (money % 5000) / 1000;
      System.out.printf("50000원 짜리 : %d장\n10000원 짜리 : %d장\n", result1, result2);
      System.out.printf("5000원 짜리 : %d장\n1000원 짜리 : %d장\n", result3, result4);
      sc.nextLine();
		
//		2. 키와 몸무게를 입력받아 BMI 계산하기
//			공식 : 몸무게 / (키 * 키

//		3. 밑변과 높이를 입력받아 삼각형의 높이 계산하기
//			공식 : 0.5 * 밑변 * 높이
		
//		4. 두 정수를 입력받아 0보다 큰지 출력하기 (true 또는 false로 출력할 것)
		
//		5. 사용자에게 물건의 개수와 가격을 입력받아 총액 계산하기
//			물건의 개수 : 3
//			물건의 개당 가격 : 15000
//			총액 : 금액원
		
//		6. 두 자리수 정수를 한 개 입력받아 각 자리의 숫자를 더하여 출력하기 (각 자리수의 합을 계산할 것)
		
//		7. 정수를 입력받아 양수이면서 짝수인지 확인하여 결과 출력하기
//			true or false
			
//		8. 두 숫자를 입력받아 첫 번재 입력받은 숫자가 두 번째 숫자보다 크거나 같은지 여부 출력하기
//			true or false
		
//		9. 두 숫자를 입력받아 한 숫자만 양수인지 여부 출력하기
//			true or false
			
//		10. 연도를 입력받아 윤년인지 아닌지 출력하기 (2024년, 2025년도로 확인할 것)
//			true or false → true이면 0000년은 윤년입니다로 출력할 것, false이면 0000년은 윤년이 아닙니다 출력
//			윤년 계산 : 연도가 4로 나누어 떨어지고 100으로 나누어 떨어지지 않거나 400으로 나누어 떨어져야 한다.
	}
}
