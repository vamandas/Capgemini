package com.capgemini.pwa.main;

import java.util.Date;
import java.util.Scanner;

import com.capgemini.pwa.beans.Customer;
import com.capgemini.pwa.beans.Wallet;
import com.capgemini.pwa.dao.WalletDAOImp;

public class PaymentWalletApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean displayMainMenu = true, displaySubMenu = false;
		Scanner sc = new Scanner(System.in);
		WalletDAOImp wdao = new WalletDAOImp();

		while (displayMainMenu) {
			System.out.println("Please select an option from the Menu.\n");
			System.out.println("Menu:\n 1. Register Account\n 2. Login\n 3. Exit");
			int mainMenu = sc.nextInt();
			switch (mainMenu) {
			case 1: // Register Account
				Customer cust = new Customer();
				Wallet wallet = new Wallet();
				System.out.println("Enter your First Name:");
				cust.setCustFirstName(sc.next());
				System.out.println("Enter your Last Name:");
				cust.setCustLastName(sc.next());
				System.out.println("Enter your Date Of Birth:");
				cust.setCustDateOfBirth(new Date(sc.next()));
				System.out.println("Enter your Social Security Number:");
				cust.setCustSSN(Integer.parseInt(sc.next()));
				System.out.println("Enter your Mobile Number:");
				cust.setCustMobileNumber(sc.next());
				System.out.println("Enter your frequently used Email Address:");
				cust.setCustEmail(sc.next());
				System.out.println("Enter the User Name:");
				cust.setCustUsername(sc.next());
				System.out.println("Enter your Password:");
				cust.setCustPassword(sc.next());
				cust.setCustWallet(wallet);
				if (wdao.validateCustomerAndCreateAccount(cust)) {
					wdao.database.put(cust.getCustUsername(), cust);
				}
				break;
			case 2: // Login
				System.out.println("Enter Username");
				String username = sc.next();
				if(!wdao.database.containsKey(username)) {
					System.out.println("The user does not exist.");
					break;
				}
				System.out.println("Enter Password");
				String password = sc.next();
				if (wdao.login(username, password)) {
					Customer customer = wdao.database.get(username);
					displayMainMenu = false;
					displaySubMenu = true;
					while (displaySubMenu) {
						System.out.println("Menu:\n 1. Add Funds\n 2. Withdraw Funds\n 3. Show Balance\n 4. Transfer Amount\n 5. Profile\n 6. Logout");
						int subMenu = sc.nextInt();
						switch (subMenu) {
						case 1: // Add Funds
							System.out.println("Enter the amount to be added.");
							double depositAmount = sc.nextDouble();
							System.out.println("An amount of $" + depositAmount
									+ " has successfully been deposited to your Account. Your Current balance is $"
									+ wdao.addAmount(customer, depositAmount));
							break;
						case 2: // Withdraw Funds
							System.out.println("Enter the amount to be withdrawn.");
							double withdrawAmount = sc.nextDouble();
							if (customer.getCustWallet().getAccBalance() >= withdrawAmount) {
								System.out.println("An amount of $" + withdrawAmount
										+ " has successfully been withdrawn from your Account. Your Current balance is $"
										+ wdao.withdrawAmount(customer, withdrawAmount));
								break;
							}
							System.out.println("Sorry! You do not have Sufficient funds to withdraw.");
							break;
						case 3: // Show Balance
							System.out.println("Your Current Balance is $" + wdao.showBalance(customer));
							break;
						case 4: // Transfer Funds
							System.out.println("Enter the username of the receiver");
							String receiver = sc.next();
							System.out.println("Enter the amount to be transfered.");
							double transferAmount = sc.nextDouble();
							Customer customer2 = wdao.database.get(receiver);
							if (wdao.database.containsKey(customer2)) {
								if (customer.getCustWallet().getAccBalance() >= transferAmount) {
									System.out.println("An amount of $" + transferAmount
											+ " has successfully been transferred to " + customer2.getCustFirstName()
											+ "'s Account. Your current balance is "
											+ wdao.transferFunds(customer, customer2, transferAmount));
									break;
								}
								System.out.println("Sorry! You do not have Sufficient funds to transfer.");
								break;
							}
							System.out.println("Sorry! The account does not exist.");
							break;
						case 5: // Account Profile
							System.out.println(customer);
							break;
						case 6: // Logout
							displayMainMenu = true;
							displaySubMenu = false;
							break;
						default:
							System.out.println("Invalid Option! Please select an appropriate option.");
							break;
						}
					}
				} else {
					System.out.println("Invalid username or password.");
				}
				break;
			case 3: // Exit
				System.out.println("Thank you for using our service. Have a good one.");
				displayMainMenu = false;
				break;
			default:
				System.out.println("Invalid Option! Please select an appropriate option.");
				break;
			}
		}
	}

}
