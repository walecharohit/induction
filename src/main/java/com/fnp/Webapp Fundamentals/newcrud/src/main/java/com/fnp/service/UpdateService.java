package com.fnp.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fnp.dto.Employee;
/**
 * Update Controller for update operation.
 * 
 * @author Saransh vijay
 *
 */
public class UpdateService {
	/**
	 * 
	 * @param obj
	 * @return returns update status.
	 * @throws IOException
	 */
	public static void updateOp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String status = "";

		String obj = req.getParameter("obj2");
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

		status = Service.c.updateEmp(emp);
		resp.getWriter().write(status);
	}
}
