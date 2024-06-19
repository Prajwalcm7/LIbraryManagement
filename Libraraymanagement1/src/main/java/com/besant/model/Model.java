package com.besant.model;

public class Model {
	private int id;
	private String bookname;
	private int price;
	 public Model(int id, String bookname, int price) {
		//super();
		this.id = id;
		this.bookname = bookname;
		this.price = price;
	}
	public Model() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Model [id=" + id + ", bookname=" + bookname + ", price=" + price + "]";
	}
	

}
