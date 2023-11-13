package files;

import java.io.FileNotFoundException;

/**
 * check the names.length and tthe iteration range can not be less or equal just
 * less... when ok prints NOT FOUND
 */
class Test {
	static String[] names = { "Williamson.pdf", "Finch.pdf", "Kohli.pdf", "Morgan.pdf" };

	public static boolean search(String name) throws FileNotFoundException {
		for (int i = 0; i <= 4; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return true;
			}
		}
		throw new FileNotFoundException();
	}
}

public class ChallengeOne {
	public static void main(String[] args) {
		try {
			if (Test.search("virat.pdf"))
				System.out.println("FOUND");

		} catch (FileNotFoundException ex) {
			System.out.println("NOT FOUND");
		}
	}

}
