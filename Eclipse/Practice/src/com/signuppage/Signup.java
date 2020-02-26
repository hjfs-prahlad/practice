package com.signuppage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Signup")
public class Signup extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		String fnameDB = request.getParameter("fname");
		String lnameDB = request.getParameter("lname");
		String passDB = request.getParameter("pass");
		String genderDB = request.getParameter("fgender");
		String dobDB = request.getParameter("fdob");
		insertDB(fnameDB,lnameDB,passDB,genderDB,dobDB);
		response.getWriter().println("User Saved!");
	}

	public void insertDB(String fnameDB, String lnameDB, String passDB, String genderDB, String dobDB)
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "tiger");
			Statement statement = connection.createStatement();
			int status = statement.executeUpdate("insert into SIGNUP values ('" + fnameDB + "','" + lnameDB + "','" + passDB + "','" + genderDB + "','" + dobDB + "')");
			if (status == 1) {
				System.out.println("Record Inserted!");
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
