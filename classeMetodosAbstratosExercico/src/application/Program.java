package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Legal;
import entities.Person;
import entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Tax Payer #" + i + " data: ");
			System.out.print("Physical or Legal: ");
			char ch = sc.next().charAt(0);
			
			if(ch == 'p') {
				System.out.print("Name: ");
				sc.nextLine();
				String name =  sc.nextLine();
				System.out.print("Annual Income: ");
				double annualIncome = sc.nextDouble();
				System.out.print("Health Expenses: ");
				double healthExpenses = sc.nextDouble();
				list.add(new PhysicalPerson(name, annualIncome, healthExpenses));
							
			}
			else {
				System.out.print("Name: ");
				sc.nextLine();
				String name =  sc.nextLine();
				System.out.print("Annual Income: ");
				double annualIncome = sc.nextDouble();
				System.out.print("Number of Employees: ");
				int employeenumbers = sc.nextInt();
				list.add(new Legal(name, annualIncome, employeenumbers));
				
			}
		}
			System.out.println();
			System.out.println("TAXES PAID:");
			double sum = 0.0;
			for (Person p : list) {
				sum += p.incomeTax();
				System.out.println(p.getName() + ": $ " + String.format("%.2f", p.incomeTax()));
			}
			System.out.println();
			System.out.printf("TOTAL TAXES: $ %.2f", sum);
					
			
		sc.close();

	}

}