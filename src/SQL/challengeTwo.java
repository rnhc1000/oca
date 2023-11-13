package SQL;

import java.sql.SQLException;

class Test {
	static void checkData() throws SQLException {
		try {
//			throw new SQLException();
			System.err.println("OK");
		} catch (Exception e) {
			e = null; // Line 10
//			throw e; // Line 11
			System.out.println("Done!");
		}
	}
}

public class challengeTwo {
	public static void main(String[] args) {
		try {
			Test.checkData(); // Line 17
		} catch (SQLException e) {
			System.out.println("NOT AVAILABLE");
		} finally {
			System.out.println("Done again!");
		}
	}
}
