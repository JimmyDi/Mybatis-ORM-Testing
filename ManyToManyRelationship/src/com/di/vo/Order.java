package com.di.vo;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable{
	private int order_id;
	private String code;
	private double total;
	private List<Article> articles;
	
	public int getId(){
		return order_id;
	}
	public void setId(int order_id){
		this.order_id=order_id;
	}
	
	public String getCode(){
		return code;
	}
	public void setCode(String code){
		this.code=code;
	}
	
	public double getTotal(){
		return total;
	}
	public void setTotal(double total){
		this.total=total;
	}
	
	public List<Article> getArticle(){
		return articles;
	}
	public void setArticle(List<Article> articles){
		this.articles=articles;
	}
	
	@Override
	public String toString(){
		return "Order (orderId="+order_id+",code="+code+",total="+total+")";
	}
}