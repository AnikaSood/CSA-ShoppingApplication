package code;

public class Shoes extends Product {

	private int size; 
	private String Color; 
	private String Brand;
	private String Description;
	private double price;
	private String name; 
	
	public Shoes(String myName, double myPrice, String myDescription, String color,String brand) {
		super(myName, myPrice);
		name = myName; 
		price = myPrice; 
		Description = myDescription;
		Color = color;
		Brand = brand;
	}

	@Override
	public String toString() {
		
		return name;
	}

		
	

	public void setSize(int s) {
		size = s; 
	}

	public int getSize() {
		return size;
	}
	
	public String getColor() {
		return Color;
	}
	
	public String getBrand() {
		return Brand; 
	}
	
	public double getPrice() {
		return price; 
	}
	
	public String getDescription()
	{
		return Description;
		
	}
	
	
}
