package task01;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
//		2) 과속 딱지 끊기
//		   현재 당신은 어린이 보호구역을 지나가고 있고, 과속하고 있습니다.
//		   그런데 불행히도 앞에 과속카메라가 있군요.
//		   당신이 내게될 범칙금을 계산할 수 있습니까?
//			-입력한 속도가 30km 이하일 때까지 "과속입니다"를 출력하고 한번 반복때마다 -1씩 속도가 감소됩니다
//			- 30km 이하가 되면 "정상 속도입니다"를 출력하고 반복을 종료합니다.
//			- 속도에따라 범칙금이 부과됩니다 (상수로 선언) > 최초 속도 입력시 한번만 출력
//				31~50km : 6만원
//				51~70km : 9만원
//				71~90km : 12만원
//				90km 초과 : 15만원
//		** 메인 메소드 로직
//		1. Scanner 클래스 import
//		2. 속도(speed) 변수선언 및 초기화
//		3. 속도 입력 받기
//		4. 속도에 따라 안내메세지 출력하는 제어문 사용
//		5. while 문 사용
//		6. speedCamera 메소드 호출
//		7. 만약 속도가 30 이하라면 반복 종료
//		8. speed 속도가 1씩 감소
//		9. 버퍼 비우기
		Scanner sc = new Scanner(System.in);
		Task2 t = new Task2();
		int speed = 0;
		System.out.print("현재 속도를 입력하세요. : ");
		speed = sc.nextInt();
		
		while(true) {
			System.out.println(t.speedCamera(speed));
			speed--;
			if (speed <= 30) {
				break;
			}
			System.out.println(speed);
		}
		sc.close();
	}
//	** 메소드 로직
//	- 메소드 기능 : 과속 여부 판단하고 메세지 출력
//	- 메소드명 : speedCamera
//	- 매개변수 : int speed
//	- 리턴 : String
//	만약 speed가 30 초과라면 "과속입니다" 반환
//	아니라면 "정상 속도입니다" 반환
	String speedCamera(int speed) {
		String msg = speed > 30 ? "과속입니다." : "정상 속도입니다.";
		return msg;
	}
}
