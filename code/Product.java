package code;

public abstract class Product {
	
	private String name;
	private double price; 
	private String description; 
	 
	
	public Product(String myName, double myPrice)
	{
		name = myName; 
		price = myPrice; 
	}
	
	public abstract String toString();
		
	
	public void setName(String myName)
	{
		name = myName; 
	}
	
	
	public String getName()
	{
		return name; 
	}
	
	public double getPrice()
	{
		return price; 
	}

}
