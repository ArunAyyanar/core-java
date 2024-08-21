package JdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRecall {

	public static void main(String[] args) {

		// Load the driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Get the connection by host, user name and password

			// create a statement

			// execute the query using statement and get in result set
			try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB", "root",
					"arun2689");
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery("select * from student_info");) {
				while (rs.next()) {

					System.out.println("First name :: " + rs.getString("firstname"));

				}

			}

		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
		}

	}

}
