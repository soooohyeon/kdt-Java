package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("#");
		MyThread t2 = new MyThread("*");
		
//		멀티쓰레드로 생각할 수 있지만 단일쓰레드로 실행됨
//		단순히 run() 메소드에 재정의한 코드를 실행시킨 것
//		t1.run();
//		t2.run();
//		Thread 클래스에는 start로 실행해야함
//		start() 할 때 3개의 쓰레드가 사용됨
		t1.start();
		t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
