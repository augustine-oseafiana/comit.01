 package com.comit.course_25_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.comit.course_25_jdbc.bean.User;

public class _5_jdbcPrStUpdate {

	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://localhost:3306/usersdb";
		String dbUsername = "root";
		String dbPassword = "Dubblin080@";
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		String sql = "UPDATE user SET USERNAME = ?, PASSWORD = ?, FIRST_NAME = ?, "
				+ "LAST_NAME = ?, BIRTH = ?, STATUS = ? WHERE ID_USER = ?";
		
		User user = new User();
		
		try(Scanner scan = new Scanner(System.in);) {
			
			System.out.print("Enter idUser: ");
			user.setIdUser(scan.nextInt());			
			scan.nextLine();
			
			System.out.print("Enter the username: ");
			user.setUsername(scan.nextLine());
			
			System.out.print("Enter the password: ");
			user.setPassword(scan.nextLine());
			
			System.out.print("Enter the first name: ");
			user.setFirstName(scan.nextLine());
			
			System.out.print("Enter the last name: ");
			user.setLastName(scan.nextLine());
			
			System.out.print("Enter the date of birth (yyyy-MM-dd): ");
			user.setBirth(formatter.parse(scan.nextLine()));
			
			System.out.print("Enter the last status: ");
			user.setStatus(scan.nextLine());
		
		} catch (ParseException e) {
			System.err.format("Error while passing date %s%n%n", e.getMessage());
			System.exit(-1);
		}
		
		   System.out.println("Query: " + sql);
	    
		try(Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
				
			PreparedStatement st = con.prepareStatement(sql);) {
			
			st.setString(1, user.getUsername());
			st.setString(2, user.getPassword());
			st.setString(3, user.getFirstName());
			st.setString(4, user.getLastName());
			st.setDate  (5, new Date(user.getBirth().getTime()));
			st.setString(6, user.getStatus());
			st.setInt(7, user.getIdUser());
			
		     int row = st.executeUpdate();
		     
		     if (row >= 1) {		    	 
		    	 System.out.println("Number of rows affected: + row");
		     } else {
		    	 System.out.println("user not found, idUser:" + user.getIdUser());
		     }
		     
			
			
			

		} catch (SQLException e) {
			System.err.format("SQL State %s%n%s%n", e.getSQLState(), e.getMessage());		
		} 
		
		System.out.println(user);
		
	}
}
