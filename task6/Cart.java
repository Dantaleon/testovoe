package task6;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Basket {
	
	ArrayList<Product> products = new ArrayList<Product>();
	
	public Cart() {
		
	}
	
	@Override
	public void addProduct(String product, int quantity) {
		
		products.add(new Product(product, quantity));
	}

	@Override
	public void removeProduct(String product) {
		
		for (int i = 0; i < products.size(); ++i) {
			if (products.get(i).getName().equals(product)) {
				products.remove(products.get(i));
			}
		}
	}

	@Override
	public void updateProductQuantity(String product, int quantity) {
		
		for (int i = 0; i < products.size(); ++i) {
			if (products.get(i).getName().equals(product)) {
				products.get(i).setAmount(quantity);;
			}
		}
	}

	@Override
	public void clear() {
		
		products.removeAll(products);
	}

	@Override
	public List<String> getProducts() {
		List<String> list = new ArrayList<String>();
		
		for (int i = 0; i < products.size(); ++i) {
			list.add(products.get(i).toString());
		}
		
		return list;
	}

	@Override
	public int getProductQuantity(String product) {
		
		for (int i = 0; i < products.size(); ++i) {
			if (products.get(i).getName().equals(product)) {
				return products.get(i).getAmount();
			}
		}
		
		return 0;
	}
	
}