package com.capgemini.pwa.beans;

public class Wallet {
	private int accNumber;
	private double accBalance;
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	public Wallet(int accNumber, double accBalance) {
		super();
		this.accNumber = accNumber;
		this.accBalance = accBalance;
	}
	public Wallet() {
		super();
	}
	@Override
	public String toString() {
		return "AccNumber = " + accNumber + ", AccBalance=" + accBalance;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(accBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + accNumber;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wallet other = (Wallet) obj;
		if (Double.doubleToLongBits(accBalance) != Double.doubleToLongBits(other.accBalance))
			return false;
		if (accNumber != other.accNumber)
			return false;
		return true;
	}
	
}
