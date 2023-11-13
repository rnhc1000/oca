package arguments;

class Car {
	void speed(Byte val) {
		System.out.println("DARK");
	}

	void speed(byte... vals) {
		System.out.println("LIGHT");
	}
}

public class CarArguments {
	public static void main(String[] args) {
		byte b = 10;
		byte c = 11;
		byte d = 12;
		new Car().speed(b);
		new Car().speed(b, c, d);
	}

}
