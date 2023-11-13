package abstractClass;

abstract class Animal {
	abstract void jump() throws RuntimeException;

	abstract void jump(int p) throws RuntimeException;
}

class Deer extends Animal {
	@Override
	void jump() { // Line n1
		System.out.println("DEER JUMPS");
	}

	@Override
	void jump(int i) {
		System.out.println("DEER JUMPS TO " + i + " FEET");
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		Animal animal = new Deer();
		((Deer) animal).jump(); // Line n2
		((Deer) animal).jump(5); // Line n3
		short x = 7, y = 200;
		System.out.println(String.valueOf(x + y).length());
	}

}
