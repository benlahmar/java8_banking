package com.bank.util;

import java.util.Comparator;

import com.bank.models.Operation;

public class OpeationCompartorByDate implements Comparator<Operation>{

	@Override
	public int compare(Operation o1, Operation o2) {
		
		
		return o1.getDate().compareTo(o2.getDate());
	}

}
