package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.ProductDetails;
import com.app.config.AppConfig;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("-------- Bean Names ----------");
		String[] beanName = applicationContext.getBeanDefinitionNames();
		for (String string : beanName) {
			System.out.println(string);
		}
	
		ProductDetails productDetails = applicationContext.getBean(ProductDetails.class);
		System.out.println("----------- Iphone Product Details -----------");
		productDetails.displayIphoneDetails();
		System.out.println("----------- Mi Product Details -----------");
		productDetails.displayMiDetails();
		System.out.println("----------- Samsung Product Details -----------");
		productDetails.displaySamsungDetails();
		System.out.println("----------- OnePlus Product Details -----------");
		productDetails.displayOnePlusDetails();
		System.out.println("----------- ECommerSeller Details -----------");
		productDetails.displayECommerSellerDetails();
		
	}
}
