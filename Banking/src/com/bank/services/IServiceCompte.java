package com.bank.services;

import java.util.Date;
import java.util.List;

import com.bank.Exceptions.MntinsuffusantException;
import com.bank.models.Operation;

public interface IServiceCompte {

	public void versser(double mnt, long idcpt);
	public void retirer(double mnt, long idcpt) throws MntinsuffusantException;
	
	
	public List<Operation> historique(Date dd, Date df);
	
}
