package review03;

public class Account {
//	Account 클래스
//	필드
//	   balance
//	메소드
//	   deposit(double amount) : 금액을 추가
//	   withdraw(double amount) : 금액을 차감

//	필드
	double balance;
	
//	생성자
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
//	메소드
	void deposit(double amount) {
		balance += amount;
		System.out.println("입금 : " + amount + ", 잔액 : " + balance);
	}
	void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("출금 : " + amount + ", 잔액 : " + balance);
		} else {
			System.out.println("잔액 부족");
		}
	}
}
