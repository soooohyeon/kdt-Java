package methodOverride;

public class Cat extends Animal {
//	생성자
	public Cat(String name) {
		super(name);
	}

	@Override
	void sound() {
		System.out.println(this.name + "의 야~옹~");
	}
}
