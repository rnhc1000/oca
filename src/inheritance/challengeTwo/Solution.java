package inheritance.challengeTwo;

interface Profitable {
	static final double profitPercentage = 42.0;
	double x = 50.0;
}

class Business implements Profitable {
	double profitPercentage = 50.0; // Line n1
}

public class Solution {
	public static void main(String[] args) {
		Profitable obj = new Business(); // Line n2
		System.out.println(obj.profitPercentage); // Line n3
		System.out.println(Profitable.profitPercentage);
		System.out.println(Profitable.x);
		/**
		 * variables defined in the interface are static and final... No need to
		 * instantiate...
		 */

	}

}
