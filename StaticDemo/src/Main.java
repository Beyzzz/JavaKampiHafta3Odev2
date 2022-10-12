
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductManager productManager = new ProductManager();
		Product product = new Product();
		product.id= 2;
		product.name= "Kahve Makinesi";
		product.price = 1000.0;
	productManager.add(product);

	}

}
