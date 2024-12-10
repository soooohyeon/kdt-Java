package access01;

import section10.AccessTest01;

//예제 12.
public class AccessTest02 {
	public static void main(String[] args) {
//		접근제한자 public은 다른 패키지에서도 접근 가능하나 다른 패키지이기 때문에 import가 필요함
		AccessTest01 a = new AccessTest01(10);
		
//		접근제한자가 public이기 때문에 메소드 또한 접근 가능
		a.printA();
	}
}
