package com.di.vo;

import java.io.Serializable;

public class Ticket implements Serializable{
	private int id;
	private String Code;
	private int c_id;
	private Person person;
	
	public Person getPerson(){
		return this.person;
	}
	
	public void setPerson(Person person){
		this.person=person;
	}
	
	public int getc_id(){
		return this.c_id;
	}
	
	public void setC_id(){
		this.c_id=c_id;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
	
	public String getCode(){
		return Code;
	}
	public void setCode(String Code){
		this.Code=Code;
	}
	
	@Override
	public String toString(){
		return "Card (id="+id+",code="+Code+",c_id="+c_id+")";
	}
	
}