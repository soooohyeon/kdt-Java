package ex06_박수현;

public interface AdvanceAccount extends Account {
//	- AdvanceAccount 인터페이스
//    Account를 상속받아 아래 메소드 추가
//    addInterest(double rate) 메소드 : 잔액(balance)에 주어진 비율(rate, %)만큼 이자 추가
//        이자율 계산공식 : balance += balance * (rate / 100)
//    transfer(Account target, double amount) 메소드 : 다른 계좌로 금액(amount) 송금
//    receive(double amount) 메소드 : 다른 계좌에서 송금된 금액을 수신 계좌이 잔액(blance)에 추가
	
//	추상 메소드
	void addInterest(double rate);
	void transfer(Account target, double amount);
	void receive(double amount);
}
