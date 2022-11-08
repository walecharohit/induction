package com.fnp.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fnp.dao.DBOperation;
import com.fnp.dto.Employee;
import com.google.gson.JsonObject;

/**
 * Class used for Display service.
 * @author Saransh Vijay
 *
 */
public class DisplayService {
	/**
	 * 
	 * @param obj
	 * @return returns String type of all objects;
	 * @throws IOException
	 */
	public static void displayAll(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String obj = req.getParameter("obj2");
		Service.jsonNode = Service.objectMapper.readTree(obj);
		int show = Service.jsonNode.get("showit").asInt();
		String jsonList = "";

		Service.c.showAllEmp();

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
}
