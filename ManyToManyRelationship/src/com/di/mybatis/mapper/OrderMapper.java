package com.di.mybatis.mapper;

import com.di.vo.Order;

public interface OrderMapper{
	Order getArticleByOrder(int id);
}