package com.rest.boot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.boot.app.bean.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
