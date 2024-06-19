package com.besant.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.besant.model.Model;
import com.besant.service.Service;





public class readservlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(req, resp);
		Service d=new Service();
		List<Model>k=new ArrayList<Model>();
		k=d.getall();
		req.setAttribute("red", k);
		req.getRequestDispatcher("readallresponse.jsp").forward(req, resp);
	}
		

	}
	


