package com.fnp.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fnp.dao.DBOperation;
import com.fnp.dto.Employee;
/** 
 * * Delete Controller for delete operation.
 * @author Saransh vijay
 */
public class InsertService implements ServiceInterface{
	/**
	 * 
	 * @param obj
	 * @return returns status of the insertion.
	 * @throws IOException
	 */
	public void insertOp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String status = "";
		String obj = req.getParameter("obj");
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(obj);
		DBOperation dbop = new DBOperation();

		int idData = jsonNode.get("id").asInt();
		String nameData = jsonNode.get("name").asText();
		long phoneData = jsonNode.get("phone").asLong();
		String deptData = jsonNode.get("dept").asText();

		Employee emp = new Employee();

		emp.setId(idData);
		emp.setName(nameData);
		emp.setPhone(phoneData);
		emp.setDept(deptData);

		status = dbop.insertEmp(emp);
		resp.getWriter().write(status);
	}

	@Override
	public void displayAll(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchOp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
