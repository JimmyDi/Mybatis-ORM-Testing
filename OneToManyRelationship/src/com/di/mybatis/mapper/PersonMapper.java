package com.di.mybatis.mapper;
import java.util.List;

import com.di.vo.Person;

public interface PersonMapper{
	Person selectAll();
	Person selectByName(String name);
	int insert(Person person);
	int update(Person person);
	void delete(int id);
}