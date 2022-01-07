package apllication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Product;
import model.services.ProductService;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD case", 80.00));
		
		//PREDICATE É UMA INTEFACE QUE PODE SR ESCRITO COMO LAMBDA
		list.removeIf(p -> p.getPrice() >= 100.00);
		list.forEach(System.out::println);
		System.out.println();
		
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("TV", 900.00));
		
		//CONSUMER  É UMA INTEFACE QUE PODE SR ESCRITO COMO LAMBDA
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		list.forEach(System.out::println);
		System.out.println();
		
		//FUNCTION
		// O map APLICA A FUNÇÃO A CADA  ELEMENTO DA LISTA E SÓ FUNCIONA PARA STREAM
		List <String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println();
		
		//FUNCAO PERSONALISADA COM A CLASE PRODUCT.SERVICE
		ProductService ps = new ProductService();
		double sum = ps.filteredSum(list, x -> x.getPrice() > 0.0);
		System.out.println(String.format("%.2f", sum));
	}
}