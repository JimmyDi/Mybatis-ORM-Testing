package com.di.vo;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable{
	private int id;
	private String name;
	private List<Ticket> ticket;
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public List<Ticket> getCard(){
		return ticket;
	}
	public void setCard(List<Ticket> tickets){
		this.ticket=tickets;
	}
	
	@Override
	public String toString(){
		return "Person (personId="+id+",name="+name+")";
	}
}