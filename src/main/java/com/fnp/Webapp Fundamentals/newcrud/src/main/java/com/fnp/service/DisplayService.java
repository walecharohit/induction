package com.fnp.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fnp.dao.DBOperation;
import com.fnp.dto.Employee;
import com.fnp.util.MapperUtils;
import com.google.gson.JsonObject;

/**
 * Class used for Display service.
 * @author Saransh Vijay
 *
 */
public class DisplayService implements ServiceInterface{
	/**
	 * 
	 * @param obj
	 * @return returns String type of all objects;
	 * @throws IOException
	 */
	public void displayAll(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		final var objectMapper = MapperUtils.getObjectMapper();
		
		String obj = req.getParameter("obj2");
		JsonNode jsonNode = objectMapper.readTree(obj);
		int show = jsonNode.get("showit").asInt();
		String jsonList = "";

		DBOperation dbop = new DBOperation();
		dbop.showAllEmp();

		JsonObject json = new JsonObject();
		if (show == 1) {
			for (Employee e : DBOperation.list) {
				json.addProperty("id", e.getId());
				json.addProperty("name", e.getName());
				json.addProperty("phone", e.getPhone());
				json.addProperty("dept", e.getDept());

				jsonList += json.toString() + "-";
			}
			DBOperation.list.removeAll(DBOperation.list);

		}
		resp.getWriter().write(jsonList);
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

	@Override
	public void deleteOp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
	}
}
