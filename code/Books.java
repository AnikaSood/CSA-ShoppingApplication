package code;

public class Books extends Product {
	
	private String genre;
	private String condition; 
	private String type; 
	private int pages; 
	private String release; 
	private String author; 
	private String image;

	
	public Books(String myProduct, String myName, String myAuthor, double myPrice, String myGenre, String myCondition, String myType, int myPages, String myDate, String myImage)
	{
		super(myProduct, myName, myPrice, myImage);
		author = myAuthor; 
		genre = myGenre; 
		condition = myCondition; 
		type = myType; 
		pages = myPages; 
		release = myDate; 
		image = myImage;
		getPrice();
	}
	
	public String toString()
	{
		String name = getName(); 
		return name; 
	}
	
	public String getLength()
	{
		return pages + "pages"; 
	}
	
	public String getGenre()
	{
		return genre; 
	}
	
	public String getRelease()
	{
		return release; 
	}
	
	public String getCondition()
	{
		return condition; 
	}
	
	public String getType()
	{
		return type; 
	}
	
	public String getAuthor()
	{
		return author; 
	}
	
	public double priceAdjust(String condition, String type)
	{
		double price = getPrice();

		if (condition.equals("like new"))
		{
			price-=(0.10*price); 
		}
		else if(condition.equals("used good"))
		{
			price-=(0.20*price);
		}
		else if(condition.equals("used, poor"))
		{
			price-=(0.30*price);
		}
		else if(condition.equals("collectible"))
		{
			price+=(1.30*price);
		}
		else
		{
			price = price; 
		}
		
		if(type.equals("Kindle"))
		{
			price-=(0.09*price);
		}
		
		else if(type.equals("Paperback"))
		{
			price = price;
		}
		
		else if(type.equals("Hardcover"))
		{
			price+=(0.36*price);
		}
		
		return price; 
	}
	
	public String makeDescription()
	{
		String description = getProduct() + "\n" + getName() + "\n" + author + "\n" + priceAdjust(condition, type) + "\n" 
	+ genre + "\n" + pages + "\n" + condition + "\n" + type + "\n" + release;
		return description; 
	}
	
	public static void main(String[] args)
	{
		Books book = new Books("Books", "Hunger Games", "Suzanne Collins", 21.50, "Dystopian", "used, poor", "kindle", 430, "Sept 2020", "ui/image.jpg");
		String des = book.makeDescription();
		System.out.print(des);
	}
	
	
}
