package com.fnp.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Delete Service class.
 * @author Saransh vijay
 *
 */
public class DeleteService {

	/**
	 * 
	 * @param obj
	 * @return String type string whether an operation has been performed and what
	 *         is its status.
	 * @throws IOException
	 */
	public static void deleteOp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String obj = req.getParameter("obj2");
		String status = "";
		Service.jsonNode = Service.objectMapper.readTree(obj);
		int deleteit = Service.jsonNode.get("deleteit").asInt();

		if (deleteit != 0) {
			status = Service.c.deleteEmp(deleteit);
		}
		/**
		 * response of delete operation.
		 */
		resp.getWriter().write(status);
	}
}
