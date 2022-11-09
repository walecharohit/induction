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
 * Update controller for update function.
 * @author Saransh vijay
 *
 */
@WebServlet("/update")
public class UpdateController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		/**
		 * String type of Service class updateOp Business Logic.
		 */
		ServiceFactory service = new ServiceFactory();
		ServiceInterface update = service.serviceSelector("update");
		update.updateOp(req, resp);

	}
}
