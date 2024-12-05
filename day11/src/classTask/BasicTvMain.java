package classTask;

import java.util.Scanner;

//3. BasicTv 클래스와 함께 동작하는 TvController 프로그램 작성
public class BasicTvMain {
	public static void main(String[] args) {
//		메뉴 입력 받기 위해 Scanner 클래스 import
		Scanner sc = new Scanner(System.in);
//		BasicTv 객체를 생성하고, 초기값으로 색상 "Black", 크기 32인치, 가격 500000원을 설정
		BasicTv myTv = new BasicTv("Black", 32, 500000);
		
//		myTv 객체에 저장한 정보들 출력
		myTv.printInfo();

//		프로그램은 무한 반복(while)하며 사용자에게 다음 메뉴를 출력한다
//		=== TV 컨트롤 메뉴 ===
//			1. 전원 On/Off
//			2. 채널 올리기
//			3. 채널 내리기
//			4. 종료
//			메뉴 번호 입력 : 
//			
//			사용자가 메뉴 번호를 입력하면, 입력된 번호에 따라 다음 동작을 수행한다
//			1 : powerOnOff() 메서드 호출
//			   전원이 켜지면 "TV 전원이 켜졌습니다." 출력, 꺼지면 "TV 전원이 꺼졌습니다." 출력
//			2 : TV 전원이 켜져 있으면 channelUp() 메서드 호출하고, "현재 채널: [채널 번호]"를 출력
//			   꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//			3 : TV 전원이 켜져 있으면 channelDown() 메서드를 호출하고, "현재 채널: [채널 번호]"를 출력합니다. 꺼져 있으면 "TV 전원을 먼저 켜주세요." 메시지 출력
//			그 외 : 프로그램을 종료하고 "프로그램을 종료합니다." 메시지 출력
//		** 로직
//		1) 메뉴 선택, 반복 프로그램 종료 여부(boolean), 메뉴 메세지를 담을 변수 선언 및 초기화
//		2) while (프로그램 종료 여부 변수) {
//		3) 		메뉴 출력 후 메뉴 선택 후 변수에 값 담기
//		4)		switch 사용 / case 1: 전원 메소드 사용
//		5)			case 2: 채널up 메소드 사용
//		6)			case 3: 채널down 메소드 사용
//		7)			case 4: "프로그램을 종료합니다" 출력
//							프로그램 종료 여부 변수 = false;
//		8)			default: "잘못된 번호 입니다" 출력
		int choice = 0;
		boolean flag = true;
		String menuMsg = "\n\n== TV 컨트롤 메뉴 ==\n"
				+ "1. 전원 On/Off\n"
				+ "2. 채널 올리기\n"
				+ "3. 채널 내리기\n"
				+ "4. 종료\n"
				+ "메뉴 번호 입력 : ";
				
		while (flag) {
			System.out.println(menuMsg);
			choice = sc.nextInt();
			
			switch (choice) {
			case 1: {
				myTv.powerOnOff();
				break;
			}
			case 2: {
				myTv.channelUp();
				break;
			}
			case 3: {
				myTv.channelDown();
				break;
			}
			case 4: {
				System.out.println("프로그램을 종료합니다.");
				flag = false;
				break;
			}
			default:
				System.out.println("잘못된 번호 선택입니다.\n다시 선택해주세요.");
			}
		}
	}
}
