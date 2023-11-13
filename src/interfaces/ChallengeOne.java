package interfaces;

interface Profitable1 {
	default double profit() {
		return 12.5;
	}
}

//Profitable2.java

interface Profitable2 {
	default double profit() {
		return 25.5;
	}
}

//Profit.java

abstract class Profit implements Profitable1, Profitable2 {

	public double profit() {
//		return Profitable1.super.profit();
//		return Profitable2.super.profit();
		return 100.0;
	}

}

class A {
	@Override
	public String toString() {
		return null;
	}
}

public class ChallengeOne extends Profit {

	public static void main(String[] args) {

		ChallengeOne c = new ChallengeOne();

		System.out.println(c.profit());
		/**
		 * 100.0
		 */
		String text = null;
		text = text + new A(); // Line n1
		System.out.println(text.length()); // Line n2
	}
}
