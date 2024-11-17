package productos.dao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import productos.dao.IProductDao;
import productos.dao.IProductService;
import productos.models.Products;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	private IProductDao dao;

	@Override
	public List<Products> findAll() {
		return (List<Products>) this.dao.findAll();
	}

	@Override
	public void save(Products product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Products findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
