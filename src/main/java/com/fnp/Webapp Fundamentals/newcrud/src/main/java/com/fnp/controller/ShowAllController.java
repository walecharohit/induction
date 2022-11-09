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
 * Show all database elements via this controller.
 * @author Saransh vijay
 *
 */
@WebServlet("/show")
public class ShowAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		/**
		 * String type od displayAll return type for sending to View.
		 */
		ServiceFactory service = new ServiceFactory();
		ServiceInterface show = service.serviceSelector("display");
		show.displayAll(req, resp);

	}

}
