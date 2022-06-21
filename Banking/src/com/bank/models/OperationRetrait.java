package com.bank.models;

import java.util.Date;

public class OperationRetrait extends Operation{

	double mntretrait;

	public double getMntretrait() {
		return mntretrait;
	}

	public void setMntretrait(double mntretrait) {
		this.mntretrait = mntretrait;
	}

	public OperationRetrait(long idop, Date date, double mntretrait) {
		super(idop, date);
		this.mntretrait = mntretrait;
	}

	public OperationRetrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
