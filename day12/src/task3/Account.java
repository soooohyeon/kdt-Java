package task3;

public class Account {
//	3) 잔액확인 프로그램
//	Account 클래스
//	필드
//	   balance
//	메소드
//	   deposit(double amount) : 금액을 추가
//	   withdraw(double amount) : 금액을 차감
//
//	SavingsAccount와 CheckingAccount 클래스는 Account 클래스 상속
//	- SavingsAccount 클래스
//		메소드 
//		   withdraw()를 오버라이딩하여 출금 시 잔액이 부족하면 "출금 실패!" 출력
//
//	-CheckingAccount 클래스
//		메소드
//		   withdraw()를 오버라이딩하여 추가로 1000원을 수수료로 부과
//
//	메인 메소드에서 두 클래스의 객체를 생성하고 입출금을 수행결과 출력
	
//	필드
	double balance;

//	생성자
	public Account() {
		
	}
	
	public Account(int balance) {
		super();
		this.balance = balance;
	}

//	메소드 1 : 금액 추가
	double deposit (double amount) {
		this.balance += amount;
		return this.balance;
	}
	
//	메소드 2 : 금액 차감
	double withdraw(double amount) {
		if (this.balance < amount) {
			System.out.println("출금 실패!");
		} else {
			this.balance -= amount;
		}
		return this.balance;
	}
	
//	메인 메소드
	public static void main(String[] args) {
		SavingAccount savingAc = new SavingAccount(10000);
		CheckingAccount checkingAc = new CheckingAccount(20000);

		System.out.println("현재 계좌1 잔액 : " + savingAc.balance + "원");
		savingAc.deposit(12000);
		System.out.println("현재 계좌1 잔액 : " + savingAc.balance + "원");
		savingAc.withdraw(150000);
		System.out.println("현재 계좌1 잔액 : " + savingAc.balance + "원\n");
		
		System.out.println("현재 계좌2 잔액 : " + checkingAc.balance + "원");
		checkingAc.deposit(12000);
		System.out.println("현재 계좌2 잔액 : " + checkingAc.balance + "원");
		checkingAc.withdraw(10000);
		System.out.println("현재 계좌2 잔액 : " + checkingAc.balance + "원");
	}
}
