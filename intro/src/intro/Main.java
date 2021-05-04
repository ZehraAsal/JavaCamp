package intro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1, "C# + Angular", "Engin Demiroð", 50);
		Product product2 = new Product(2, "Java-React", "Engin Demiroð", 50);
		Product product3 = new Product(1, "Programlamaya Giriþ", "Engin Demiroð", 100);
		
		Product[] products = {product1, product2, product3};
		
		
		for (Product product : products) {
			System.out.println(product.name);
		}

		System.out.println(products.length);
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.finnish(product2);
	}

}
