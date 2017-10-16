package com.di.dao;
import com.di.mybatis.mapper.OrderMapper;

import com.di.mybatis.mapper.ArticleMapper;
import com.di.vo.Article;
import com.di.vo.Order;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class ArticleDAO{
	private SqlSessionFactory sqlSessionFactory=null;
	public ArticleDAO(SqlSessionFactory sqlSessionFactory){
		this.sqlSessionFactory=sqlSessionFactory;
	}
	public Article getOrderByArticle(int id){
		Article article = null; 
		List<Order> orders =null;
		SqlSession session= sqlSessionFactory.openSession();
		ArticleMapper am=session.getMapper(ArticleMapper.class);
		try{
			article = am.getOrderByArticle(id);
		}finally{
			session.close();
		}
		System.out.println("selectById("+id+")-->"+article);
		orders=article.getOrder();
		for(Order orderxx:orders){
			System.out.println(""+orderxx);
		}
		return article;
	}
	
}