package ex03_박수현;

import java.util.Scanner;

public class Stars2 {
	public static void main(String[] args) {
//		3.
//		(2) 사용자로부터 행을 입력받아 입력받은 숫자만큼 행으로 직각삼각형 출력
//		- 클래스명 : Stars2
//		[입출력결과]
//		출력하고 싶은 행 입력 : 4
//		*
//		**
//		***
//		****
//		이중 for문 사용해서 바깥 for문으로 행 반복
//		안쪽 for문으로 하나씩 증가하는 * 출력
//		후에 입력받은 값으로 바깥 for문 조건식 변경
//		버퍼 비우기
		Scanner sc = new Scanner(System.in);
		System.out.print("출력하고 싶은 행 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i < num + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
