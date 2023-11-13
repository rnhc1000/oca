package classesandobjects;

class M {
	public void printName() {
		System.out.println("M");
	}
}

class N extends M {
	@Override
	public void printName() {
		System.out.println("N");
	}
}

public class ExtendingClasses {

	public static void main(String[] args) {
		M obj1 = new M();
		M obj2 = new N();

//		N obj3 = (N) obj1;
		obj1.printName();
		obj2.printName();
	}

}
