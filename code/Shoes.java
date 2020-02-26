package code;

public class Shoes extends Product {

	private int size; 
	private String Color; 
	private String Brand;
	private String Description;
	
	
	public Shoes(String myName, double myPrice, String myDescription, String color,String brand) {
		super(myName, myPrice);
		//name = myName; 
		//price = myPrice; 
		Description = myDescription;
		Color = color;
		Brand = brand;
	}

	@Override
	public String toString() {
		String a = this.getName();
		return a;
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
	
	public String getDescription()
	{
		return Description;
		
	}
	
	
}
