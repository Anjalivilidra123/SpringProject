package com.sathya.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

 @Data
@NoArgsConstructor
@AllArgsConstructor
public class Productmodel {
	private String name;
	private String brand;
	private String madein;
	private double price;
	private int quantity;
	private double discountrate;
	

}
