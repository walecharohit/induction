package com.fnp.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fnp.dto.Employee;
/** 
 * * Delete Controller for delete operation.
 * @author Saransh vijay
 */
public class InsertService {
	/**
	 * 
	 * @param obj
	 * @return returns status of the insertion.
	 * @throws IOException
	 */
	public static void insertOp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String status = "";
		String obj = req.getParameter("obj");
		Service.jsonNode = Service.objectMapper.readTree(obj);
		int idData = Service.jsonNode.get("id").asInt();
		String nameData = Service.jsonNode.get("name").asText();
		long phoneData = Service.jsonNode.get("phone").asLong();
		String deptData = Service.jsonNode.get("dept").asText();

		Employee emp = new Employee();

		emp.setId(idData);
		emp.setName(nameData);
		emp.setPhone(phoneData);
		emp.setDept(deptData);

		status = Service.c.insertEmp(emp);
		resp.getWriter().write(status);
	}

}
