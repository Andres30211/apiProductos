package productos.dao;

import org.springframework.data.repository.CrudRepository;

import productos.models.Products;

public interface IProductDao extends CrudRepository<Products, Integer>{

}
