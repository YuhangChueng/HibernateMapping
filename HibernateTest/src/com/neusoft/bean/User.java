package com.neusoft.bean;

import java.util.List;

public class User {
	private int id;
	private String username;
	private String password;
	private ShoppingCar shoppingcar;
	private List<OrderForm> orderform;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ShoppingCar getShoppingcar() {
		return shoppingcar;
	}
	public void setShoppingcar(ShoppingCar shoppingcar) {
		this.shoppingcar = shoppingcar;
	}
	public List<OrderForm> getOrderform() {
		return orderform;
	}
	public void setOrderform(List<OrderForm> orderform) {
		this.orderform = orderform;
	}
	
	
}
