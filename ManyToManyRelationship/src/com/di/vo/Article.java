package com.di.vo;

import java.io.Serializable;
import java.util.List;
import com.di.vo.Order;

public class Article implements Serializable{
	private int article_id;
	private String name;
	private double price;
	private List<Order> orders;
		
	public int getArticleId(){
		return this.article_id;
	}
	public void setIdArticleId(int article_id){
		this.article_id=article_id;
	}
	
	public String getName(){
		return name;
	}
	public void setCode(String name){
		this.name=name;
	}
	
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	
	public List<Order> getOrder(){
		return orders;
	}
	public void setOrder(List<Order> orders){
		this.orders=orders;
	}
	
	
	@Override
	public String toString(){
		return "Article (id="+ article_id +",name="+name+",price="+price+")";
	}
	
}