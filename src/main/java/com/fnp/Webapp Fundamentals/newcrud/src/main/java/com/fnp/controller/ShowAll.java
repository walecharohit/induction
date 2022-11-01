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

@WebServlet("/show")
public class ShowAll extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String obj2 = req.getParameter("obj2");
		System.out.println(obj2);
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode3 = objectMapper.readTree(obj2);
		int show = jsonNode3.get("showit").asInt();
		System.out.println(show);
		DBOperation c = new DBOperation();
		c.showAllEmp();
		JsonObject json = new JsonObject();
		if(show == 1){
			System.out.println("j");
			for (Employee e : DBOperation.list) {
				json.addProperty("id", e.getId());
				json.addProperty("name", e.getName());
				json.addProperty("phone", e.getPhone());
				json.addProperty("dept", e.getDept());
				// json.add(, json)

				System.out.println(json.toString());

				resp.getWriter().write(json.toString() + "-");

			}
			DBOperation.list.removeAll(DBOperation.list);
		}
		
		
	}
	
}
