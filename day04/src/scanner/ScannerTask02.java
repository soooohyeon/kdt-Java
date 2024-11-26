package scanner;

import java.util.Scanner;

// 7번 : 입력메소드 실습
public class ScannerTask02 {
   public static void main(String[] args) {
//	   입력 클래스 import
	   Scanner sc = new Scanner(System.in);
	   
//	   ------------------------------------------------------------------------
	   
//      1. 사용자로부터 세 개의 숫자를 입력받아 합을 출력하는 프로그램
//      - 세개의 숫자를 각각 입력받기
//      - 세 숫자의 합을 계산하여 출력
//      - 세 숫자의 합은 00입니다 형식으로 출력하기

////	   로직
////	   1. 세 개의 정수형 변수와 합 결과를 담은 변수 선언
//	   int num1 = 0, num2 = 0, num3 = 0, sum = 0;
//	   
//////	   입력 (1)
//////	   2. 출력하기 (정수1 입력 : )
////	   System.out.print("정수1 입력 : ");
//////	   3. 입력받은 값을 변수에 담기
////	   num1 = sc.nextInt();
//////	   4. 2-3번 반복해서 정수2, 정수3 변수에 각각 입력받고 값 저장하기
////	   System.out.print("정수2 입력 : ");
////	   num2 = sc.nextInt();
////	   System.out.print("정수3 입력 : ");
////	   num3 = sc.nextInt();
//	   
////	   입력 (2)
//	   System.out.print("정수 3개 입력 : ");
//	   num1 = sc.nextInt();
//	   num2 = sc.nextInt();
//	   num3 = sc.nextInt();
//	   
////	   5. 합 출력
//	   sum = num1 + num2 + num3;
//	   System.out.println(sum);
////	   6. 형식에 맞게 합 출력
//	   System.out.println("세 숫자의 합은 " + sum + " 입니다.");sc.nextLine();
//	   sc.nextLine();

//	   ------------------------------------------------------------------------
	   
//      2. 사용자로부터 일어난 시간(정수), 아침, 점심, 저녁에 할 일과 잠들 시간(정수)을 입력받아 출력하기
//      - 일어날 시간과 아침, 점심, 저녁에 할 일, 잠들 시간을 각각 입력받기
//      - 순서대로 입력받고 출력할것
//      - 출력 형식
//		    오늘 일어난 시간은 00시이고 잠들 시간은 00시 입니다
//		    아침 : 00하기
//		    점심 : 00하기
//		    저녁 : 00하기
	   
////	   로직
////	   1. 각각의 변수 정리 (정수 : 일어난 / 잠든 시간, 문자열 : 아침/점심/저녁에 할일)
//	   int wakeUpTime = 0, sleepTime = 0;
//	   String morningToDo = "", afternoonToDo = "", eveningToDo ="";
//	   
////	   2. 출력 메세지 (일어난 시간 : )
//	   System.out.print("일어난 시간 : ");
////	   3. 값을 입력받고 변수에 저장
//	   wakeUpTime = sc.nextInt();
//	   
////	   4. 2-3번을 반복하여 각각의 변수에 맞는 타입으로 값을 입력받고 값 저장하기
//	   System.out.print("잠든 시간 : ");
//	   sleepTime = sc.nextInt();
////	   4-1. nextInt()에서 남은 엔터값 지우고 다시 문자열 입력받기
//	   sc.nextLine();
//	   System.out.print("아침에 할 일 : ");
//	   morningToDo = sc.nextLine();
//	   System.out.print("점심에 할 일 : ");
//	   afternoonToDo = sc.nextLine();
//	   System.out.print("저녁에 할 일 : ");
//	   eveningToDo = sc.nextLine();
//	   
////	   5. 형식에 맞게 결과 출력
////	    오늘 일어난 시간은 00시이고 잠들 시간은 00시 입니다
////	    아침 : 00하기
////	    점심 : 00하기
////	    저녁 : 00하기
//	   System.out.println("오늘 일어난 시간은 " + wakeUpTime + "시이고 잠들 시간은 " + sleepTime + "시 입니다.");
//	   System.out.println("아침 : " + morningToDo + "하기");
//	   System.out.println("점심 : " + afternoonToDo + "하기");
//	   System.out.println("저녁 : " + eveningToDo + "하기");
//	   sc.nextLine();

//	   ------------------------------------------------------------------------
	   
//      3. 물건가격이 3000원이다. 사용자로부터 지불금액을 입력받아 거스름돈을 계산하기(뺄셈 - 이용)
//      - 출력형식 예시
//		   물건 가격은 3000원입니다
//		   지불가격을 입력하세요 : 00
//		   거스름돈은 7000원입니다
	   
//	   로직
//	   1. 지불금액 변수와 계산을 저장할 변수 만들기
	   final int ITEM_PRICE = 3000;
	   int money = 0, result = 0;
	   
//	   2. 출력 메세지 ("물건 가격은 00원입니다", "지불가격을 입력하세요 : ")
	   System.out.printf("물건 가격은 %d원입니다\n", ITEM_PRICE);
	   System.out.print("지불가격을 입력하세요 : ");
	   
//	   3. 금액 입력받고 변수에 값 저장
	   money = sc.nextInt();
	   
//	   4. 지불금액에서 10000원을 뺀 잔액을 결과 변수에 담기
	   result = money - ITEM_PRICE;
	   
//	   5. 결과 출력하기
	   System.out.println("거스름돈은 " + result + "원 입니다.");
	   
//	   ** close()
	   sc.close();
   }
}
