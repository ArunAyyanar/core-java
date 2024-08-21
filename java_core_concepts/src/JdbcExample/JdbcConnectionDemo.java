package JdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionDemo {

	public static void main(String[] args) {

		
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB","root","arun2689");				
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from student_info");) {
			// Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");		
			
			while(rs.next()) {
				
				System.out.println(rs.getString("firstname"));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
