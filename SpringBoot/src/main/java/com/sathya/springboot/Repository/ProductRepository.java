package com.sathya.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathya.springboot.Entity.ProductEntity;
@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long>{

	static void deleteproductById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
