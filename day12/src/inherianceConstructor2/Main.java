package inherianceConstructor2;

public class Main {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("KIA", "black", 1000);
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println(c1.brand);	// null
		c1.brand = "HYUNDAE";
		System.out.println(c1.brand);	// null → HYUNDAE
		System.out.println(c2.brand);	// KIA
		
		SuperCar sc1 = new SuperCar();
		SuperCar sc2 = new SuperCar("BMW", "dark blue", 150000, true);
		System.out.println(sc1);
		System.out.println(sc2);
		
		System.out.println(sc1.brand);	// null
		System.out.println(sc2.brand);	// BMW
		
	}
}
