package oopWithNLayaredApp.dataAcces;

import oopWithNLayaredApp.entities.Product;

public interface ProductDao  {
	
	// Birbirinin altarneti olan durumlarda interface oluşturuyoruz.
	// Product daonun kurallarına uymalısın artık 
  void add(Product product);
  // !!! İnterfacele sadece metod imzasını barındırabilir.
	  

}