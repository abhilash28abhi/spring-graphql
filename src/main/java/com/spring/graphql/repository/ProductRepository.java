package com.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.graphql.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}
