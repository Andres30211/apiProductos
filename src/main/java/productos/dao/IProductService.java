package productos.dao;

import java.util.List;

import productos.models.Products;

public interface IProductService {

	List<Products> findAll();
	
	void save(Products product);
	
	Products findOne(Integer id);
	
	void delete(Integer id);
}
