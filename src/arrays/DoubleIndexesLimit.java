package arrays;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

//And below combination of x and y values:
//
//1. x = 6, y = 6
//
//2. x = 2, y = 5
//
//3. x = 4, y = 7
//
//4. x = 7, y = 7
//
//5. x = 8, y = 8
//
//6. x = 0, y = 0
//
//7. x = -1, y = -1

public class DoubleIndexesLimit {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(6, 6);
		map.put(2, 5);
		map.put(4, 7);
		map.put(7, 7);
		map.put(8, 8);
		map.put(0, 0);

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer k = entry.getKey();
			Integer v = entry.getValue();
			int[][] arr = new int[k][v];
			try {

				arr[1][4] = 100;
				arr[6][6] = 200;
				arr[3][6] = 300;

			} catch (ArrayIndexOutOfBoundsException ex) {

				System.out.println("error: indexes " + k + "," + v + " out of bounds");
			}
		}
		LocalDate date = LocalDate.parse("1983-06-30");
		System.out.println(date.plusMonths(8));

	}
}
