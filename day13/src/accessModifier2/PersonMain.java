package accessModifier2;

import accessModifier.Person;
//1. private 접근제한자
public class PersonMain {
	public static void main(String[] args) {
		Person p2 = new Person();
//		p2.	// 작성을 안했기 때문에 접근제한자 default로 다른 패키지에서 접근 불가로 오류 발생
		
//		setter와 getter 메소드를 통해 필드에 접근
		p2.setName("김철수");
		System.out.println(p2.getName());
	}
}
