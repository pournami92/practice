package com.ust.pms.model;

//import javax.persistence.Entity;
//import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Entity
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor
//@Data

public class Product {

	
	
	//@Id
	private  int productId;
	private @NonNull String productName;
	private @NonNull int quantityonHand;
	private @NonNull int price;
	
	
	
}
