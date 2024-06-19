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

public class getbyidservlet extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.service(req, resp)
	int id=Integer.parseInt(req.getParameter("id"));
//	Model d=new Model ();
//	d.setId(id);
	Service b=new Service();
	Model res=b.getbyid(id);
//	List<Model> g=new ArrayList<Model>();
//	int g=b.getbyid(d);
	req.setAttribute("get", res);
	req.getRequestDispatcher("getbyidresponse.jsp").forward(req, resp);
	
}
}
