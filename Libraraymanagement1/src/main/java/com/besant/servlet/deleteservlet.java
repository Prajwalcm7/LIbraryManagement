package com.besant.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.besant.model.Model;
import com.besant.service.Service;



public class deleteservlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(req, resp);
		int id=Integer.parseInt(req.getParameter("id"));
		Model m =new Model();
		m.setId(id);
		Service p=new Service();
		int d=p.deleteid(m);
	    req.setAttribute("delete", d);
	    req.getRequestDispatcher("deleteresponse.jsp").forward(req, resp);
	}
		
	}


