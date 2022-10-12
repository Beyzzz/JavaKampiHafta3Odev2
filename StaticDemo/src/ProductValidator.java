
public class ProductValidator {
	// Bir ürünü kaydedidip güncellerken kurallara uygun olup olmadığına bakılır
	
	public boolean isValid(Product product) {
		if(product.price > 0 && product.name.isEmpty() ) {
			return true;
			
		}else {
			return false;
		}
	}

}
