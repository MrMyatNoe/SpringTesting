package com.tmn.helloSpring.pojo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")		//default is singleton check Shopping bean instance
public class ShoppingCart {

	private List<Product> listOfProducts = new ArrayList<Product>();

	public void addItem(Product item) {
		listOfProducts.add(item);
	}
	
	public List<Product> getListOfProducts() {
		return listOfProducts;
	}

	
}
