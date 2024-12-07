package accessTest1;

public class Parent {
//	필드
//	접근제한자 타입 변수
	public String publicValue = "public";
	protected String protectedValue = "protected";
	String defaultValue = "default";
	private String privateValue = "private";
	
//	메소드
//	접근제한자 리턴타입 메소드명 (매개변수){}
	public void printAccess() {
		System.out.println("----같은 클래스 내에서 출력----");
		System.out.println(publicValue);
		System.out.println(protectedValue);
		System.out.println(defaultValue);
		System.out.println(privateValue);
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();	// static 메소드가 아니기 때문에 객체 생성해줌
		p.printAccess();
	}
}

class SamePackage {
//	public static void main(String[] args) { // 클래스 안에 메인메소드 2개는 실행 안됨 (위에것 실행됨)
	public void printAccess() {
		Parent p = new Parent();
		System.out.println(p.defaultValue);
		System.out.println(p.publicValue);
		System.out.println(p.protectedValue);
//      System.out.println(p.privateValue); 
//      다른 클래스에서 private접근제한자의 필드 접근 불가

	}
}