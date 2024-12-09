package casting3;
//7. 캐스팅 특징
public class Cat extends Animal {
//	메소드 오버라이딩
	@Override
	void crying() {
		System.out.println("야옹");
	}
	
//	생성자	
	public Cat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
}
