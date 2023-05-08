package com.example.pojo;

public class Product {
	private int id;
	private String bookName;
	private double bookCost;
	private String authorName;
	private Category catgory;
	
	
	public Category getCatgory() {
		return catgory;
	}
	public void setCatgory(Category catgory) {
		this.catgory = catgory;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookCost() {
		return bookCost;
	}
	public void setBookCost(double bookCost) {
		this.bookCost = bookCost;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void add(Product product) {
		// TODO Auto-generated method stub
		
	}
	
	
}
