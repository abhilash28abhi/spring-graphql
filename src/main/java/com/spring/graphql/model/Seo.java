package com.spring.graphql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seo {
	
	@Id
	@GeneratedValue 
	private String id;
	
	private String metaTitle;
	
	private String metaKeywords;
	
	private String metaDescription;
	
	private String slug;
}
