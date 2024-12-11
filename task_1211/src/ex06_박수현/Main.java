package ex06_박수현;

public class Main {
	public static void main(String[] args) {
//		(3) Main 클래스
//		- 메인 메소드 구현
//		- SavingsAccount와 CheckingAccount 객체 생성
//		- 이자 추가 메소드(addInterest)를 호출하여 계좌에 이자 추가
//		- 두 계좌 간 송금(transfer) 수행
//		- 각 계좌의 정보를 출력(printDetails)하여 결과 확인
		
//		각 계좌 객체 생성
		SavingsAccount sa = new SavingsAccount();
		CheckingAccount ca = new CheckingAccount();
//		초기 상태 출력
		sa.printDetails();
		ca.printDetails();
		
//		이자 추가
		System.out.println("\n예금 계좌에 이자 추가 중입니다.");
		sa.addInterest(5);
		
//		송금
		System.out.println("\n예금 계좌에서 체크 계좌로 송금 중입니다.");
		sa.transfer(ca, 3000);	// 송금 메소드
		ca.receive(3000);		// 입금 메소드

//		최종 상태 출력
		System.out.println("\n===== 거래 후 계좌 정보 =====");
		sa.printDetails();
		ca.printDetails();
		
		
	}
}
