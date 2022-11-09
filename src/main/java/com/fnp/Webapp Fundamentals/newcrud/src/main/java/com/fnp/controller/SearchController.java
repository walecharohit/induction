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
 * Search controller used for search service.
 * @author Saransh vijay
 *
 */
@WebServlet("/search")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/**
		 * String return of object of Searched object.
		 */
		ServiceFactory service = new ServiceFactory();
		ServiceInterface search = service.serviceSelector("search");
		search.searchOp(req, resp);
	}
}
