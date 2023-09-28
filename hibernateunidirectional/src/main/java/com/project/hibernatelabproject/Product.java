package com.project.hibernatelabproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Product_Details") //declaring the entity file
@Table(name="Product_Info") //giving the name to the table

public class Product //class name
{
	@Id //it will create as primary key
	@Column(name="Product_ID")
	private int pid;
	@Column(name="Product_Name")
	private String pname;
	@Column(name="Project_Price")
	private int price;
	@Column(name="Date_Of_Manufacture")
	private String dateOfManufacture;
	
	//generating constructor
	public Product(int pid, String pname, int price, String dateOfManufacture) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.dateOfManufacture = dateOfManufacture;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	//generating getter and setter methods
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	
	
}
