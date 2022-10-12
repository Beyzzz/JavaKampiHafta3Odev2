package oopWithNLayaredApp.dataAcces;

import oopWithNLayaredApp.entities.Product;

public class jdbcProductDao implements ProductDao{
	// Veri tabanına erişim işlemlerini gerçekleştiriyoruz
	// sadece ve sadece db kodları buraya yazılır.
	
	public void add(Product product) {
		System.out.println("JDBC İLE VERİ TABANINA EKLENDİ");
	}
	

}	
