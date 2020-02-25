package code;

public class Books extends Product {
	
	private String genre;
	private String condition; 
	private String type; 
	private int pages; 
	private String release; 
	
	public Books(String myName, double myPrice, String myGenre, String myCondition, String myType, int myPages, String myDate)
	{
		super(myName, myPrice);
		genre = myGenre; 
		condition = myCondition; 
		type = myType; 
		pages = myPages; 
		release = myDate; 
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
		return condition; 
	}
	
	public String getType()
	{
		return type; 
	}
	
}
