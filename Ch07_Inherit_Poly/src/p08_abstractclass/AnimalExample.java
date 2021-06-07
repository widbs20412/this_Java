package p08_abstractclass;

public class AnimalExample {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		Cat c = new Cat();
		c.sound();
		animalSound(d);
		animalSound(c);

		// PolyMorphism1
		Animal a = null;
		a = new Dog();
		a.sound();
		a = new Cat();
		a.sound();

		// PolyMorphism2
		Animal a2 = new Cat();
		Cat d2 = (Cat) a2;
		Animal a3 = new Cat();
		Cat c2 = (Cat) a3;

	}

	// Abstract class 다형성 : Parameter 다형성
	public static void animalSound(Animal a) {
		a.sound();
	}

}
