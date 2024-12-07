package task3;

public class CheckingAccount extends Account{
//	CheckingAccount 클래스
//	메소드
//	   withdraw()를 오버라이딩하여 추가로 1000원을 수수료로 부과
//	** 로직
//	1) Account 클래스 상속
//	2) 메소드 오버라이딩	if (잔액 < 출금액) { "출금 실패" 출력, 잔액 그대로 리턴 }
//	3)					else { 잔액 - (출금액+1000) 결과값 리턴 }

//	생성자
	public CheckingAccount(int balance) {
		super(balance);
	}
	
	@Override
	double withdraw(double amount) {
		if (this.balance < amount) {
			System.out.println("출금 실패!");
		} else {
			this.balance -= (amount + 1000);
		}
		return this.balance;
	}
}
