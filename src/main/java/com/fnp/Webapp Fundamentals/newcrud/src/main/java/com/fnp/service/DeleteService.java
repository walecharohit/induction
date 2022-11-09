package com.fnp.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fnp.dao.DBOperation;
import com.fnp.util.MapperUtils;

/**
 * Delete Service class.
 * @author Saransh vijay
 *
 */
public class DeleteService implements ServiceInterface{

	/**
	 * 
	 * @param obj
	 * @return String type string whether an operation has been performed and what
	 *         is its status.
	 * @throws IOException
	 */
	public void deleteOp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String obj = req.getParameter("obj2");
		String status = "";
		final var objectMapper = MapperUtils.getObjectMapper();
		DBOperation dbop = new DBOperation();

		JsonNode jsonNode = objectMapper.readTree(obj);
		int deleteit = jsonNode.get("deleteit").asInt();

		if (deleteit != 0) {
			status = dbop.deleteEmp(deleteit);
		}
		/**
		 * response of delete operation.
		 */
		resp.getWriter().write(status);
	}

	@Override
	public void displayAll(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
	}

	@Override
	public void searchOp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
	}

	@Override
	public void insertOp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
	}

	@Override
	public void updateOp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
	}
}
