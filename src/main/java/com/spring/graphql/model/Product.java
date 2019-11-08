package com.spring.graphql.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {
	
	@Id
	@GeneratedValue 
	private String id;
	
	private String title;
	
	private String displayName;
	
	@Column(columnDefinition = "VARCHAR(5000)")
	private String shortDesc;
	
	@Column(columnDefinition = "VARCHAR(5000)")
	private String longDesc;
	
	private Double listPrice;
	
	private Double salePrice;
	
	private String upc;
	
	private String mpn;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id")
	private Set<Review> reviews;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id")
	private Set<TechSpecs> techSpecs;
}
