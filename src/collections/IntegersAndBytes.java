package collections;

import java.util.ArrayList;
import java.util.List;

public class IntegersAndBytes {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
//		byte b = 10;// compiler error bytes vs Integer
		int b = 10;
		list.add(b);
		int mul = list.get(0) * list.get(0); // Line n2
		System.out.println(mul);
	}
}
