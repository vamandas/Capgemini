package com.capgemini.pwa.beans;

import java.util.Date;

public class Customer {
	private String custFirstName;
	private String custLastName;
	private Date custDateOfBirth;	
	private int custSSN;
	private String custMobileNumber;
	private String custEmail;
	private String custUsername;
	private String custPassword;
	private Wallet custWallet;
	public String getCustFirstName() {
		return custFirstName;
	}
	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}
	public String getCustLastName() {
		return custLastName;
	}
	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}
	public Date getCustDateOfBirth() {
		return custDateOfBirth;
	}
	public void setCustDateOfBirth(Date custDateOfBirth) {
		this.custDateOfBirth = custDateOfBirth;
	}
	public int getCustSSN() {
		return custSSN;
	}
	public void setCustSSN(int custSSN) {
		this.custSSN = custSSN;
	}
	public String getCustMobileNumber() {
		return custMobileNumber;
	}
	public void setCustMobileNumber(String custMobileNumber) {
		this.custMobileNumber = custMobileNumber;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustUsername() {
		return custUsername;
	}
	public void setCustUsername(String custUsername) {
		this.custUsername = custUsername;
	}
	public String getCustPassword() {
		return custPassword;
	}
	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}
	public Wallet getCustWallet() {
		return custWallet;
	}
	public void setCustWallet(Wallet custWallet) {
		this.custWallet = custWallet;
	}
	public Customer(String custFirstName, String custLastName, Date custDateOfBirth, int custSSN,
			String custMobileNumber, String custEmail, String custUsername, String custPassword, Wallet custWallet) {
		super();
		this.custFirstName = custFirstName;
		this.custLastName = custLastName;
		this.custDateOfBirth = custDateOfBirth;
		this.custSSN = custSSN;
		this.custMobileNumber = custMobileNumber;
		this.custEmail = custEmail;
		this.custUsername = custUsername;
		this.custPassword = custPassword;
		this.custWallet = custWallet;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "FirstName = " + custFirstName + ", LastName = " + custLastName + ", Date Of Birth = "
				+ custDateOfBirth + ", SSN = " + custSSN + ", Mobile Number = " + custMobileNumber + ", Email = "
				+ custEmail + ", Username = " + custUsername + ", Password = " + custPassword + ", " + custWallet;
	}
		
}
