package com.besant.layer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.besant.model.Model;

public class daocls {
	String username="root";
	String pwd="Prajwal@123";
	String url="jdbc:mysql://localhost:3306/book";
	String cre="insert into author(id,bookname,price) values(?,?,?)";
	String upqry="update author set bookname=?,price=? where id=?";
	String qry="select* from book.author";
	String delqry="delete from author where id=?";
	String get="select*from author where id=?";

	
	public String create(Model obj) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection(url,username,pwd);
			PreparedStatement pr=con.prepareStatement(cre);
			pr.setInt(1, obj.getId());
			pr.setString(2, obj.getBookname());
			pr.setInt(3, obj.getPrice());
			int result=pr.executeUpdate();
			pr.close();
			con.close();
			if(result>0) {
				return "success";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "wrong";
	}
	public String update(Model id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection(url,username,pwd);
			PreparedStatement pr=con.prepareStatement(upqry);
			pr.setString(1, id.getBookname());
			pr.setInt(2, id.getPrice());
			pr.setInt(3, id.getId());
			int result=pr.executeUpdate();
			pr.close();
			con.close();
			if(result>=1) {
				return "updated";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "something went wrong";
		
		
		
	}
	public List<Model>getall(){
		List<Model> n=new ArrayList<Model>();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
		Connection	con = DriverManager.getConnection(url,username,pwd);
			PreparedStatement pr=con.prepareStatement(qry);
			
			ResultSet r1=pr.executeQuery();
			while(r1.next()) {
				int id=r1.getInt("id");
				String bookname=r1.getString("bookname");
				int price=r1.getInt("price");
				Model m1=new Model(id,bookname,price);
				n.add(m1);
			}
			pr.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return n;
		}
	public int deleteid(Model id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		try {
			Connection con=DriverManager.getConnection(url,username,pwd);
			PreparedStatement a=con.prepareStatement(delqry);
			a.setInt(1, id.getId());
			 int r =a.executeUpdate();
			 con.close();
			 a.close();
			 if(r>0) {
				 return 1;
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return 0;
		
	}
	public Model getbyid(int id) {
		int a1=id;
		Model i=new Model();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		try {
			Connection con=DriverManager.getConnection(url,username,pwd);
			PreparedStatement a=con.prepareStatement(get);
			a.setInt(1,a1);
			ResultSet t=a.executeQuery();
			while (t.next()) {
				i.setId(t.getInt("id"));
				i.setBookname(t.getString("bookname"));
				i.setPrice(t.getInt("price"));	
			}
			
//			 int r =a.executeUpdate();
			 con.close();
			 a.close();
//			 if(r>0) {
//				 return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return i;
	
	
		
}
}
	
	
		
	


