package firstPakage;

//Java program to illustrate Data Access Object Pattern

//Importing required classes
import java.util.ArrayList;
import java.util.List;

class Product {

	private String name;
	private int ProductId;
	private int quantity;

	Product(String name, int ProductId, int quantity) {
		this.quantity = quantity;
		this.name = name;
		this.ProductId = ProductId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProductId() {
		return ProductId;
	}

	public void setProductId(int ProductId) {
		this.ProductId = ProductId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}

interface ProductDao {
	public List<Product> getAllProducts();

	public Product getProduct(int ProductId);

	public void updateProduct(Product Product);

	public void deleteProduct(Product Product);
}

class ProductDaoImpl implements ProductDao {

	List<Product> Products;

// Method 1
	public ProductDaoImpl() {
		Products = new ArrayList<Product>();
		Product Product1 = new Product("B", 0, 75);
		Product Product2 = new Product("C", 1, 76);
		Products.add(Product1);
		Products.add(Product2);
	}

	@Override
	public List<Product> getAllProducts() {
		return Products;
	}

	@Override
	public Product getProduct(int ProductId) {
		return Products.get(ProductId);
	}

	@Override
	public void updateProduct(Product Product) {
		Products.get(Product.getProductId()).setName(Product.getName());
		System.out.println("ProductId " + Product.getProductId() + ", updated in the database");
	}

	@Override
	public void deleteProduct(Product Product) {
		Products.clear();
		System.out.println("ProductId " + Product.getProductId() + ", deleted from database");
	}
}

class Product1 {

	public static void main(String[] args) {

		ProductDao ProductDao = new ProductDaoImpl();

		for (Product Product : ProductDao.getAllProducts()) {
			System.out.println("ProductId : " + Product.getProductId() + ", Name : " + Product.getName());
		}

		Product Product = ProductDao.getAllProducts().get(0);

		Product.setName("A");
		ProductDao.updateProduct(Product);

		ProductDao.getProduct(0);
		System.out.println("ProductId : " + Product.getProductId() + ", Name : " + Product.getName());
		System.out.println("-------------------------------------------");
		for (Product p2 : ProductDao.getAllProducts()) {
			System.out.println("ProductId : " + p2.getProductId() + ", Name : " + p2.getName());
		}

		ProductDao.getProduct(1);
		ProductDao.getProduct(1);
		ProductDao.deleteProduct(Product);

		for (Product p2 : ProductDao.getAllProducts()) {
			System.out.println("Last For Loop");
			System.out.println("ProductId : " + p2.getProductId() + ", Name : " + p2.getName());
		}
	}
}