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

@WebServlet("/delete")
public class Deleter extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String obj2 = req.getParameter("obj2");
		System.out.println(obj2);
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode2 = objectMapper.readTree(obj2);
		int deleteit = jsonNode2.get("deleteit").asInt();
		DBOperation c = new DBOperation();
		if (deleteit != 0) {
			c.deleteEmp(deleteit);
	
		}
	}
}
