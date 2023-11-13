package stringDealer;

import java.util.ArrayList;
import java.util.List;

public class ListOfStringBuilder {
	public static void main(String[] args) {
		List<StringBuilder> list = new ArrayList<>();
		list.add(new StringBuilder("AAA")); // Line n1
		list.add(new StringBuilder("BBB")); // Line n2
		list.add(new StringBuilder("AAA")); // Line n3

		boolean a = list.removeIf(sb -> sb.equals(new StringBuilder("AAA"))); // Line n4
		System.out.println(a);
		System.out.println(list);
		List<String> listOne = new ArrayList<>();
		listOne.add("AAA"); // Line n1
		listOne.add("BBB"); // Line n2
		listOne.add("AAA"); // Line n3

		boolean b = listOne.removeIf(sb -> sb.equals("AAA")); // Line n4
		System.out.println(listOne);
		System.out.println(b);
	}

}
