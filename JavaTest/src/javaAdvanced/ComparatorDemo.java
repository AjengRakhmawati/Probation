package javaAdvanced;

import java.util.*;

class Dog implements Comparator<Dog>, Comparable<Dog> {
	private String name;
	private int age;
	Dog() {
	}

	Dog(String n, int a) {
		name = n;
		age = a;

	}

	public String getDogName() {
		return name;
	}

	public int getDogAge() {
		return age;
	}

	public int compareTo(Dog d) {
		return (this.name).compareTo(d.name);
	}

	public int compare(Dog d, Dog d1) {
		return d.age - d1.age;
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Dog> list = new ArrayList<Dog>();

		list.add(new Dog("Sheggy", 22));
		list.add(new Dog("Leni", 21));
		list.add(new Dog("Romi", 30));
		list.add(new Dog("Tommy", 17));
		list.add(new Dog("Tammy", 10));
		Collections.sort(list);
		System.out.println(" ");

		for (Dog a : list)

			System.out.print(a.getDogName() + " ,");
		Collections.sort(list, new Dog());
		System.out.println(" ");

		for (Dog a : list)
			System.out.print(a.getDogName() + " : " + a.getDogAge() + " ,");

	}

}
