package com.fnp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;

import com.fnp.dto.Employee;

/**
 * 
 * @author Saransh vijay
 * @category DBoperation class used for performing all the db operations.
 */
public class DBOperation {
	DBConnect db = new DBConnect();
	/**
	 * To get a Connection object function call with return type.
	 */
	Connection connect = db.establishConnection();

	/**
	 * 
	 * @param emp
	 * @return String of status.
	 */
	public String insertEmp(Employee emp) {
		String text = "";
		try {
			PreparedStatement pso = connect.prepareStatement("select * from EMP where id =?");
			pso.setInt(1, emp.getId());
			ResultSet rs = pso.executeQuery();
			if (rs.next()) {
				System.out.println("already exists at id = " + rs.getInt(1));
				text = "already exists at id = " + rs.getInt(1);
			} else {
				try {
					PreparedStatement ps = connect.prepareStatement("insert into EMP values (?,?,?,?)");
					ps.setInt(1, emp.getId());
					ps.setString(2, emp.getName());
					ps.setLong(3, emp.getPhone());
					ps.setString(4, emp.getDept());
					ps.execute();

					text = "Element Inserted.";
				} catch (SQLException e) {
					e.printStackTrace();
					text = e.getMessage();

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			text = e.getMessage();

		}
		return text;

	}

	public static ArrayList<Employee> list = new ArrayList<>();

	/**
	 * 
	 * @return returns status of function.
	 */
	public String showAllEmp() {
		String text = "";
		PreparedStatement ps;
		try {
			ps = connect.prepareStatement("select * from EMP");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee newEmp = new Employee();
				newEmp.setId(rs.getInt(1));
				newEmp.setName(rs.getString(2));
				newEmp.setPhone(rs.getLong(3));
				newEmp.setDept(rs.getString(4));

				list.add(newEmp);
			}
			text = "Displaying all elements.";
		} catch (Exception e) {

			e.printStackTrace();
			text = e.getMessage();

		}
		return text;
	}

	/**
	 * 
	 * @param emp object of Employee class.
	 * @return
	 */
	public String updateEmp(Employee emp) {
		String text = "";
		try {
			PreparedStatement ps = connect.prepareStatement("update EMP set name=?, phone=?, dept=? where id=? ");

			ps.setString(1, emp.getName());
			ps.setLong(2, emp.getPhone());
			ps.setString(3, emp.getDept());
			ps.setInt(4, emp.getId());
			ps.executeUpdate();
			text = "Employee details updated at id = " + emp.getId();
		} catch (Exception e) {
			e.printStackTrace();
			text = e.getMessage();

		}
		return text;
	}

	/**
	 * 
	 * @param searchit
	 * @return returns an object of Employee class after searching in database.
	 * @throws SQLSyntaxErrorException
	 * @throws SQLException
	 */
	public Employee searchEmployee(int searchit) throws SQLSyntaxErrorException, SQLException {

		Employee emo = new Employee();

		PreparedStatement ps = connect.prepareStatement("select * from EMP where id=?");
		ps.setInt(1, searchit);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			emo.setId(rs.getInt(1));
			emo.setName(rs.getString(2));
			emo.setPhone(rs.getLong(3));
			emo.setDept(rs.getString(4));

		}
		return emo;
	}

	/**
	 * 
	 * @param id
	 * @return String of status of delete operation.
	 */
	public String deleteEmp(int id) {
		String text = "";
		try {
			PreparedStatement ps = connect.prepareStatement("delete from EMP where id=?");
			ps.setInt(1, id);
			ps.execute();
			text = "Details Deleted.";
		} catch (SQLException e) {
			e.printStackTrace();
			text = e.getMessage();
		}

		return text;
	}
}
