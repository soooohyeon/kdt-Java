package ex06_박수현;

public class CheckingAccount extends AccountBasic implements AdvanceAccount {
//	- CheckingAccount 클래스
//    AdvanceAccount 인터페이스 구현
//    addInterest(double rate) 메소드 : 잔액(balance)에 주어진 비율(rate, %)만큼 이자 추가
//                    printf 메소드를 사용하며 이자율은 소수점 2자리까지
//    transfer(Account target, double amount) 메소드 : 잔액이 충분한 경우 송금 처리 수행
//                    잔액이 부족하면 "송금 실패, 이유 : 잔액 부족" 메시지 출력
//    receive(double amount) 메소드 : 수신 계좌의 잔액(balance)에 금액(amount)을 추가

//	생성자 - SavingsAccount → 소유자 : 본인이름, 잔액: 10,000원
	public CheckingAccount() {
		super(20000, "짱구");
	}

//	상속받은 AccountBasic 클래스의 메소드 오버라이딩
	@Override
	public void printDetails() {
		System.out.print("체크 계좌 - ");
		super.printDetails();
	}

//    addInterest(double rate) 메소드 : 잔액(balance)에 주어진 비율(rate, %)만큼 이자 추가
//    printf 메소드를 사용하며 이자율은 소수점 2자리까지
	@Override
	public void addInterest(double rate) {
		 double rateMoney = getBalance() * (rate / 100);
		 setBalance(rateMoney + getBalance());
		 System.out.printf("이자율 : %.2f%%, 추가된 이자 : %.2f원, 새로운 잔액 : %.2f원\n", rate, rateMoney, getBalance());
	}

//  transfer(Account target, double amount) 메소드 : 잔액이 충분한 경우 송금 처리 수행
//                  잔액이 부족하면 "송금 실패, 이유 : 잔액 부족" 메시지 출력
	@Override
	public void transfer(Account target, double amount) {
		if (getBalance() >= amount) {
			setBalance(getBalance()-amount);
			System.out.printf("송금된 금액 : %.2f원, 남은 잔액 : %.2f원\n", amount, getBalance());
		} else {
			System.out.println("송금 실패, 이유 : 잔액 부족");
		}
		target.printDetails();
	}

//  receive(double amount) 메소드 : 수신 계좌의 잔액(balance)에 금액(amount)을 추가
	@Override
	public void receive(double amount) {
		setBalance(getBalance() + amount);
		System.out.printf("예금 계좌 - 수신된 금액 : %.2f원, 새로운 잔액 : %.2f원\n", amount, getBalance());
	}
}
