package com.bank.services;

import java.util.Date;
import java.util.List;

import com.bank.Exceptions.MntinsuffusantException;
import com.bank.dao.ICompte;
import com.bank.dao.IOperation;
import com.bank.models.Compte;
import com.bank.models.Operation;

public class ServiceCompteImpl implements IServiceCompte{

	ICompte CompteRepo;	
	IOperation OperRepo;
		
	public ServiceCompteImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceCompteImpl(ICompte compteRepo) {
		super();
		CompteRepo = compteRepo;
	}
	
	@Override
	public void versser(double mnt, long idcpt) {
		// TODO Auto-generated method stub
		//update de solde
		
	}

	@Override
	public void retirer(double mnt, long idcpt) throws MntinsuffusantException {
		Compte cpt = CompteRepo.findById(idcpt);
		if(mnt<cpt.getSolde()+cpt.getDecouverte())
		{
			System.out.println("operation execute");
			cpt.setSolde(cpt.getSolde()-mnt);
			System.out.println("le nv solde est :"+cpt.getSolde());
			//add operation de retrait
			//update solde
		}else
			throw new MntinsuffusantException("le mnt est insuffisant");
		
		
	}

	@Override
	public List<Operation> historique(Date dd, Date df) {
		// TODO Auto-generated method stub
		return null;
	}



	public ICompte getCompteRepo() {
		return CompteRepo;
	}



	public void setCompteRepo(ICompte compteRepo) {
		CompteRepo = compteRepo;
	}



	public IOperation getOperRepo() {
		return OperRepo;
	}



	public void setOperRepo(IOperation operRepo) {
		OperRepo = operRepo;
	}

	
	
}
