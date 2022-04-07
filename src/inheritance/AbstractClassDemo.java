package inheritance;

abstract class Animal{
	protected int legs = 4;
	abstract void sound();
	protected void classInfo(String type) {
		System.out.println("This is the method of parent  ");
		System.out.println("I belongs to " + type + "family");
		System.out.println("has " +  legs + "legs ");
		
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("barking.............");
	}
}

class Lion extends Animal{
	void sound() {
		System.out.println("Roars.............");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println("meow.............");
	}
}

class Tiger extends Animal{
	void sound() {
		System.out.println("Roaresss.............");
	}
}

public class AbstractClassDemo {
	public static void main(String[] args) {
		Dog tuffy = new Dog();
		Lion lio = new Lion();
		Cat mili = new Cat();
		Tiger sam = new Tiger();
		
		
		tuffy.sound();
		lio.sound();
		mili.sound();
		sam.sound();
		
		tuffy.classInfo("Dog");
		lio.classInfo("Lion");
		mili.classInfo("Cat");
		sam.classInfo("Tiger");

	}

}
