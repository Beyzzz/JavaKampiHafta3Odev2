package oopWithNLayaredApp.dataAcces;

import oopWithNLayaredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) {
		System.out.println("HİBERNATE İLE VERİ TABANINA EKLENDİ");
	}
}
