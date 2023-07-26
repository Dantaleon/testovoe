package task6;

import java.util.ArrayList;
import java.util.List;

public class task6 {
	

	public static void main(String[] args) {
		
		Cart cart = new Cart();
		cart.addProduct("Чай", 2);
		cart.addProduct("Кофе", 4);
		cart.addProduct("Вода", 6);
		cart.addProduct("Вода2", 12);
		
		System.out.println("Initial cart");
		outputList(cart.getProducts());
		
		System.out.println("Remove Вода2");
		System.out.println("Update Кофе quantity to 2");
		cart.removeProduct("Вода2");
		cart.updateProductQuantity("Кофе", 2);
		outputList(cart.getProducts());
		
		System.out.println("Get Чай quantity: " + cart.getProductQuantity("Чай"));
		System.out.println("Clear cart");
		cart.clear();
		System.out.println("cart size: " + cart.getProducts().size());
	}
	
	public static void outputList(List<String> list) {
		System.out.println("----------------------------------------");
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i).toString());
		}
		System.out.println("----------------------------------------");
	}

}
