package fr.diginamic.banque.entites;

public class Compte {
	
	private long accountNumber;
	private int accountMoney;
	
	public Compte(long number, int money) {
		this.setAccountNumber(number);
		this.setAccountMoney(money);
	}
	public String toString() {
		String resume = "Compte numéro " + accountNumber + " : " + accountMoney + "€ restant";
		return resume;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccountMoney() {
		return accountMoney;
	}
	public void setAccountMoney(int accountMoney) {
		this.accountMoney = accountMoney;
	}
}
