package code;

public abstract class Product {
	
	private String name;
	private double price; 
	private String product; 
	private String image;

	 
	
	public Product(String myProduct, String myName, double myPrice, String myImage)
	{
		name = myName; 
		price = myPrice; 
		product = myProduct; 
		image = myImage;
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
	
	public String getImage()
	{
		return image;
	}

}
