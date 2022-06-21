package com.bank.models;

import java.util.Date;

public abstract class Operation {

	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getIdop() {
		return idop;
	}
	public void setIdop(long idop) {
		this.idop = idop;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	long idop;
	Date date;
	Compte compte;
	public Operation(long idop, Date date) {
		super();
		this.idop = idop;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Operation [idop=" + idop + ", date=" + date + ", compte=" + compte + "]";
	}
	
}
