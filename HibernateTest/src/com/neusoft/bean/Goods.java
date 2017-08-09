package com.neusoft.bean;

import java.util.List;

public class Goods {
	private int goodsnum;
	private String goodsname;
	private List<OrderForm> orderform;
	private List<ShoppingCar> shoppingcar;
	private GoodsType goodstype;
	public int getGoodsnum() {
		return goodsnum;
	}
	public void setGoodsnum(int goodsnum) {
		this.goodsnum = goodsnum;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public List<OrderForm> getOrderform() {
		return orderform;
	}
	public void setOrderform(List<OrderForm> orderform) {
		this.orderform = orderform;
	}
	public List<ShoppingCar> getShoppingcar() {
		return shoppingcar;
	}
	public void setShoppingcar(List<ShoppingCar> shoppingcar) {
		this.shoppingcar = shoppingcar;
	}
	public GoodsType getGoodstype() {
		return goodstype;
	}
	public void setGoodstype(GoodsType goodstype) {
		this.goodstype = goodstype;
	}
	
}
