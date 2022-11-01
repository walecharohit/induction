package com.fnp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.fnp.dto.Employee;

public class DBOperation {
	DBConnect db = new DBConnect();
	Connection connect = db.establishConnection();

	public void insertEmp(Employee emp) {
		String text = "";
		try {
			PreparedStatement pso = connect.prepareStatement("select * from EMP where id =?");
			pso.setInt(1, emp.getId());
			ResultSet rs = pso.executeQuery();
			if (rs.next()) {
				System.out.println("already exists." + rs.getInt(1));
				text = "already exists." + rs.getInt(1);
			} else {
				try {
					PreparedStatement ps = connect.prepareStatement("insert into EMP values (?,?,?,?)");
					ps.setInt(1, emp.getId());
					ps.setString(2, emp.getName());
					ps.setLong(3, emp.getPhone());
					ps.setString(4, emp.getDept());
					ps.execute();

				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static ArrayList<Employee> list = new ArrayList<>();

	public void showAllEmp() {
		PreparedStatement ps;
		try {
			ps = connect.prepareStatement("select * from EMP");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee john = new Employee();
				john.setId(rs.getInt(1));
				john.setName(rs.getString(2));
				john.setPhone(rs.getLong(3));
				john.setDept(rs.getString(4));

				list.add(john);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void updateEmp(Employee emp) {
		try {
			PreparedStatement ps = connect.prepareStatement("update EMP set name=?, phone=?, dept=? where id=? ");

			ps.setString(1, emp.getName());
			ps.setLong(2, emp.getPhone());
			ps.setString(3, emp.getDept());
			ps.setInt(4, emp.getId());
			ps.executeUpdate();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public Employee searchEmployee(int searchit) {
		System.out.println(searchit);
		Employee emo = new Employee();
		try {
			PreparedStatement ps = connect.prepareStatement("select * from EMP where id=?");
			ps.setInt(1, searchit);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				emo.setId(rs.getInt(1));
				emo.setName(rs.getString(2));
				emo.setPhone(rs.getLong(3));
				emo.setDept(rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emo;
	}

	public void deleteEmp(int id) {

		try {
			PreparedStatement ps = connect.prepareStatement("delete from EMP where id=?");
			ps.setInt(1, id);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
