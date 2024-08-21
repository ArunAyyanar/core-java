package JdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRecall3 {

	public static void main(String[] args) {

		Connection con = null;

		Statement stmt = null;

		ResultSet rs = null;

		try {
			// Load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// get the connection using server host,username and password
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB", "root", "arun2689");

			// create the statement to process sql statement
			stmt = con.createStatement();

			// execute the statement and get the resultsets
			rs = stmt.executeQuery("select * from student_info");

			// process the results set
			while (rs.next()) {
				System.out.println("First name :: " + rs.getString("firstname"));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
