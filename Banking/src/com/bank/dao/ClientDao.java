package com.bank.dao;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.bank.Exceptions.MntinsuffusantException;
import com.bank.models.Client;
import com.bank.models.Compte;
import com.bank.util.AgeComparator;

public class ClientDao implements IClient {

	public static SortedSet<Client> clients=new TreeSet<>(new AgeComparator());
	@Override
	public void add(Client t) {
		// TODO Auto-generated method stub
		clients.add(t);
	}

	public static SortedSet<Client> getClients() {
		return clients;
	}

	public static void setClients(SortedSet<Client> clients) {
		ClientDao.clients = clients;
	}

	@Override
	public Client findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> all() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Client t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Client t, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Client> findByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <String> List<String> findProp() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
