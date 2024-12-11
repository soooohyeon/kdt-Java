package ex06_박수현;

public class SavingsAccount extends AccountBasic implements AdvanceAccount {
//	- SavingsAccount 클래스
//    AdvanceAccount 인터페이스 구현
//    addInterest(double rate) 메소드 : 잔액(balance)에 주어진 비율(rate, %)만큼 이자 추가
//                    printf 메소드를 사용하며 이자율은 소수점 2자리까지
//    transfer(Account target, double amount) 메소드 : 잔액이 충분한 경우 송금 처리 수행
//                    잔액이 부족하면 "송금 실패, 이유 : 잔액 부족" 메시지 출력
//    receive(double amount) 메소드 : 수신 계좌의 잔액(balance)에 금액(amount)을 추가

//	생성자 - SavingsAccount → 소유자 : 본인이름, 잔액: 10,000원
	public SavingsAccount(double balance, String accountHolder) {
		super(10000, "박수현");
	}

//    addInterest(double rate) 메소드 : 잔액(balance)에 주어진 비율(rate, %)만큼 이자 추가
//    printf 메소드를 사용하며 이자율은 소수점 2자리까지
	@Override
	public double addInterest(double rate) {
//		setB += getBalance()* (rate / 100);
		return 0;
	}

	@Override
	public void transfer(Account target, double amount) {
		
	}

	@Override
	public void receive(double amount) {
	}
}
