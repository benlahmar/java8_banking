package com.bank.dao;

import java.util.Date;
import java.util.List;

import com.bank.models.Operation;

public interface IOperation extends IDao<Operation, Long>{

	public List<Operation> findBetween(Date d1,Date d2);
}
