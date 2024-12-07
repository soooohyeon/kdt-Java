package accessTest2;

import accessTest1.Parent;

public class Child extends Parent {
//	다른 패키지 클래스를 상속 받으려면 import 해주면 상속 가능 (해당 부모 클래스가 public일 때)
	public void printAccess() {
		System.out.println(publicValue);
		System.out.println(protectedValue);
//		System.out.println(defaultValue);	// 다른 패키지에서 접근 불가
//		System.out.println(privateValue);	// 다른 패키지에서 접근 불가
	}
}
