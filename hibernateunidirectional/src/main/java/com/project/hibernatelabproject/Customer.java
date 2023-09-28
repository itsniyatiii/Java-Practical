package com.project.hibernatelabproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="Customer_Details") // declaring the entity file
@Table(name="Customer_Info") //giving the name to the table

public class Customer //class name
{
	@Id //to set the primary key
	@Column(name="Customer_ID")
	private int cid;
	@Column(name="Customer_Name")
	private String cname;
	@Column(name="Customer_Age")
	private int age;
	@Column(name="Customer_City")
	private String city;
	@Column(name="Customer_Contact_No")
	private String contactno;
	
	@OneToOne //one to one connection
	@JoinColumn(name="prod_id")
	private Product prod;
	
	//generating constructor
	public Customer(int cid, String cname, int age, String city, String contactno, Product prod) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.age = age;
		this.city = city;
		this.contactno = contactno;
		this.prod = prod;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//generating getter and setter methods
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	
}
