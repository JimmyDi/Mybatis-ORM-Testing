package com.di.dao;
import java.util.List;

import com.di.mybatis.mapper.ArticleMapper;
import com.di.mybatis.mapper.OrderMapper;
import com.di.vo.Article;
import com.di.vo.Order;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class OrderDAO{
	private SqlSessionFactory sqlSessionFactory=null;
	public OrderDAO(SqlSessionFactory sqlSessionFactory){
		this.sqlSessionFactory = sqlSessionFactory;
	}


public void getArticleByOrder(int id){
	Order ss_order = null;
	List<Article> articles = null;
	SqlSession session= sqlSessionFactory.openSession();
	OrderMapper om=session.getMapper(OrderMapper.class);
	try{
		ss_order=om.getArticleByOrder(id);	
	}finally{
		session.close();
	}
	System.out.println(""+ss_order);
	articles = ss_order.getArticle();
	
	for(Article articlexx:articles){
			System.out.println(""+articlexx);
		}
	}
	

}
