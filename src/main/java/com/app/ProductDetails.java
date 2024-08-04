package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDetails {
	//Using Autowired annotation at field level
	@Autowired
	private Product iphone;
	
	private Product mi;
	//Using Autowired annotation at constructor level
	@Autowired
	private ProductDetails(Product mi) {
		this.mi = mi;
	}
	
	private Product samsung;
	//Using Autowired annotation at setter method level
	@Autowired
	private void setSamsung(Product samsung) {
		this.samsung = samsung;
	}
	
	private Product oneplus;
	//Using Autowired annotation at method level
	@Autowired
	private void getOneplus(Product oneplus) {
		this.oneplus = oneplus;
	}
	
	//Using Autowired annotation at field level
	@Autowired
	private ECommerSeller eCommerSeller;
	
	public void displayIphoneDetails() {
		System.out.println(iphone);
	}
	
	public void displayMiDetails() {
		System.out.println(mi);
	}
	
	public void displaySamsungDetails() {
		System.out.println(samsung);
	}
	
	public void displayOnePlusDetails() {
		System.out.println(oneplus);
	}
	
	public void displayECommerSellerDetails() {
		System.out.println(eCommerSeller.getSeller());
	}

}
