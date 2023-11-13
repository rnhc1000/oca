package inheritance.challengeSeven;

class Animal {
	Animal() {
		System.out.print("ANIMAL-");
	}
}

class Dog extends Animal {
	public Dog() {
		System.out.print("DOG");
	}
}

public class Solution {
	public static void main(String[] args) {
		new Dog();
		/**
		 * ANIMAL-DOG
		 */
	}

}
