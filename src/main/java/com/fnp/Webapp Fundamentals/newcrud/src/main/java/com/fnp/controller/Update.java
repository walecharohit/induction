package com.fnp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fnp.dao.DBOperation;
import com.fnp.dto.Employee;

@WebServlet("/update")
public class Update extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String obj2 = req.getParameter("obj2");
		System.out.println(obj2);
		
		DBOperation c = new DBOperation();
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(obj2);

		int idData = jsonNode.get("id").asInt();
		String nameData = jsonNode.get("name").asText();
		long phoneData = jsonNode.get("phone").asLong();
		String deptData = jsonNode.get("dept").asText();
		
		Employee emp = new Employee();

		emp.setId(idData);
		emp.setName(nameData);
		emp.setPhone(phoneData);
		emp.setDept(deptData);
		
		c.updateEmp(emp);
	}
	
	
}
