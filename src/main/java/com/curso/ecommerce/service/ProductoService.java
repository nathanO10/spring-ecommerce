package com.curso.ecommerce.service;

import java.util.Optional;

import com.curso.ecommerce.model.Producto;

public interface ProductoService {
//defino todo los metodos crud para el tipo producto
	public Producto save(Producto producto);
	//optional no da la opcion de validar si es el objeto que llaamos de las base de dato existe
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
	
}
