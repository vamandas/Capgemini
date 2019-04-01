package com.capgemini.pwa.dao;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.pwa.beans.Customer;

public class WalletDAOImp implements WalletDAO {

	public Map<String,Customer> database = new HashMap<>();
	public Customer cust;

	@Override
	public boolean validateCustomerAndCreateAccount(Customer customer) {
		// TODO Auto-generated method stub
		if(database.containsKey(customer.getCustEmail())){
			System.out.println("The Email Address has already been used. Please try again using another Email Address.");
			return false;
		}
		else if(database.containsKey(customer.getCustUsername())){
			System.out.println("The Username has already been used. Please try again using another Username.");
			return false;
		}
		else {
			System.out.println("Account Successfully Created.");
			return true;
		}
	}	
	
	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		if(database.get(username).getCustPassword().equals(password))
			return true;
		return false;		
	}
	
	@Override
	public double addAmount(Customer customer, double amount) {
		// TODO Auto-generated method stub
		customer.getCustWallet().setAccBalance(customer.getCustWallet().getAccBalance() + amount);
		return customer.getCustWallet().getAccBalance();
	}
	
	@Override
	public double withdrawAmount(Customer customer, double amount) {
		// TODO Auto-generated method stub
		customer.getCustWallet().setAccBalance(customer.getCustWallet().getAccBalance() - amount);
		return customer.getCustWallet().getAccBalance();
	}

	@Override
	public double showBalance(Customer customer) {
		// TODO Auto-generated method stub
		return customer.getCustWallet().getAccBalance();
	}

	@Override
	public double transferFunds(Customer customer1, Customer customer2, double amount) {
		// TODO Auto-generated method stub
		customer1.getCustWallet().setAccBalance(customer1.getCustWallet().getAccBalance() - amount);
		customer2.getCustWallet().setAccBalance(customer2.getCustWallet().getAccBalance() + amount);
		return customer1.getCustWallet().getAccBalance();
	}

	@Override
	public Customer findOne(int accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
