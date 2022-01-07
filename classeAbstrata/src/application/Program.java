package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Account > list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 300.00, 0.01));
		list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));
 		
		double sum = 0.0;
		for (Account acc :  list) {
			sum+= acc.getBalance();
		}
		System.out.printf("Total Balance: $%.2f%n", sum);
		
		for(Account acc : list){
			acc.deposit(10.0);
		}
		for(Account acc : list) {
			System.out.printf("Update Balance: $ %d: %.2f%n", acc.getNumber(), acc.getBalance() );
		}
						
		sc.close();

	}

}