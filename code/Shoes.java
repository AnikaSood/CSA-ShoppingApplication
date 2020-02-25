package code;

public class Shoes extends Product {

	private int size; 
	private String Color; 
	private String Brand;
	
	public Shoes(String myName, double myPrice, String myDescription) {
		super(myName, myPrice);
		
	}

	@Override
	public String toString() {
		
		return null;
	}

		
	

	public void setSize(int s) {
		size = s; 
	}

}
