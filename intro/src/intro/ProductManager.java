package intro;

public class ProductManager {
	public void addToCart(Product product) {
		System.out.println("Sepete ekelendi " + product.name);
	}
	
    public void finnish(Product product) {
    	System.out.println(product.name + " Kurs Baþarýyla Tamamlandý.");
    }	
}
