
package com.javatraining.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.javatraining.dao.IProductDao;
import com.javatraining.model.Product;
import com.javatraining.service.IProductService;

@Component("productService")
public class ProductServiceImpl implements IProductService{

	@Autowired
	private IProductDao productDao;
	
	@Override
	public List<Product> getAllProducts(){
		return productDao.getAllProducts();
	}

	@Override
	public Product findProduct(Integer productId) {
	
		return productDao.findProduct(productId);
	}

	@Override
	public List<Product> deleteProduct(Integer productId) {
		
		return productDao.deleteProduct(productId);
	}

	@Override
	public List<Product> saveProduct(Product product) {
		
		return productDao.saveProduct(product);
	}

	@Override
	public List<Product> updateProduct(Product product) {
		
		return productDao.updateProduct(product);
	}

	@Override
	public List<Product> saveAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
