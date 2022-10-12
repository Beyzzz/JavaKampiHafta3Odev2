package oopWithNLayaredApp;

import oopWithNLayaredApp.business.ProductManager;
import oopWithNLayaredApp.core.logging.DataBaseLogger;
import oopWithNLayaredApp.core.logging.FileLogger;
import oopWithNLayaredApp.core.logging.Logger;
import oopWithNLayaredApp.core.logging.MailLogger;
import oopWithNLayaredApp.dataAcces.HibernateProductDao;
import oopWithNLayaredApp.dataAcces.jdbcProductDao;
import oopWithNLayaredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Product product1 = new Product(1, "İphone 11", 10000);
		// iş birimiyle iletişim kurar i
		Logger[] loggers = { new FileLogger(), new MailLogger(), new DataBaseLogger() };
		ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
		productManager.add(product1);

	}

}
