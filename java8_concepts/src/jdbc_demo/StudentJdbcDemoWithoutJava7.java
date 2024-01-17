package jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentJdbcDemoWithoutJava7 {

	public static void main(String[] args) {

		Connection con = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB", "root", "arun2689");
			Statement statement = con.createStatement();

			rs = statement.executeQuery("select * from student_info");

			while (rs.next()) {
				System.out.println("Firstname  : "+rs.getString("firstname"));
				System.out.println("Lastname   : "+rs.getString("lastname"));
				System.out.println("Department : "+rs.getString("dept"));
				System.out.println("Email      : "+rs.getString("email"));
				System.out.println("-------------------------------");
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(con!=null) {
				try {
					rs.close();
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}				
			}
		}

	}

}
