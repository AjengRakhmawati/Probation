package javatestpackage;

class Animal{
	public void soundAnimal() {
		System.out.println("Sounds of animal");
	}
}

class Dog extends Animal{
	public void soundAnimal() {
		System.out.println("guk guk!!");
	}
}

class Cat extends Animal{
	public void soundAnimal() {
		System.out.println("meong!!!");
	}
}

class MainClass{
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		System.out.print("Dog is ");
		myDog.soundAnimal();
	}
	
}
