package review03;

public class CheckingAccount extends Account {
//	생성자
	public CheckingAccount(double balance) {
		super(balance);
	}
	
//	메소드
	@Override
	void withdraw(double amount) {
		double totalAmount = amount + 1000;
		if (balance < totalAmount) {
			System.out.println("잔액부족! 출금 실패");
		} else {
			balance -= amount;
			System.out.println("출금 : " + amount + ", 수수료 : 1000, 잔액 : " + this.balance);
		}
	}
}
