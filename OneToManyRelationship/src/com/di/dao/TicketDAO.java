package com.di.dao;
import com.di.mybatis.mapper.TicketMapper;
import com.di.mybatis.mapper.PersonMapper;
import com.di.vo.Ticket;
import com.di.vo.Person;

import java.awt.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class TicketDAO{
	private SqlSessionFactory sqlSessionFactory=null;
	public TicketDAO(SqlSessionFactory sqlSessionFactory){
		this.sqlSessionFactory=sqlSessionFactory;
	}
	public Ticket selectById(int id){
		Ticket ticket = null;
		SqlSession session= sqlSessionFactory.openSession();
		TicketMapper cm=session.getMapper(TicketMapper.class);
		try{
			ticket = cm.selectById(id);
		}finally{
			session.close();
		}
		System.out.println("selectById("+id+")-->"+ticket);
		return ticket;
	}
	
}