package twoForTest;
import java.util.Scanner;
// 4번 : 이중 For문 + Scanner
public class TwoForTest03 {
   public static void main(String[] args) {
//	   사용자한테 입력받은 수만큼 행 출력
//	   1) Scanner 클래스 import
//	   2) 정수 입력받고 변수에 담기
//	   3) 바깥for문 조건식의 최대값을 입력받은 변수로 변경
//	   4) sc.close();

	   Scanner sc = new Scanner(System.in);
	   
	   int answer = 0;
	   System.out.print("정수 입력 : ");
	   answer = sc.nextInt();
	   
	   for (int i = 1; i <= answer; i++) {
//		   System.out.println("*"); //행
		   for (int j = 1; j <= i; j++) { // 열
			  System.out.print("* ");
		   }
		   System.out.println();
	   }
   }
}