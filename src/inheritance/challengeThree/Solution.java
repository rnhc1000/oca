package inheritance.challengeThree;

class Lock {
	public void open() {
		System.out.println("LOCK-OPEN");
	}
}

class Padlock extends Lock {
	public void open() {
		super.open();
		System.out.println("PADLOCK-OPEN");
	}
}

class DigitalPadlock extends Padlock {
	public void open() {
		super.open();
		System.out.println("DIGITALPADLOCK-OPEN");
	}
}

public class Solution {

	public static void main(String[] args) {

//		Lock lock = new Padlock();
//		lock.open();
		Lock lock = new DigitalPadlock();
		lock.open();
	}
}
