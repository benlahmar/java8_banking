package com.bank.test;

import java.util.Date;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;

import com.bank.dao.OperationDao;
import com.bank.models.Operation;
import com.bank.models.OperationRetrait;
import com.bank.models.OperationVersement;

public class Main3 {

	public static void main(String[] args) {
		OperationDao dao=new OperationDao();
		for(int i=1;i<10;i++)
		{
			Date d=new Date(2022, i, i);
			Date dv=new Date(2022, i, i+1);
			OperationRetrait or=new OperationRetrait(i,d,10*i);
			OperationVersement ov=new OperationVersement(i, dv, 40*i);
			dao.add(or);
			dao.add(ov);
		}
		
		for (Operation o : dao.getOperations()) {
			System.out.println(o.toString());
		}
		
		System.out.println("**************");
		Date d1=new Date(2022, 5, 10);
		Date d2=new Date(2022, 7, 17);
		List<Operation> res = dao.findBetween(d1, d2);
		for (Operation o : res) {
			System.out.println(o.toString());
		}
		Date dt=new Date(2022,5,5);
		OperationRetrait or=new OperationRetrait(1,dt,4000);
		System.out.println("*****------------******");
		SortedSet<Operation> h = dao.getOperations().tailSet(or);
		for (Operation o : h) {
			System.out.println(o.toString());
		}
		
		Queue<Operation> file=new PriorityQueue<>(7);
		file.add(or);
		
	}

}
