package com.spring.graphql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Review {
	
	@Id
	@GeneratedValue
	private String id;
	
	private String reviewTitle;
	
	private String reviewText;
	
	private String submittedBy;
	
	private int rating;
}
