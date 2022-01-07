package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerday;
	
	private TaxService taxService;
	
	public RentalService(Double pricePerHour, Double pricePerday, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerday = pricePerday;
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		Double hours = (double) (t2 - t1) / 1000 / 60 / 60;
		Double basicPayment;
		if(hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		}
		else {
			basicPayment = Math.ceil(hours / 24) * pricePerday;
		}
		Double tax = taxService.tax(basicPayment);
		carRental.setInvoice(new Invoice(basicPayment, tax));

	}
	
}