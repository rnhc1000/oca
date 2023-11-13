package exceptions;

class Test {
	static void div(int i, int j) throws Exception {
		try {
			System.out.println(i / j);
		} catch (ArithmeticException e) {
			Exception ex = new Exception(e);
			throw ex;
		}
	}
}

public class ChallengeOne {
	public static void main(String[] args) {
		try {
			Test.div(5, 0);
		} catch (Exception e) {
			System.out.println("END");
		}
	}
}
