package task;

import java.util.Scanner;

// 배열 실습 과제 - 강사님 풀이
public class ArrayTask02 {
	public static void main(String[] args) {
	      //8. 사물함의 비밀번호를 설정하고 사용자에게 이용할 사물함 번호와 비밀번호를 입력받아
	      //    입력된 사물함의 비밀번호와 설정한 비밀번호를 비교하여 일치 여부 출력하기
	      
	      //배열이용x
	      //0) Scanner 입력클래스 import
	      //1) 사물함 번호 설정
	      //2) 비밀번호 설정
	      //3) 사용할 사물함번호와 비밀번호 입력 후 일치여부 확인(if)
	      
	      Scanner sc = new Scanner(System.in);
//	      System.out.println("사물함 번호를 입력하세요 : ");
//	      int num1 = sc.nextInt();
//	      System.out.println("선택한 사물함의 비밀번호를 설정하세요 : ");
//	      int arPw = sc.nextInt();
//	      
//	      System.out.println("사용할 사물함 번호를 입력하세요 : ");
//	      int choice = sc.nextInt();
//	      System.out.println("사용할 사물함 번호의 비밀번호를 입력하세요 : ");
//	      int choicePw = sc.nextInt();
//	      
//	      if(arPw == choicePw) {
//	         System.out.println("비밀번호가 일치합니다. 사물함을 이용하세요.");
//	      }else {
//	         System.out.println("비밀번호가 일치하지 않습니다.");
//	      }
	      
	      //1) 5칸짜리 사물함의 비밀번호를 각각 배열에 저장한다
	      //2) 사용자에게 이용할 사물함 번호를 묻는다
	      //3) 비밀번호를 입력받아 확인한다
	      //4) 일치/불일치를 출력한다
	      
	      int[] arPw = new int[5];
//	      int[] arPw1 = {1111, 2222, 3333, 4444, 5555};
	      String mainMsg = "번 사물함의 비밀번호 설정 : ";
	      String choiceMsg = "이용할 사물함 번호 입력 : ";
	      String inputMsg = "비밀번호 입력 : ";
	      String result = null;
	      int choice = 0, inputPw = 0;
	      
	      for(int i = 0; i < arPw.length; i++) {
	         System.out.println(i + 1 + mainMsg);
	         arPw[i] = sc.nextInt();
	      }
//	      for(int data : arPw) {
//	         System.out.println(data);
//	      }
	      
	      System.out.println(choiceMsg);
	      choice = sc.nextInt();
	      
	      System.out.println(inputMsg);
	      inputPw = sc.nextInt();
	      
	      if(arPw[choice - 1] == inputPw) {
	         System.out.println("비밀번호 일치");
	      }else {
	         System.out.println("비밀번호 불일치");
	      }		
	}
}
