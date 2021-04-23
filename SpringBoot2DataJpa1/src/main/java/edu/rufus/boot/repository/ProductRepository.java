package edu.rufus.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.rufus.boot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
