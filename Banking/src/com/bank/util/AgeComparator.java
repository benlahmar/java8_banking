package com.bank.util;

import java.util.Comparator;

import com.bank.models.Client;

public class AgeComparator implements Comparator<Client>{

	@Override
	public int compare(Client c1, Client c2) {
		// TODO Auto-generated method stub
		return c2.getAge()-c1.getAge();
	}

}
