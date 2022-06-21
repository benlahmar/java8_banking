package com.bank.dao;

import java.util.List;

public interface IDao<T, K> {

	public void add(T t);
	public T findById(K id);
	public List<T> all();
	public void delete(T t);
	public void update(T t, K id);
	public  <E> List<E> findProp();
	
}
