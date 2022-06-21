package com.bank.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.bank.Exceptions.MntinsuffusantException;
import com.bank.dao.ClientDao;
import com.bank.dao.CompteDao;
import com.bank.dao.IClient;
import com.bank.dao.ICompte;
import com.bank.dao.OperationDao;
import com.bank.models.Client;
import com.bank.models.Compte;
import com.bank.models.CompteB;
import com.bank.models.Operation;
import com.bank.models.OperationVersement;
import com.bank.services.ServiceCompteImpl;

public class Main {

	public static void main(String[] args) {
		
		ICompte cpdao=new CompteDao();
		Compte c=new CompteB();
		c.setIdcompte(1);
		c.setSolde(1000);
		c.setDecouverte(100);
		cpdao.add(c);
		
		ServiceCompteImpl service=new ServiceCompteImpl();
		service.setCompteRepo(cpdao);
		
		try {
			service.retirer(500, 1);
			
		} catch (MntinsuffusantException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

}
