package challengeOne;

import java.util.ArrayList;
import java.util.List;

class MWC {

	public MWC() {
	}

	public ArrayList<Character> Crowd(String crowd) {

		List<String> list = new ArrayList<>();

		int countM = 0, countW = 0, countC = 0;
		ArrayList<Character> people = new ArrayList<>();
		char[] c = crowd.toCharArray();
		for (char s : c) {

			switch (s) {

			case 'M':
				countM += 1;
				break;

			case 'W':
				countW += 1;
				break;

			case 'C':
				countC += 1;
				break;

			}

			// System.out.print(s + " ");
		}

		// System.out.println(countM + "M" + countW + "W" + countC + "C");
		/**
		 * If you add '0' with int variable, it will return actual value in the char
		 * variable. The ASCII value of '0' is 48. So, if you add 1 with 48, it becomes
		 * 49 which is equal to 1. The ASCII character of 49 is 1.
		 */
		people.add((char) (countM + '0'));
		people.add('M');
		people.add((char) (countW + '0'));
		people.add('W');

		if (countC == 0) {

			return people;

		} else {
			people.add((char) (countC + '0'));
			people.add('C');
		}
		return people;

	}
}

public class Program {

	public static void main(String[] args) {
		String s = "MMWWCMMMCWWW";
		MWC str = new MWC();
		ArrayList<Character> rsp = new ArrayList<>();
		rsp = str.Crowd(s);
		for (char x : rsp) {
			System.out.print(String.valueOf(x));
		}
	}

}
