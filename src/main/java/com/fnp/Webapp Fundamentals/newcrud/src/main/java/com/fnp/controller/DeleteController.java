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
 * Delete Controller for delete operation.
 * @author Saransh vijay
 *
 */
@WebServlet("/delete")
public class DeleteController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		/**
		 * String of deleteOperation from Service.
		 */
		
		ServiceFactory service = new ServiceFactory();
		ServiceInterface delete = service.serviceSelector("delete");
		delete.deleteOp(req, resp);

	}
}
