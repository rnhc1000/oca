package SQL;

import java.io.IOException;
import java.sql.SQLException;

public class challengeOne {

	public static void main(String[] args) {
		try {
			save();
			log();

		} catch (SQLException | IOException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static void save() throws IOException {
	}

	private static void log() throws SQLException {
	}
}
