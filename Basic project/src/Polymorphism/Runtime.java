package Polymorphism;

class Animal {
	void eat() {
		System.out.println("Animals Eat");
	}
}
class herbivores extends Animal {
	void eat() {
		System.out.println("Herbivores Eat Plants");
	}
}
class omnivores extends Animal {
	void eat() {
		System.out.println("Omnivores Eat Plants and meat");
	}
}
class carnivores extends Animal {
	void eat() {
		System.out.println("Carnivores Eat meat");
	}
}
public class Runtime {
	public static void main(String args[]) {
		Animal A = new Animal();
		Animal h = new herbivores(); // upcasting
		Animal o = new omnivores(); // upcasting
		Animal c = new carnivores(); // upcasting
		A.eat();//Animals Eat
		h.eat();//Herbivores Eat Plants
		o.eat();//Omnivores Eat Plants and meat
		c.eat();//Carnivores Eat meat
	}
}