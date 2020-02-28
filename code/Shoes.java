package code;

public class Shoes extends Product {

	private int size; 
	private String Color; 
	private String Brand;
	private String type; 
	
	
	public Shoes(String myName, double myPrice, String color,String brand, String myType) {
		super(myName, myPrice);
		//name = myName; 
		//price = myPrice; 
		Color = color;
		Brand = brand;
		type = myType; 
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
	
	
	public String getType()
	{
		return type; 
	}
	
	public String makeDescription() 
	{
		String des = getName() + "\n" + getPrice() + "\n"+ Color + "\n" + Brand; 
		return des; 
	}
	
	
}
