package variables;

class Test {
	static int i1 = 10;
	int i2 = 20;

	public Test() {
	}

	public Test(int i1, int i2) {
		this.i1 = i1;
		this.i2 = i2;
		add();
	}

	int add() {
		return this.i1 + this.i2; // Line n1
	}

	@Override
	public String toString() {
		return "[ " + i1 + "+" + i2 + " ]" + " = " + add();
	}
}

public class InstanceVsClassVariables {
	public static void main(String[] args) {
		System.out.println(new Test()); // Line n2
	}

}
