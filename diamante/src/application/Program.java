package application;

import entities.ComboDevice;
import entities.ConcretePrinter;
import entities.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		
	ConcretePrinter p = new ConcretePrinter("1080");
	p.processDoc("Meu Documento");
	p.print("Meu Documento");
	System.out.println();
	ConcreteScanner s = new ConcreteScanner("2003");
	s.processDoc("Meu email");
	System.out.println("Scan resut: " + s.scanner());
	System.out.println();
	ComboDevice cd = new ComboDevice("2020");
	cd.processDoc("minha dissertação");
	cd.print("minha dissertação");
	System.out.println("Combo Scanner: " + cd.scanner());

	}

}