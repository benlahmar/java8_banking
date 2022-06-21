package com.bank.models;

import java.util.List;

public abstract class Compte {

	long idcompte;
	double solde;
	double decouverte;
	Client client;
	List<Operation> operations;
	public long getIdcompte() {
		return idcompte;
	}
	public void setIdcompte(long idcompte) {
		this.idcompte = idcompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public double getDecouverte() {
		return decouverte;
	}
	public void setDecouverte(double decouverte) {
		this.decouverte = decouverte;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<Operation> getOperations() {
		return operations;
	}
	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}
	
	
	
}
