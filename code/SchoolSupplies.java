package code;

public class SchoolSupplies extends Product{
	
	private String brand; 
	private String color; 
	private String type; 
	private String image;

	public SchoolSupplies(String myProduct, String myName, double myPrice, String myBrand, String myColor, String myType, String myImage) {
		super(myProduct, myName, myPrice, myImage);
		brand = myBrand; 
		color = myColor; 
		type = myType; 
		
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		String name = getName(); 
		return name; 
	}
	
	public String getBrand()
	{
		return brand; 
	}
	
	public String getColor()
	{
		return color; 
	}
	
	public String getType()
	{
		return type; 
	}
	
	public String makeDescription()
	{
		String des = getProduct() + "\n" + getName() + getPrice() + "\n" + getBrand() + "\n" + getColor() + "\n" + getType(); 
		return des; 
	}
	
	

}
