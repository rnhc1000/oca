package interfaces;

//interface Moveable {
//	void move();
//}
//
//abstract class Animal {
//	void move() {
//		System.out.println("ANIMAL MOVING");
//	}
//}
//
//class Dog extends Animal implements Moveable {
////
////	@Override
////	public void move() {
////		// TODO Auto-generated method stub
////
////	}
//}
//
//public class ChallengeTwo {
//	public static void main(String[] args) {
//		Moveable moveable = new Dog();
//		moveable.move();
//	}

//}
interface ILog {
	default void log() {
		System.out.println("ILog");
	}
}

abstract class Log {
	public static void log() {
		System.out.println("Log");
	}
}

class MyLogger extends Log implements ILog {
}
