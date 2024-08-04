package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ECommerSeller {
	private Seller seller;
	
	//Using Autowired annotation at parameter level
	public ECommerSeller(@Autowired Seller amazon) {
		this.seller = amazon;
	}
	
	public Seller getSeller() {
		return seller;
	}
}
