package ex06_박수현;

public class AccountBasic implements Account {
//	(2) 클래스 설계
//	- 공통 필드 (private)
//	    double balance : 계좌 잔액
//	    String accountHolder : 계좌 소유자 이름
//	- 생성자
//	    생성자를 통해 필드 값을 초기화한다
//	    생성자는 단 1개만 존재하며, 이름과 잔액을 매개변수로 받음

//	필드
	private double balance;
	private String accountHolder;
	
//	생성자
	public AccountBasic(double balance, String accountHolder) {
		this.balance = balance;
		this.accountHolder = accountHolder;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public void printDetails() {
		System.out.println("계좌 소유주 : " + this.accountHolder);
		System.out.println("계좌 잔액 : " + this.balance);
	}

////	getter, setter 메소드
//	public double getBalance() {
//		return balance;
//	}
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//	
//	public String getAccountHolder() {
//		return accountHolder;
//	}
//	public void setAccountHolder(String accountHolder) {
//		this.accountHolder = accountHolder;
//	}
	
}
