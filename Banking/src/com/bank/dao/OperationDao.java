package com.bank.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

import com.bank.models.Operation;
import com.bank.models.OperationRetrait;
import com.bank.models.OperationVersement;
import com.bank.util.OpeationCompartorByDate;

public class OperationDao implements IOperation{

	public static NavigableSet<Operation> operations=new TreeSet<>(new OpeationCompartorByDate());
	@Override
	public void add(Operation t) {
		operations.add(t);
		
		
		
	}

	@Override
	public Operation findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Operation> all() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Operation t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Operation t, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Operation> findBetween(Date d1, Date d2) {
		List<Operation> list=new ArrayList<>();
		Operation o1=new  OperationRetrait();
		Operation o2=new OperationRetrait();
		Operation ov1=new  OperationVersement();
		Operation ov2=new OperationVersement();
		o1.setDate(d1);
		o2.setDate(d2);
		ov1.setDate(d1);
		ov2.setDate(d2);
		SortedSet<Operation> res1 = operations.subSet(o1, o2);
		SortedSet<Operation> res2 = operations.subSet(ov1, ov2);
		res1.addAll(res2);
		for (Operation o : res1) {
			list.add(o);
		}
		
		return list;
	}

	@Override
	public <Date> List<Date> findProp() {
		// TODO Auto-generated method stub
		return null;
	}

	public NavigableSet<Operation> getOperations() {
		return operations;
	}

	public void setOperations(NavigableSet<Operation> operations) {
		this.operations = operations;
	}

}
