package com.bank.dao;

import java.util.List;

import com.bank.models.Compte;

public interface ICompte extends IDao<Compte, Long>{

	public List<Compte> findByMin(double solde);
	
}
