package com.di;
import java.util.List;

import com.di.dao.ArticleDAO;
import com.di.dao.OrderDAO;
import com.di.vo.Article;
import com.di.vo.Order;
import com.di.mybatis.MyBatisConnectionFactory;

public class Main {
	public static void main(String args[]){
//	    TicketDAO cardDAO = new TicketDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		OrderDAO orderDAO = new OrderDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		ArticleDAO articleDAO = new ArticleDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		//personDAO.selectById(1);
//		Person person = new Person();
//		person.setName("Person 1");
//		personDAO.insert(person);
//		
		//ArticleDAO articleDAO = new ArticleDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		orderDAO.getArticleByOrder(2);
		//articleDAO.getOrderByArticle(4);
		//articleDAO.
		//articleDAO.selectById(1);
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