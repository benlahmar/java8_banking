package com.bank.models;

import java.util.Date;

public class OperationVersement extends Operation{

	double mntversemment;

	public double getMntversemment() {
		return mntversemment;
	}

	public void setMntversemment(double mntversemment) {
		this.mntversemment = mntversemment;
	}

	public OperationVersement(long idop, Date date, double mntversemment) {
		super(idop, date);
		this.mntversemment = mntversemment;
	}

	public OperationVersement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
