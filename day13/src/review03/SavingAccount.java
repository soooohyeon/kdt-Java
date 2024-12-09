package review03;

public class SavingAccount extends Account {
//	SavingsAccount 클래스
//	메소드 
//	   withdraw()를 오버라이딩하여 출금 시 잔액이 부족하면 "출금 실패!" 출력
	
//	생성자
	public SavingAccount(double balance) {
		super(balance);
	}
	
//	메소드 → 오버라이딩 필요없음, 어차피 같기 때문에
//	@Override
//	void withdraw(double amount) {
//		super.withdraw(amount);
//	}
}
