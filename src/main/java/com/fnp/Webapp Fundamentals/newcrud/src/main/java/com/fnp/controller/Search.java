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
import com.google.gson.JsonObject;

@WebServlet("/search")
public class Search extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String obj2 = req.getParameter("obj2");
		System.out.println(obj2);

		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode2 = objectMapper.readTree(obj2);
		int searchit = jsonNode2.get("search").asInt();
		JsonObject json1 = new JsonObject();
		DBOperation c = new DBOperation();
		if (searchit != 0) {
			System.out.println(searchit + " value ");
			Employee ef = new Employee();
			ef = c.searchEmployee(searchit);
			json1.addProperty("id", ef.getId());
			json1.addProperty("name", ef.getName());
			json1.addProperty("phone", ef.getPhone());
			json1.addProperty("dept", ef.getDept());
			resp.getWriter().write(json1.toString());
		}

	}

}
