package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.Paypal;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data:");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date: ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contrac Value: ");
		double value = sc.nextDouble();
		System.out.print("Enter number installments: ");
		int numberInstallments = sc.nextInt();
		
		Contract contract = new Contract(number, date, value);
		ContractService cs = new ContractService(new Paypal());
		
		cs.processContract(contract, numberInstallments);
		System.out.println();
		System.out.println("Instalmments:");
		
		for (Installment im: contract.getInstallment()) {
				System.out.println(im);
			}
				
		sc.close();
	}

}