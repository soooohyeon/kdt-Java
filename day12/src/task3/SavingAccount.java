package task3;

public class SavingAccount extends Account{
//	SavingsAccount 클래스
//	메소드 
//	   withdraw()를 오버라이딩하여 출금 시 잔액이 부족하면 "출금 실패!" 출력
//	** 로직
//	1) Account 클래스 상속
//	2) 메소드 오버라이딩	if (잔액 < 출금액) { "출금 실패" 출력, 잔액 그대로 리턴 }
//	3)					else { 잔액 - 출금액 결과값 리턴 }
	
//	생성자
	public SavingAccount(int balance) {
		super(balance);
	}
	
	@Override
	double withdraw(double amount) {
		if (this.balance < amount) {
			System.out.println("출금 실패!");
		} else {
			this.balance -= amount;
		}
		return this.balance;
	}
}
