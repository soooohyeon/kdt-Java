package task01;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
//		1) 당신의 아이는 놀이동산 기구를 탑승하려는데 어린이 탑승제한이 있는것을 눈치챘습니다.
//	   	   당신의 아이가 탑승 조건에 부합하는지 체크하는 로직을 작성할 수 있습니까?
//	   		- 키 120cm, 나이 8살 이하 탑승시 "탑승이 불가합니다" 출력
//	   		- 키 160cm, 나이 15살 이상 탑승시 "탑승이 불가합니다" 출력
//	   	** 로직
//			1. Scanner 클래스 import
//			2. 키랑 나이 변수 선언 및 초기화
//			3. 키랑 나이 입력받기
//			4. if (키 <= 120 && 나이 <= 8) {
//				"탑승이 불가합니다" 출력
//			}
//			5. } else if (키 >= 160 && 나이 >= 15) {
//				"탑승이 불가합니다" 출력
//			} else {
//			6. 	"탑승 해주세요" 출력 }
//			7. 버퍼 비우기 sc.close(); 또는 sc.nextLine();
		Scanner sc = new Scanner(System.in);
		double height = 0;
		int age = 0;
		System.out.print("키를 입력해주세요 : ");
		height = sc.nextDouble();
		System.out.print("나이를 입력해주세요 : ");
		age = sc.nextInt();
		
		boolean isTrue = (height <= 160 && height >= 120) && (age >= 8 && age <= 15);
		
//		(1) 메소드 작성 x
//		(1-1)
//		if (isTrue) {
//			System.out.println("탑승 해주세요.");
//		} else {
//			System.out.println("탑승이 불가합니다.");
//		}
//		(1-2)
		System.out.println(isTrue ? "탑승 해주세요." : "탑승이 불가합니다.");
		
//		(2) 메소드 작성
		Task1 t = new Task1();
		t.ride(height, age);
		
		sc.close();
	}
	void ride(double height, int age) {
		boolean isTrue = (height <= 160 && height >= 120) && (age >= 8 && age <= 15);
		System.out.println(isTrue ? "탑승 해주세요." : "탑승이 불가합니다.");
	}
}
