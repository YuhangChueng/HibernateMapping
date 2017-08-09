package com.neusoft.bean;

import java.util.List;

public class OrderForm {
	private int formnum;
	private User user;
	private List<Goods> goods;
	public int getFormnum() {
		return formnum;
	}
	public void setFormnum(int formnum) {
		this.formnum = formnum;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Goods> getGoods() {
		return goods;
	}
	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}
	
}
