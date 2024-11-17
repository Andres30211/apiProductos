package productos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import productos.dao.IProductService;
import productos.dao.services.ProductService;
import productos.models.Products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class ProductoRestController {
	
	@Autowired
	private IProductService iProductService;

	@GetMapping("/lista")
	public List<Products> lista() {
		return this.iProductService.findAll();
	}
	
}
