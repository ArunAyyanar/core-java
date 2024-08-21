package JdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreJdbcConnection {

	public static void main(String[] args) {

		try(Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/studentdb","arun","arun2689");
			Statement stmt = con.createStatement();
			ResultSet rs =stmt.executeQuery("SELECT * FROM studentschema.student_information");
				) {
			Class.forName("org.postgresql.Driver");
			
			while(rs.next()) {
				
				System.out.println("Name : "+rs.getString("name"));
				System.out.println("Rollno : "+rs.getString("rollno"));
			}
			
		} catch (ClassNotFoundException | SQLException ex) {
				ex.printStackTrace();
		}

	}

}
