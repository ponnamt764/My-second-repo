package com.webapp.custapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerDetails {
	
	@Id
	private int cust_id;
	private String cust_name;
	private String customer_addr;
	private String Customer_dob;
	
	
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCustomer_addr() {
		return customer_addr;
	}
	public void setCustomer_addr(String customer_addr) {
		this.customer_addr = customer_addr;
	}
	public String getCustomer_dob() {
		return Customer_dob;
	}
	public void setCustomer_dob(String customer_dob) {
		Customer_dob = customer_dob;
	}
	
	@Override
	public String toString() {
		return "CustomerDetails [cust_id=" + cust_id + ", cust_name=" + cust_name + ", customer_addr=" + customer_addr
				+ ", Customer_dob=" + Customer_dob + "]";
	}
	
}
