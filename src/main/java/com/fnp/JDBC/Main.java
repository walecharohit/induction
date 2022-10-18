package jdbc_Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "root");
		Statement statement = connection.createStatement();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose what you want to do:\n 1.Create \n 2.Read \n 3.Update \n 4.Delete \n 5.Exit");
		System.out.println("Enter your choice:");
		
		while(true) {
			int choice = sc.nextInt();
			switch (choice) {
			case 1: System.out.println("Creating");
					PreparedStatement preparedcreate = connection.prepareStatement("insert into EMP values(?,?,?,?)");
					preparedcreate.setInt(1,1);
					preparedcreate.setString(2,"John");
					preparedcreate.setLong(3,764387643);
					preparedcreate.setString(4,"Tech");
					preparedcreate.executeUpdate();
					break;	
			case 2: System.out.println("Read");
					ResultSet resultset = statement.executeQuery("select * from EMP");
					while(resultset.next()) {
						System.out.println(resultset.getInt(1) +" "+ resultset.getString(2) +" "+ resultset.getInt(3) +" "+ resultset.getString(4));
					}
					break;
					
			case 3: System.out.println("Updateing");
					PreparedStatement preparedupdate = connection.prepareStatement("update EMP set values(?,?,?,?) where id = 1");
					preparedupdate.setInt(1,1);
					preparedupdate.setString(2,"John");
					preparedupdate.setLong(3,764387643);
					preparedupdate.setString(4,"Tech");
					preparedupdate.executeUpdate();
					System.out.println("Table updated");
					break;
					
			case 4: System.out.println("Deleting");
					PreparedStatement prepareddelete = connection.prepareStatement("delete from EMP where id = 1");
					prepareddelete.execute();
					break;
			case 5: System.out.println("Exiting");
					return;
					
		   default: System.out.println("Invalid Entry");
		   			break;
			
			}
		}
		
	}
}

