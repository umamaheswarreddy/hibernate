package com.emart;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	private double productId;
	private double price;
	private String productName;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="subCategoryId")
	private SubCategories subCategories;
	
	

}
