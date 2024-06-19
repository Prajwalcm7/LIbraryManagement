package com.besant.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.besant.model.Model;
import com.besant.service.Service;

public class updateservlet  extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(req.getParameter("id"));
		String bookname=req.getParameter("bname");
		int price=Integer.parseInt(req.getParameter("price"));
		Model p=new Model();
		p.setId(id);
		p.setBookname(bookname);
		p.setPrice(price);
		Service a=new Service();
		String b=a.update(p);
		System.out.println(b);
		
		req.setAttribute("abcd", b);
		req.getRequestDispatcher("upadateresponse.jsp").forward(req, resp);
		}
		
	}


