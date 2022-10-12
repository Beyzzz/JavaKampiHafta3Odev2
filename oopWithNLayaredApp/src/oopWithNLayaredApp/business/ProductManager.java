package oopWithNLayaredApp.business;

import java.util.List;

import oopWithNLayaredApp.core.logging.Logger;
import oopWithNLayaredApp.dataAcces.ProductDao;
import oopWithNLayaredApp.dataAcces.jdbcProductDao;
import oopWithNLayaredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;

		// PRODUCT MANAGER NEWLENDİĞİNDE BANA BİR PRODUCT MANAGER VER
	}

	public void add(Product product) throws Exception {
		// iş kuralları
		if (product.getUnitPrace() < 10) {
			throw new Exception("ürün birim fiyatı ondan küçük olamaz");
		}

		productDao.add(product);
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}
}
