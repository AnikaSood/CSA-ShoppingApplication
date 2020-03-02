package code;
import java.util.List; 
import java.util.ArrayList; 
public class Cart {
	
	public double calcPrice(List<Product> buying)
	{
		double totalPrice = 0; 
		for(int i =0; i<buying.size(); i++)
		{
			totalPrice+= buying.get(i).getPrice(); 
		}
		
		return totalPrice; 
	}
	

}
