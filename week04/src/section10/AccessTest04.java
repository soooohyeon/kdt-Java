package section10;

// 예제 14.
public class AccessTest04 {
//	클래스의 접근제한자가 default이기 때문에 같은 패키지 내에서는 접근 가능으로 객체 생성 가능
	AccessTest03 a = new AccessTest03();
	
//	메소드는 접근제한자를 명시하지 않았기 때문에 default
	void methodA() {
		a.variableC = 20;	// 변수도 접근 가능
	}
}
