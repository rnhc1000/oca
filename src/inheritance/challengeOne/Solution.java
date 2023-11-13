package inheritance.challengeOne;

import java.io.IOException;

class Parent {
	Parent() throws IOException {
		System.out.print("HAKUNA");
	}
}

class Child extends Parent {
	Child() throws Exception {
		System.out.println("MATATA");
	}
}

public class Solution {
	public static void main(String[] args) throws Exception {
		new Child();
		/**
		 * HAKUNAMATATA
		 */

	}

}
