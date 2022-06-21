package com.bank.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.bank.dao.ClientDao;
import com.bank.models.Client;
import com.bank.util.ClientComparatorById;

public class Main2 {

	public static void main(String[] args) {
		
		
		ClientDao dao=new ClientDao();
		Random r=new Random();
		for(int i=1;i<11;i++)
		{
			
			
		 Client c1=new Client(r.nextInt(), "nom"+i, "prenom", "adresse",i*4);
		dao.add(c1);
		    //c1<c2 ou >c2?????
		}
		SortedSet<Client> ccs=new TreeSet<>(new ClientComparatorById());

		SortedSet<Client> cs = dao.getClients();
		for (Client c : cs) {
			System.out.println(c.toString());
			ccs.add(c);
		}
		System.out.println("***************");
		
		ccs.headSet(new Client(44,"","","",11));
		
		ccs.tailSet(new Client(44,"","","",11));
		
		for (Client client : ccs) {
			
			System.out.println(client.toString());
		}
		//recuperer les clients par order desendant des id; 
		//de nombre de comptes
	}

	
	
}
