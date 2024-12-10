package access01;

import section10.AccessTest06;

//예제 18.
//예제 16. 번인 section10 패키지 AccessTest06 파일 참고
public class AccessTest08 {
	void accessTest() {
		AccessTest06 a = new AccessTest06();	// 인스턴스화 - 클래스 자체는 public이기 때문에 객체화 가능, 다른 패키지기 때문에 import 해줘야함
//		a.accessProtected();	// 오류 발생		// 객체로는 접근 불가능
//		해당 accessProtected() 메소드는 접근제한자가 protected로 같은 패키지 내 이거나 또는 상속을 받은 클래스여야지 접근 가능
	}
}
