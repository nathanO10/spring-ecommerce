package com.curso.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.ecommerce.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	//se pone el producto para que haga el select insert etc por el ineteger
//esto es una dao para conectar y hacer el crud
	
	
}
