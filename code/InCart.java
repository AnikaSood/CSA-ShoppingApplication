package code;
import java.util.ArrayList; 
import java.util.List;

import code.*; 

public class InCart {
	
	private static List<Product> inCart = new ArrayList<Product>(); 
	
	public InCart()
	{
		
	}
	
	public static void addToList(Product prod)
	{
		inCart.add(prod);
	}
	
	public static void takeOutList(Product prod)
	{
		inCart.remove(prod);
	}
	
	public Product getProd(String prodName)
	{
	
	SearchControl search = new SearchControl();
	List<Product> needToCartList = search.searchReturn(prodName);
	
	Product needToCart = needToCartList.get(0);
	
	return needToCart; 
	
	
	}
	
}
