package com.emart;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.hasa.onetomany.Trainee;
@Entity
@Table(name="categories")
public class Category implements Serializable{
	
	@Id
	private long categotyId;
	private String categoryName;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="category")
	private Set<Category> categoty;
	
	
	

}
