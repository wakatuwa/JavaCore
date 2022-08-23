package testProgram4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * account实现账户管理
 * @author wanghan
 *
 */
public class Account {
	int id;
	double balance;
	double annulRate;
	LocalDate dateCreated;

	public Account() {

	}
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnulRate() {
		return annulRate;
	}
	public void setAnnulRate(double annulRate) {
		this.annulRate = annulRate;
	}
	public double getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return this.annulRate/12;
	}

	public double getDayInterestRate() {
		return this.annulRate/365;
	}

	public static void  withdraw(Account account,double amount) {
		LocalDateTime now = LocalDateTime.now();
		Duration duration = Duration.between(now, account.dateCreated);
		double nowBalance = account.balance * account.getDayInterestRate() * duration.toDays() + account.balance;
		account.balance = nowBalance - amount;
	}

	public static void deposit(Account account, double amount) {
		account.balance = account.balance + amount;
		LocalDate now = LocalDate.now();
		account.dateCreated = now;
	}

	public static void main(String[] args) {
		Account s1 = new Account(101, 9919870.234);
		System.out.println(s1.id);
		s1.setId(321);
		System.out.println(s1.id);
		s1.setAnnulRate(0.5);
		s1.dateCreated = LocalDate.of(2017, 11, 01);
		System.out.println(s1.getMonthlyInterestRate());
		s1.withdraw(s1, 900);
		System.out.println(s1.balance);


	}
}
