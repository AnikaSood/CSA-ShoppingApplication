package code;

public abstract class Product {
	
	private String name;
	private double price; 
	private String product; 

	 
	
	public Product(String myProduct, String myName, double myPrice)
	{
		name = myName; 
		price = myPrice; 
		product = myProduct; 
	}
	
	public abstract String toString();
		
	
	public void setName(String myName)
	{
		name = myName; 
	}
	
	public abstract String makeDescription();
	
	public String getName()
	{
		return name; 
	}
	
	public double getPrice()
	{
		return price; 
	}
	
	public String getProduct()
	{
		return product; 
	}

}
