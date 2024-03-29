package cogent.edu.Advanced.java.JDBC;

import java.sql.*;
import java.util.Scanner;

public class testJDBCFUN {

	public static void main(String[] args)throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class c = Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(c);
		
		String url = "jdbc:mysql://localhost/javademo";
		String user = "root";
		String password = "TommyTmy!12016ZXC";
		
		Connection con = null;
		//connect
		try {
			con = 	DriverManager.getConnection(url,user,password);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		System.out.println(con); //confirm connection
		
		//Create new Table
		String query = "create table if not exists funTable"
				+ "("
				+ "fun_id int primary key,"
				+ "fun_content varchar(100),"
				+ "fun_int int"
				+ ")";
		PreparedStatement stmt =  null;
		try {
			//run statement create table;
			stmt = 	con.prepareStatement(query);
			stmt.executeUpdate();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		//change to insert values query
		query = "insert into funtable values(?,?,?)";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		while(choice != 9)
		{
			try {
				//set var
				stmt = con.prepareStatement(query);
				System.out.println("Enter ID");
				int id = sc.nextInt(); sc.nextLine();
				stmt.setInt(1, id);
				System.out.println("Enter fun_content");
				String fun_content =  sc.nextLine();
				stmt.setString(2, fun_content);
				System.out.println("Enter fun_int");
				int fun_int = sc.nextInt();sc.nextLine();
				stmt.setInt(3, fun_int);
				//execute
				stmt.executeUpdate();
				//Attempt to stop loop
				System.out.println("Enter 9 to stop the loop");
				choice = sc.nextInt();sc.nextLine();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
				sc = new Scanner(System.in);
			}
			
		}
		
		//create another table with foreign key
		query = "create table if not exists funforeignTable"
				+ "("
				+ "foreign_id int primary key,"
				+ "fun_id int,"
				+ "status varchar(20),"
				+ "extra_note varchar(100),"
				+ "constraint fk_id foreign key (fun_id) references funtable(fun_id)"
				+ ")";
		try {
			stmt = con.prepareStatement(query);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		query = "select * from funTable";
		try {
			stmt = con.prepareStatement(query);
			stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		query = "select * from funforeignTable";
		try {
			stmt = con.prepareStatement(query);
			stmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
