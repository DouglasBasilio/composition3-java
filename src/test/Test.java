package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entities.Client;
import entities.OrderItem;
import entities.Product;

public class Test {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Client cli = new Client("Douglas", "basilio.douglas@yahoo.com.br", sdf.parse("28/09/1989") );
		System.out.println(cli);
		System.out.println();
		
		Product p = new Product("TV", 1000.0);
		OrderItem oi1 = new OrderItem(1, 1000.0, p);
		
		System.out.println(oi1);
		
		Product p2 = new Product("Mouse", 40.0);
		OrderItem oi2 = new OrderItem(2, 40.0, p2);
		
		System.out.println(oi2);
	}

}
