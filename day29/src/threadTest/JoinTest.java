package threadTest;

public class JoinTest {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + " 쓰레드 종료");
		};

		Thread t1 = new Thread(r1, "t1");
		Thread t2 = new Thread(r1, "t2");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();		// t1과 t2 쓰레드 종료 후 메인 쓰레드 실행됨
			t1.join(1500);	// 파일을 실행하고 1.5초 후 메인 쓰레드 실행됨
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("main 쓰레드 종료");
	}

}
