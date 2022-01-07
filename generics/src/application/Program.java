package application;

import java.util.Scanner;

import entities.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantity: ");
		int n = sc.nextInt();
		//INSTANCIAR O TIPO GENERICO<>
		PrintService<Integer> ps = new PrintService<>();
		for(int i=0; i<n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		ps.print();
		
		System.out.println("First: " + ps.first());		
		
		
		
		sc.close();

	}

}
