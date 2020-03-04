package code;
import java.util.List; 
import java.util.ArrayList; 
public class Cart {
	
	public static double totalPrice;

	public static List<Product> cart = new ArrayList<Product>(); 

	
	public double calcPrice(List<Product> buying)
	{
		double totalPrice = 0; 
		
		//calculate the total price
		for(int i =0; i<buying.size(); i++)
		{
			totalPrice+= buying.get(i).getPrice(); 
		}
		
		return totalPrice; 
	}
	
	public static void addToList(String prodName)
	{
		//find which product needs to be added
		SearchControl x = new SearchControl();
		List<Product> toAdd = x.searchReturn(prodName);
		
		//add this product to the cart
		cart.add(toAdd.get(0));
		
		System.out.println(prodName+" added"); //test if it works
		
	}
	
	public static void removeFromList(String prodName)
	{
		//find which product needs to be removed
		SearchControl x = new SearchControl();
		List<Product> toRemove = x.searchReturn(prodName);
		
		//remove from the cart
		cart.remove(toRemove);
	}

}
