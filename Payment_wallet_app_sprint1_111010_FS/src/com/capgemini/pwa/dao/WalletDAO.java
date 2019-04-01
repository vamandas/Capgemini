package com.capgemini.pwa.dao;

import java.util.Map;

import com.capgemini.pwa.beans.Customer;
import com.capgemini.pwa.beans.Wallet;

public interface WalletDAO {
	public double addAmount(Customer customer, double amount);
	public double withdrawAmount(Customer customer, double amount);
	public boolean validateCustomerAndCreateAccount(Customer customer);
	public boolean login(String username, String password);
	public double showBalance(Customer customer);
	public double transferFunds(Customer customer1, Customer customer2, double amount);
	public Customer findOne(int accountNumber);
	public Customer[] findAll();
}
