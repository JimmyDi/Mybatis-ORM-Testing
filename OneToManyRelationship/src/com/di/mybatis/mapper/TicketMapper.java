package com.di.mybatis.mapper;

import com.di.vo.Ticket;

public interface TicketMapper{
	Ticket selectById(int id);
}