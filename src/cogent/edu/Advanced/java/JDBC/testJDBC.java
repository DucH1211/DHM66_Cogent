package cogent.edu.Advanced.java.JDBC;
import java.sql.*;
import java.util.Scanner;
public class testJDBC {
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Class c = Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(c);
		String url = "jdbc:mysql://localhost/funbanking";
		String user = "root";
		String password ="TommyTmy!12016ZXC";
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("Connection: " + con);
		Statement stmt = con.createStatement();
		String query = "create database if not exists javademo" ; //query have to be in a String
		stmt.executeUpdate(query);
		query = "create table if not exists employeeJava(id int primary key, name varchar(20), email varchar(50))";
		stmt.executeUpdate(query);
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(count <= 5) {
			
			System.out.println("Enter ID:");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name");
			String name = sc.nextLine();
			System.out.println("Enter Email");
			String email = sc.nextLine();
			query = "insert into employeejava values("+ id +",'"+ name +"','"+ email +"')";
			stmt.executeUpdate(query);
			count ++;
		}
	}
}
