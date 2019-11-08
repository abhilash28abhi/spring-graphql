package com.spring.graphql.query;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.spring.graphql.model.Product;
import com.spring.graphql.service.ProductService;

@Component
public class GraphqlQuery implements GraphQLQueryResolver {
	
	@Autowired
	private ProductService productService ;
	
	public Optional<Product> getProduct(String id) {
		return productService.getProduct(id);
	}
}
