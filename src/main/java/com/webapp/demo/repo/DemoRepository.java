package com.webapp.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.webapp.demo.Product;

public interface DemoRepository extends JpaRepository<Product, Integer> {

}
