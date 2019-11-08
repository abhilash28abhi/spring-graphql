package com.spring.graphql.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.graphql.model.Product;
import com.spring.graphql.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	public Optional<Product> getProduct(String id) {
		return this.productRepository.findById(id);
	}
}
