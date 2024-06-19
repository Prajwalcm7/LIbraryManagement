package com.besant.service;

import java.util.ArrayList;
import java.util.List;

import com.besant.layer.daocls;
import com.besant.model.Model;




public class Service {
	public  String create(Model obj) {
		daocls p=new daocls();
		
		return p.create(obj);
		
	}
	public String update(Model id){
		daocls g3=new daocls();
		return g3.update(id);
		
		
		
		
	}
	public List<Model> getall(){
		//List<Model>g1=new ArrayList<Model>();
		daocls g2=new daocls();
		return g2.getall();
		
}
	public int deleteid(Model id) {
		daocls g4=new daocls();
		 return g4.deleteid(id);
	}
	public Model getbyid(int id) {
		daocls g6=new daocls();
		 return g6.getbyid(id);
		
	}
	

}
