package code;

public class Movies extends Product{
	
	private String genre; 
	private double IMDb; 
	private char MPA; 
	private String length; 
	private String release; 
	//private static String price; 
	
	public Movies(String myGenre, String myName, String myDescription, double myPrice, double myReview, char myRating, String myLength, String myRelease)
	{
		super(myName, myPrice);
		myGenre = genre; 
		myReview = IMDb;
		myRating = MPA; 
		myLength = length; 
		myRelease = release; 
		
		
	}
	
	public String toString()
	{
		String name = getName();
		return name; 
		
	}
	
	public void setDescription()
	{
		String description = price + "\n"; 
	}

	public static void main(String[] args)
	{
		System.out.print(price);
	}
}
