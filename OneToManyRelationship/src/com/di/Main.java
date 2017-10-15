package com.di;
import java.util.List;

import com.di.dao.TicketDAO;
import com.di.dao.PersonDAO;
import com.di.vo.Person;
import com.di.mybatis.MyBatisConnectionFactory;

public class Main {
	public static void main(String args[]){
//	    TicketDAO cardDAO = new TicketDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		PersonDAO personDAO = new PersonDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		//personDAO.selectById(1);
//		Person person = new Person();
//		person.setName("Person 1");
//		personDAO.insert(person);
//		
		
		personDAO.selectByName("sb");
		
 //    	Person person = new Person();
//		person.setName("Person 1");
//		
//		personDAO.insert(person);
//		person.setName("Person 2");
//
//     	int id = personDAO.insert(person);
//		personDAO.selectById(id);
		
//		int id = personDAO.insert(person);
//		personDAO.delete(5);

//		person = personDAO.selectAll();
	}
}