package inheritance.challengeFour;

interface Sellable {
	double getPrice();

	default String symbol() {
		return "$";
	}
}

class Chair implements Sellable {
	public double getPrice() {
		return 35;
	}

	public String symbol() {
		return "£";
	}
}

class Square {
	int length;
	Square sq;

	Square(int length) {
		this.length = length;
	}

	void setInner(Square sq) {
		this.sq = sq;
	}

	int getLength() {
		return this.length;
	}
}

public class Solution {
	public static void main(String[] args) {
		Sellable obj = new Chair(); // Line n1
		System.out.println(obj.symbol() + obj.getPrice()); // Line n2
		Square sq1 = new Square(10); // Line n1
		Square sq2 = new Square(5); // Line n2
		sq1.setInner(sq2); // Line n3
		System.out.println(sq1.sq.length); // Line n4
	}

}
