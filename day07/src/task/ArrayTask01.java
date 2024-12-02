//	박수현
package task;

import java.util.Scanner;

public class ArrayTask01 {
	public static void main(String[] args) {
//		배열 문제 조건	1) 칸 수 알고있다고 가정
//					2) 반드시 length 사용
//					3) 값을 대입하는 반복문, 값을 출력하는 반복문 각각 사용
		
//		1. 100 ~ 1까지의 값을 배열에 넣고 출력
//			일반 for문만 사용
//		** 로직
//		1) 정수형 타입으로된 변수 선언
//		2) for (i = 0; i < 배열의 길이; i++) {
//		3)	배열명[i] = 배열의 길이 - i; }
//		4) for (i = 0; i < 배열의 길이; i++) {
//		5)	배열명[i] 출력 }
		
		int ar1[] = new int [100];
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = ar1.length - i;
		}
		for (int i = 0; i < ar1.length; i++) {
			System.out.println(ar1[i]);
		}
		
//		2. 1 ~ 10까지의 값을 배열에 넣고 총 합 구하기
//			일반 for문만 사용
//		** 로직
//		1) 정수형 배열과 총합을 담을 변수 선언
//		2) for (i = 0; i < 배열의 길이; i++) {
//		3)	배열명[i] = i + 1; }
//		4) for (i = 0; i < 배열의 길이; i++) {
//		5)	총합변수 += 배열명[i]; }
//		6) 결과 출력
		
		int total = 0;
		int ar2[] = new int[10];
		for (int i = 0; i < ar2.length; i++) {
			ar2[i] = i + 1;
		}
		for (int i = 0; i < ar2.length; i++) {
			total += ar2[i];
		}
		System.out.println("1 ~ 10까지의 총 합 : " + total);
		
//		3. 사용자에게 4개의 숫자를 입력받고 입력받은 값을 배열에 저장 후 배열의 평균(소수점 3자리까지) 구하기
//			일반 for문, for-each문 상관없음
//		** 로직
//		1) Scanner 클래스 import
//		2) 크기를 아는 경우로 배열 선언, 총합과 평균을 담을 변수 선언
//		3) 출력 메세지 (띄어쓰기로 구분하여 정수 4개 입력)
//		4) for (i = 0; i < 배열의 길이; i++) {
//		5)	배열명[i] = sc.nextInt(); }
//		6) for (int i : 배열명) {
//			총합 변수 += i; }
//		7) 평균변수 = 총합 / 배열 길이;
//		8) 결과출력
//		9) 버퍼 비우기

		Scanner sc = new Scanner(System.in);
		int ar3[] = new int[4];
		int total2 = 0;
		double avg = 0.0;
		System.out.print("정수 4개 입력 (띄어쓰기로 구분) : ");
		for (int i = 0; i < ar3.length; i++) {
			ar3[i] = sc.nextInt();
		}
		for(int num : ar3) {
			total2 += num;
		}
		avg = (double)total2 / ar3.length;
		System.out.printf("입력하신 숫자 4개의 평균은 %.4f 입니다.\n", avg);
		sc.nextLine();
		
//		4. 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 값을 배열에 담고 출력
//			출력시 for-each문 사용
//		** 로직
//		1) 10칸의 배열 생성
//		2) for (초기 = 0; 조건 < 배열길이; 증감++) {
//		3) 	if (i < 5) {	
//		4) 		배열명[i] = i
//		5)	} else {
//		6)		배열명[i] = i - 5; } }
//		7) foreach문 사용해서 출력
		
		int[] ar4 = new int[10];
		for (int i = 0; i < ar4.length; i++) {
			if (i < 5) {
				ar4[i] = i;
			} else {
				ar4[i] = i-5;
			}
		}
		for (int i : ar4) {
			System.out.println(i);
		}
		
//		5. A ~ F까지를 C만 제외하고 배열에 담아 출력
//			일반 for문 사용
//			초기식 int i = 0;
//		** 로직
//		1) 5칸 문자형 배열 생성
//		2) for (i = 0; i < 배열길이; i++) {
//		3) 	if (i < 2) {
//		4)		배열명[i] = i;	
//		5) } else {
//		6) 		배열명[i] = i + 1; }
//		7) for (i = 0; i < 배열길이; i++) {
//		8)	형변환해서 출력 ((char)배열명[i]); }
		
		char ar5[] = new char[5]; 
		for (int i = 0; i < ar5.length; i++) {
			if (i < 2) {
				ar5[i] = (char)(i+65);
			} else {
				ar5[i] = (char)(i + 66);
			}
		}
		for (int i = 0; i < ar5.length; i++) {
			System.out.print(ar5[i]+ " ");
		}
		
//		6. aBcDeFgHiJkLmNoPqRsTuVwXyZ를 순서대로 배열에 담아 출력
//		** 로직
//		+) 소문자는 97 ~ 122, 대문자는 65 ~ 90
//		1) 칸 26개 정수 배열 생성
//		2) for (int i = 0; i < 문자열 길이; i++) {
//		3)	if (i % 2 == 0) { → i가 0부터 시작되고 2로 나눴을때 나머지가 0이기 떄문에 짝수칸마다 소문자 담기
//				배열명[i] = i + 97; → 소문자라 시작 숫자인 97 더하기
//		4) } else {		// 홀수칸마다 대문자 담기
//				배열명[i] = i + 65; } → 대문자라 시작 숫자인 65 더하기
//		5) for (int alphabet : 배열명) { 배열 값 문자형으로 형변환 후 출력; }
		
		int ar6[] = new int[26];
		for (int i = 0; i < ar6.length; i++) {
			if (i % 2 == 0) {
				ar6[i] = i + 97;
			} else {
				ar6[i] = i + 65;
			}
		}
		for (int alphabet : ar6) {
			System.out.print((char)alphabet);
		}
			
		
//		7. 5개의 정수를 입력한 뒤 배열에 담고 최소값과 최대값 출력하기
//			일반 for문 사용
//		** 로직
//		위에서 Scanner 클래스 import 해둔 상태
//		1) 5칸 정수형 배열 생성, 최소값과 최대값을 담을 변수 선언 및 초기화
//		2) 출력메세지 및 정수 5개 입력받고 배열에 담기
//		3) 버퍼 비우기
//		4) 최소값 → 배열 0번째 값을 최소값에 담고 for문 실행,
//			1번쨰 부터 차례로 값을 비교하며 더 작은 수를 최솟값 변수에 담기→
//		5) 최대값 → 배열 0번째 값을 최소값에 담고 for문 실행,
//			1번쨰 부터 차례로 값을 비교하며 더 큰 수를 최솟값 변수에 담기
//		6) 구한 최솟값, 최대값 출력 
		
		int ar7[] = new int[5];
		int minimum = 0, maximum = 0;
		System.out.print("정수 5개 입력 (띄어쓰기로 구분) : ");
		for (int i = 0; i < ar7.length; i++) {
			ar7[i] = sc.nextInt();
		}
		sc.nextLine();
		minimum = ar7[0];
		for (int i = 1; i < ar7.length; i++) {
			if (minimum < ar7[i]) {
				minimum = ar7[i];
			}
		}
		maximum = ar7[0];
		for (int i = 1; i < ar7.length; i++) {
			if (maximum > ar7[i]) {
				maximum = ar7[i];
			}
		}
		System.out.println("최솟값 : " + minimum + "\n최대값 : " + maximum);
		                     
//		8. 사물함의 비밀번호를 설정하고 사용자에게 이용할 사물함 번호와 비밀번호를 입력받아
//		   입력된 사물함의 비밀번호와 설정한 비밀번호를 비교하여 일치 여부 출력하기
//		** 로직
//		+) 5자리 정수 비밀번호 입력 받아 일치 여부 비교, 사물함 번호 불일치시 종료
//		1) 설정할 5칸 배열과 입력할 5칸 배열 생성, 사물함 번호, 비밀번호 일치여부를 담을 변수 선언 및 초기화
//		2) 출력 메세지 및 사물함 입력받고 사물함 변수에 담기
//		3) 출력 메세지 및 for문 사용해서 설정할 비밀번호 입력받고 정답 배열에 담기
//		4) 사물함 번호 입력받을 출력메세지 및 입력받고 변수에 담아서 비교 후 틀리다면 종료, 맞다면 비밀번호 입력받기
//		5) 출력 메세지 및 for문 사용해서 비밀번호 입력받고 비교 배열에 담기
//		6) for (int i = 0; i < 배열길이; i++) {
//		7) 	if (정답배열명[i] != 입력배열명[i]) { 정답 배열과 비교 배열 차례대로 비교하다 하나라도 틀리다면 일치여부 변수 false로 저장
//		8)		비밀번호 일치여부 false; }
//		9) 	if (비밀번호 일치여부 false 일 때) {
//		10)		메세지(틀렸습니다) 출력 후 반복문 즉시 종료;
//		12)	} else if (비밀번호 마지막 칸 값까지 일치(i == 5)하고 비밀번호 일치여부도 true일 때) {
//		13) 	메세지(일치합니다) 출력 후 반복문 즉시 종료; } }
//		14) 버퍼 비우기
		
		int password[] = new int[5];
		int userPassword[] = new int[5];
		int cabinet = 0, userCabinet = 0;
		boolean isTrue = true;	// 비밀번호 일치 여부 변수
		System.out.print("이용하시고 싶은 사물함 번호를 입력해주세요 : ");
		cabinet = sc.nextInt();
		System.out.print(cabinet + "번을 선택하셨습니다.\n0 ~ 9로만 5자리 비밀번호를 입력하세요. : ");
		for (int i = 0; i < password.length; i++) {
			password[i] = sc.nextInt();
		}
		System.out.print("\n이용하신 사물함 번호를 입력해주세요 : ");
		userCabinet = sc.nextInt();
		if (cabinet != userCabinet) {	// 사물함 번호가 틀리면 프로그램 종료
			System.out.println("틀린 사물함 번호입니다.\n처음부터 다시 시도해주세요.");
		} else {	// 사물함 번호가 맞다면 비밀번호 입력
			System.out.print(userCabinet + "번 사물함 번호를 입력해주세요. : ");
			for (int i = 0; i < userPassword.length; i++) {
				userPassword[i] = sc.nextInt();
			}
			for (int i = 0; i < password.length; i++) {	// 비밀번호 일치 여부 확인
				if (password[i] != userPassword[i]) {
					System.out.println("불일치");
					isTrue = false;
				} 
				if (isTrue == false) {
					System.out.println("종료");
					System.out.println("비밀번호가 틀렸습니다.");
					break;
				} else if (i == password.length-1 && isTrue == true) {
					System.out.println("일치");
					System.out.println("문이 열렸습니다.\n이용해주셔서 감사합니다..");
					break;
				}
			}
		}
		sc.nextLine();
		
//		9. 학생 1명의 3과목 총점과 평균(소수점 3자리까지)을 구하고 출력하기
//			3과목은 배열에 입력받아 저장하며 for-each문만 사용 (일반 for문 사용 금지)
//		** 로직
//		1) 3칸짜리 배열 생성, 총점(정수)과 평균(실수)을 담을 변수 생성
//		2) 출력메세지 및 3과목 for-each 사용해서 점수 입력 받고 배열에 담기
//		3) for-each 사용해서 총점 구하기, 총점 += 배열값
//		4) 총점 형변환해서 평균 구하기, 평균 = (double)(총점) / 배열길이
//		5) 결과 출력 (총점, 평균) - printf();
//		6) 버퍼 비우기 (입력 클래스 종료)
		
		int scores[] = new int[3];
		int index = 0;		// for-each문에서 사용하기 위한 변수
		int total3 = 0;
		double avg2 = 0.0;
		
//		점수 입력 방법 (1)
//		System.out.print("3과목 점수 입력 (띄어쓰기로 구분) : "); 
//		scores[0] = sc.nextInt();
//		scores[1] = sc.nextInt();
//		scores[2] = sc.nextInt();
		
//		점수 입력 방법 (2) : for-each 사용, 인덱스 변수를 따로 사용해야해서 일반 for문을 이용하는게 더 간편함
		for (int score : scores) {
			System.out.print("점수 입력 : "); 
			score = sc.nextInt();
			scores[index++] = score;	// 증감식 후위형으로 사용으로 인덱스 0부터 시작
		}
		
		for (int score : scores) {	// 점수배열 반복 돌려서 총합 구하기
			total3 += score;
		}
		avg2 = (double)total3 / scores.length;
		System.out.printf("총점 : %d점, 평균 : %.3f점", total3, avg2);
		sc.close();
	}
}
