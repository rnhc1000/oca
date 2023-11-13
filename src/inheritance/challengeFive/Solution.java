package inheritance.challengeFive;

class Parent {
	int var = 1000; // Line n1

	int getVar() {
		System.out.println("super");
		return var;
	}
}

class Child extends Parent {
//	private int var = 2000; // Line n2

	int getVar() {
		System.out.println("var");

		return var; // Line n3
	}
}

class X {
	static void m(int i) {
		System.out.print(1);
	}

	static void m(int i1, int i2) {
		System.out.print(2);
	}

	static void m(char... args) {
		System.out.print(3);
	}

}

public class Solution {
	public class Test {
		private static void m(int i) {
			System.out.print(1);
		}

		private static void m(int i1, int i2) {
			System.out.print(2);
		}

		private static void m(char... args) {
			System.out.print(3);
		}

		public static void main(String... args) {
			m('A');
			m('A', 'B');
			m('A', 'B', 'C');
			m('A', 'B', 'C', 'D');
		}
	}

	public static void main(String[] args) {
		Child obj = new Child(); // Line n4
		System.out.println(obj.getVar()); // Line n5
		X.m('A');
		X.m('A', 'B');
		X.m('A', 'B', 'C');
		X.m('A', 'B', 'C', 'D');
		System.out.println("-----------------------------");
		String[][] arr = { { "%", "$$" }, { "***", "@@@@", "#####" } };
		for (String[] str : arr) {
			for (String s : str) {
				System.out.println(s);
				if (s.length() == 4) // Line n1
					break; // Line n2
			}
			break; // Line n3
		}
	}

}
