package com.fnp.service;

import java.io.IOException;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fnp.dao.DBOperation;
import com.fnp.dto.Employee;
import com.google.gson.JsonObject;

/**
 * This class is used for handling all the Business Logic of the Controller
 * classes.
 * this one is for Search.
 * @author Saransh vijay
 * @category Service Layer class.
 */

public class SearchService implements ServiceInterface{

	/**
	 * 
	 * @param obj
	 * @return String type of searched object as String.
	 * @throws IOException
	 */
	public void searchOp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String status = "";
		ObjectMapper objectMapper = new ObjectMapper();
		
		DBOperation c = new DBOperation();
		ServletInputStream requestObj = req.getInputStream();
		JsonNode jsonNode = objectMapper.readTree(requestObj);
		int searchit = jsonNode.get("search").asInt();
		JsonObject json = new JsonObject();
		Employee ef = new Employee();
		int flag = 0;

		if (searchit != 0) {
			System.out.println(searchit + " value ");

			try {
				ef = c.searchEmployee(searchit);

			} catch (Exception e) {
				json.addProperty("error", e.getMessage());
				flag = 1;
				status = json.toString();
			}

		}
		if (flag != 1) {
			if (ef.getId() != 0) {
				json.addProperty("id", ef.getId());
				json.addProperty("name", ef.getName());
				json.addProperty("phone", ef.getPhone());
				json.addProperty("dept", ef.getDept());

				status = json.toString();
			} else {
				json.addProperty("flag", "Employee does not exist.");
				status = json.toString();

			}
		}
		/**
		 * sending response of the object to View.
		 */
		resp.getWriter().write(status);
	}

	@Override
	public void displayAll(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
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
