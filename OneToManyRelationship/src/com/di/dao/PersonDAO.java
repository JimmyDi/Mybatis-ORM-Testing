package com.di.dao;
import java.util.List;

import com.di.mybatis.mapper.PersonMapper;
import com.di.vo.Ticket;
import com.di.vo.Person;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class PersonDAO{
	private SqlSessionFactory sqlSessionFactory=null;
	public PersonDAO(SqlSessionFactory sqlSessionFactory){
		this.sqlSessionFactory = sqlSessionFactory;
	}
@SuppressWarnings("unchecked")
public List<Person> selectAll(){
	List<Person> list = null;
	SqlSession session=sqlSessionFactory.openSession();
	PersonMapper pm=session.getMapper(PersonMapper.class);
	try{
		list=(List<Person>) pm.selectAll();
	} finally {
		session.close();
	}
	System.out.println("selectAll()-->"+list);
	return list;
}

public void selectByName(String name){
	Person person = null;
	List<Ticket> ticket = null;
	SqlSession session= sqlSessionFactory.openSession();
	PersonMapper pm=session.getMapper(PersonMapper.class);
	try{
		person=pm.selectByName(name);	
	}finally{
		session.close();
	}
	System.out.println(""+person);
	ticket=person.getCard();
	for(Ticket ticketxx:ticket){
		System.out.println(""+ticketxx);
	}

}

public int insert(Person person){
	int id=-1;
	SqlSession session=sqlSessionFactory.openSession();
	PersonMapper pm = session.getMapper(PersonMapper.class);
	try{
		id=pm.insert(person);
	}finally{
		session.commit();
		session.close();
	}
	System.out.println("insert("+person+") -->"+person.getId());
	return id;
}
	
public void update(Person person){
	int id = -1;
	SqlSession session = sqlSessionFactory.openSession();
	PersonMapper pm = session.getMapper(PersonMapper.class);
	try{
		id=pm.update(person);
	}
	finally{
		session.commit();
		session.close();
	}
	System.out.println("update("+person+") --> updated");
}

public void delete(int id){
	SqlSession session = sqlSessionFactory.openSession();
	PersonMapper pm = session.getMapper(PersonMapper.class);
	try{
		pm.delete(id);
	}finally{
		session.commit();
		session.close();
	}
	System.out.println("delete("+id+")");
}

}