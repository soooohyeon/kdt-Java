package accessModifier;
//1. private 접근제한자
public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.name = "신짱구";	// 접근제한자 defaul로 접근 가능
//		p1.age = 5;			// 접근제한자 defaul로 접근 가능
//		setter와 getter 메소드를 통해 필드에 접근
		p1.setName("신짱구");
		System.out.println(p1.getName());
	}
}