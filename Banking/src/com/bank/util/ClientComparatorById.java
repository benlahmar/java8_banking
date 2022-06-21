package com.bank.util;

import java.util.Comparator;

import com.bank.models.Client;

public class ClientComparatorById implements Comparator<Client>{

	@Override
	public int compare(Client c1, Client c2) {
		// TODO Auto-generated method stub
		return (int)( c2.getId()-c1.getId());
	}

}
