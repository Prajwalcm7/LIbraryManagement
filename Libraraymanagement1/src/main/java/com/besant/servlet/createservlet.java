package com.besant.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.besant.model.Model;
import com.besant.service.Service;

public class createservlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.service(req, resp);
	int id=Integer.parseInt(req.getParameter("id"));
	String bookname=req.getParameter("bookname");
	int price=Integer.parseInt(req.getParameter("price"));
	Model m=new Model();
	m.setId(id);
	m.setBookname(bookname);
m.setPrice(price);
Service n=new Service();
String ab=n.create(m);
req.setAttribute("chinnu", ab);
req.getRequestDispatcher("createresponse.jsp").forward(req, resp);
}



	
	

}
