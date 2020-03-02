package code;

public class Shoes extends Product {

	private int size; 
	private String Color; 
	private String Brand;
	private String type; 
	private String image;
	
	public Shoes(String myProduct, String myName, double myPrice, String color,String brand, String myType, String myImage) {
		super(myProduct, myName, myPrice, myImage);
		//name = myName; 
		//price = myPrice; 
		Color = color;
		Brand = brand;
		type = myType; 
		image = myImage;
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
		String des = getProduct() + "\n" + getName() + "\n" + getPrice() + 
				"\n"+ getColor() + "\n" + getBrand() + "\n" + getType(); 
		return des; 
	}
	
	
}
