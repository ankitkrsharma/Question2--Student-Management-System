package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbc {
	public static void main(String[] args) {
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/practise","root","ankit123");
			Statement st=con.createStatement();
			
			
			
			
			String query="CREATE TABLE IF NOT EXISTS teacher (id INT PRIMARY KEY AUTO_INCREMENT,name VARCHAR(50),gmail VARCHAR(100))";
			
			
           // st.executeUpdate(query);
            
            
            
            String insert = "INSERT INTO teacher (id, name, gmail) VALUES (1, 'Sam','sam@23'),(2, 'Vik', 'vik@34'),(3, 'Avatar','ava@34')";
            
            
          //  st.executeUpdate(insert);
            
            
            
            
            
           
           
			
			ResultSet rs=st.executeQuery("Select * from teacher");
			while(rs.next()) {
				System.out.println("ID : "+rs.getInt(1)+" Name : "+rs.getString(2)+" Gmail : "+rs.getString(3));
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
 }

}
