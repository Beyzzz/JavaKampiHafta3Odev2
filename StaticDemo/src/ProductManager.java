
public class ProductManager {
	ProductValidator productValidator = new ProductValidator();
	public void add(Product product) {
		productValidator.isValid(product);
		System.out.println("Ürün kaydedildi");
	
	
		}

}
