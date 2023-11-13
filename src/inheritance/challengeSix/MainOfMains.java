package inheritance.challengeSix;

import java.util.Arrays;

class M {
	public static void main(String[] args) { // Line n1
		System.out.println("M");
	}
}

class N extends M {

//	public static void main(String[] args) { // Line n2
//		new M().main(args); // Line n3
	int a = 0;

	int getA() {
		return a;
	}
}

public class MainOfMains {
	public static void main(String[] args) {
//		N.main(args); // Line n4

		String[] arr = new String[7];
		System.out.println(Arrays.toString(arr));
//		"[null, null,...,null]"
		String[] arx = { "L", "I", "V", "E" }; // Line n1
		int i = -2;

		if (i++ == -1) { // Line n2
			arx[-(--i)] = "F"; // Line n3
		} else if (--i == -2) { // Line n4
			arx[-++i] = "O"; // Line n5
		}

		for (String s : arx) {
			System.out.print(s);
		}
	}
}
