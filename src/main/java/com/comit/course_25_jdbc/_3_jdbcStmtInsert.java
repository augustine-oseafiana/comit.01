 package com.comit.course_25_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.comit.course_25_jdbc.bean.User;

public class _3_jdbcStmtInsert {

	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://localhost:3306/usersdb";
		String dbUsername = "root";
		String dbPassword = "Dubblin080@";
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		String sql = "INSERT INTO user(USERNAME, PASSWORD, FIRST_NAME, LAST_NAME, BIRTH, STATUS) VALUES ";
						
		
		User user = new User();
		
		try(Scanner scan = new Scanner(System.in);) {
			
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
			System.err.format("Error while passing date %s%n", e.getMessage());	
		}
		
	    sql = sql + "('" + user.getUsername() + "','" + user.getPassword() + "','" + user.getFirstName() + "','" +
	          user.getLastName() + "','" + formatter.format(user.getBirth()) + "','" + user.getStatus() + ")'"; 
	    
	    System.out.println("Query:" + sql);
	    
		try(Connection con = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
			Statement st = con.createStatement(); ) {
			
		     int row = st.executeUpdate(sql);

			System.out.println("Number of rows affected: + row");

		} catch (SQLException e) {
			System.err.format("SQL State %s%n%s", e.getSQLState(), e.getMessage());		
		} 
		
		System.out.println(user);
		
	}
}
