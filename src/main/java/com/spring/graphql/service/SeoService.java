package com.spring.graphql.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.graphql.model.Seo;
import com.spring.graphql.repository.SeoRepository;

@Service
@Transactional	
public class SeoService {
	
	@Autowired
	private SeoRepository seoRepository;

	public Optional<Seo> getProduct(String id) {
		return this.seoRepository.findById(id);
	}
}
