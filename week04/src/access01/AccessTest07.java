package access01;

import section10.AccessTest06;

//예제 17.
//예제 16. 번인 section10 패키지 AccessTest06 파일 참고
public class AccessTest07 extends AccessTest06 {	// AccessTest06 클래스 상속 받기
	void accessTest() {	// 명시하지 않았기 때문에 접근제한자 default
		super.accessProtected();	// 접근제한자 protected는 다른 패키지에서는 접근이 불가하나 상속받은 클래스라면 부모 참조값의 키워드인 super를 통해 접근이 가능함
		AccessTest06 a = new AccessTest06();	// 인스턴스화 - 클래스 자체는 public이기 때문에 객체화 가능, 다른 패키지기 때문에 import 해줘야함
//		a.accessProtected();	// 오류 발생		// 객체로는 접근 불가능
	}
}
