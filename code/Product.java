package code;

public abstract class Product {
	
	private String name;
	private double price; 
	private String description; 
	 
	
	public Product(String myName, double myPrice, String myDescription)
	{
		name = myName; 
		price = myPrice; 
		description = myDescription; 
	}
	
	public abstract String toString();
	
	public abstract void setDate();
	
	public abstract void setDescription();
	
	public void setName(String myName)
	{
		name = myName; 
	}
	
	public String getDescription()
	{
		return description; 
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
