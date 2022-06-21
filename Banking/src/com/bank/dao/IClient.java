package com.bank.dao;

import java.util.List;

import com.bank.models.Client;

public interface IClient extends IDao<Client, Long>{

	public List<Client> findByname(String name);
}
