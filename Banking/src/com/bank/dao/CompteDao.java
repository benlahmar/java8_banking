package com.bank.dao;

import java.util.ArrayList;
import java.util.List;

import com.bank.models.Compte;

public class CompteDao implements ICompte {

	public static List<Compte> comptes=new ArrayList<>();
	
	@Override
	public void add(Compte t) {
		comptes.add(t);
		
		
	}

	@Override
	public Compte findById(Long id) {
		for (Compte c : comptes) {
			if(c.getIdcompte()==id)
				return c;
		}
		return null;
	}

	@Override
	public List<Compte> all() {
		// TODO Auto-generated method stub
		return comptes;
	}

	@Override
	public void delete(Compte t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Compte t, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Compte> findByMin(double solde) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <Double> List<Double> findProp() {
		// TODO Auto-generated method stub
		return null;
	}

}
