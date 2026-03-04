package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) {
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/practise","root","ankit123");
			Statement st=con.createStatement();
			String query="select * from student";
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.println("ID : "+rs.getInt(1)+" Name : "+rs.getString(2)+" Gmail : "+rs.getString(3));
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
 }

}
