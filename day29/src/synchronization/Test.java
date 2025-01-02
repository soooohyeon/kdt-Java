package synchronization;

import java.util.Iterator;

public class Test implements Runnable {
//	필드
	private int number;
	
//	생성자
	public Test() {
	super();
	this.number = 10;
}

	@Override
//	synchronized 붙여주게되면 쓰레드 실행시 싱글 쓰레드처럼 작동됨
	public /* synchronized */ void run() {	// run() 메소드에 동기화 처리하면 싱글 쓰레드로 작동함
		for (int i = 0; i < 5; i++) {
			sub(1);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
//	메소드
//	public void sub(int number) {
//		String name = Thread.currentThread().getName();
//		this.number -= number;
//		System.out.println(name + " : - " + number);
//		System.out.println("현재 number : " + this.number);
//	}

//	public synchronized void sub (int number) {		// 동기화 처리시 멀티 쓰레드로 작동됨
//		String name = Thread.currentThread().getName();
//		this.number -= number;
//		System.out.println(name + " : - " + number);
//		System.out.println("현재 number : " + this.number);
//	}
	
	public void sub(int number) {
		String name = Thread.currentThread().getName();
		synchronized(this) {
			this.number -= number;	// 8,8, 6,6, 4,4 ,...	⇢ 쓰레드-1 실행 처리가 빨라 결과만 8, 6, ...으로 보여줌
		}
		System.out.println(name + " : - " + number);
		System.out.println("현재 number : " + this.number);
	}
	
	
	
}
