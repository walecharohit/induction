package com.fnp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fnp.service.ServiceFactory;
import com.fnp.service.ServiceInterface;

/**
 * 
 * Class for insert function.
 * @author Saransh vijay
 *
 */
@WebServlet("/Main")
public class MainController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		/**
		 * Call for Service class insert method.
		 */
		ServiceFactory service = new ServiceFactory();
		ServiceInterface insert = service.serviceSelector("insert");
		insert.insertOp(req, resp);

	}
}
