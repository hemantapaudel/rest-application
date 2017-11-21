package com.mycompany.core.rest.model;

public class AccountDetailVO {

	private String userName;
	private String accountNumber;
	private String currentBalance;
	private String aviableBalance;
	
	
	public AccountDetailVO(String userName, String accountNumber,
			String currentBalance, String aviableBalance) {
		super();
		this.userName = userName;
		this.accountNumber = accountNumber;
		this.currentBalance = currentBalance;
		this.aviableBalance = aviableBalance;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(String currentBalance) {
		this.currentBalance = currentBalance;
	}
	public String getAviableBalance() {
		return aviableBalance;
	}
	public void setAviableBalance(String aviableBalance) {
		this.aviableBalance = aviableBalance;
	}
	
}
