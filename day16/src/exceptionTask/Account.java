package exceptionTask;

public class Account {
//	은행계좌 클래스(Account)
//	필드 : 잔고 balance private
//	생성자 : 기본생서자 추가
//	출금메소드 : withdraw 매개변수 1개
//	  잔액보다 출금금액이 크다면 출금불가 예외처리/현재 잔고는 _원입니다. 출금금액의 _원이 부족하여 출금이 불가능합니다 출력
//	입금메소드 : deposit 매개변수 1개
//	잔액에 입금된 금액 추가후 입금된 금액은 _원입니다. 현재 잔고는 _원입니다.
	
//	필드
	private int balance;

//	기본 생성자
	public Account() {
		this.balance = 10000;
	}
	
//	출금 메소드 - 강제 예외 발생시킨 후 예외 던지기
	void withdraw (int amount) throws AccountException  {
		if (this.balance < amount) {
//			매개변수 있는 생성자로 생성하여 예외처리 문구를 매개변수로 전달
			throw new AccountException("출금 불가\n현재 잔고는 " + this.balance + "원 입니다.");
		} else {
			this.balance -= amount;
			System.out.println("출금된 금액은 " + amount + "원입니다. 현재 잔고는 " + this.balance + "원입니다.");
		}
	}
//	입금 메소드
	void deposit (int amount) {
		this.balance += amount;
		System.out.println("입금된 금액은 " + amount + "원입니다. 현재 잔고는 " + this.balance + "원입니다.");
	}

//	getter, setter 메소드 생성
	public double getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
