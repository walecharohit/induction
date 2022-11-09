package com.fnp.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ServiceInterface {
	
	void displayAll(HttpServletRequest req, HttpServletResponse resp)throws IOException;
	
	void searchOp(HttpServletRequest req, HttpServletResponse resp) throws IOException;
	
	void insertOp(HttpServletRequest req, HttpServletResponse resp) throws IOException;
	
	void updateOp(HttpServletRequest req, HttpServletResponse resp) throws IOException;
	
	void deleteOp(HttpServletRequest req, HttpServletResponse resp) throws IOException;
}
