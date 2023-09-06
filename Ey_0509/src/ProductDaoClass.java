import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Product {

	int product_id;
	String prod_name;
	String prod_desc;
	int prod_quantity;
	double prod_price;

	LocalDate provalidity;

	public LocalDate getProvalidity() {
		return provalidity;
	}

	public void setProvalidity(LocalDate provalidity) {
		this.provalidity = provalidity;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public String getProd_desc() {
		return prod_desc;
	}

	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}

	public int getProd_quantity() {
		return prod_quantity;
	}

	public void setProd_quantity(int prod_quantity) {
		this.prod_quantity = prod_quantity;
	}

	public double getProd_price() {
		return prod_price;
	}

	public void setProd_price(double prod_price) {
		this.prod_price = prod_price;
	}

	Product() {
	}

	public Product(int product_id, String prod_name, String prod_desc, int prod_quantity, double prod_price,
			LocalDate provalidity) {

		this.product_id = product_id;
		this.prod_name = prod_name;
		this.prod_desc = prod_desc;
		this.prod_quantity = prod_quantity;
		this.prod_price = prod_price;
		this.provalidity = provalidity;
	}

}

interface ProductDAO {
	String nameOfProduct(Product p);

	int priceOfProduct(Product p);

	int quantityOfProduct(Product p);

	String descriptionOfProduct(Product p);

	LocalDate proValidityDate(Product p);

	List<Product> getALLProducts();

	void deleteProduct(Product p);

	void upodateProduct(Product p);
}

class ProductDAOImpl implements ProductDAO {
	List<Product> listOfProducts = new ArrayList<>();

	public ProductDAOImpl() {
		Product p1 = new Product(123, "A", "B", 10, 10.29, LocalDate.now());
		Product p2 = new Product(124, "C", "D", 20, 20.29, LocalDate.of(2019, Month.FEBRUARY, 20));
		listOfProducts.add(p1);
		listOfProducts.add(p2);
		listOfProducts.add(p2);
	}

	@Override
	public String nameOfProduct(Product p) {
		Iterator<Product> itr = listOfProducts.iterator();
		while (itr.hasNext()) {
			Product p2 = itr.next();
			return p2.getProd_name();
		}
		return null;
	}

	@Override
	public int priceOfProduct(Product p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int quantityOfProduct(Product p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String descriptionOfProduct(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocalDate proValidityDate(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getALLProducts() {

		return listOfProducts;
	}

	@Override
	public void deleteProduct(Product p) {

	}

	public void upodateProduct(Product p) {
		// TODO Auto-generated method stub

		Iterator<Product> itr = getALLProducts().iterator();
		while (itr.hasNext()) {
			Product p2 = itr.next();
			p2.setProd_name(p.getProd_name());
		}
		return;

	}

}

public class ProductDaoClass {

	public static void main(String[] args) {
		ProductDAOImpl obj = new ProductDAOImpl();
		Product p2 = new Product(123, "P", "Q", 10, 10.29, LocalDate.now());
		obj.upodateProduct(p2);
		for (Product p : obj.getALLProducts()) {
			System.out.println("Product [product_id=" + p.product_id + ", prod_name=" + p.prod_name + ", prod_desc="
					+ p.prod_desc + ", prod_quantity=" + p.prod_quantity + ", prod_price=" + p.prod_price
					+ ", provalidity=" + p.provalidity + "]");

			// obj.deleteProduct(p);
			// after deletion

		}

	}

}
