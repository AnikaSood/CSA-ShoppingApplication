package code;

public class Movies extends Product{
	
	private String genre; 
	private double IMDb; 
	private String MPA; 
	private String length; 
	private String release; 
	private String image;
	
	public Movies(String myProduct, String myGenre, String myName, double myPrice, double myReview, String myRating, String myLength, String myRelease, String myImage)
	{
		super(myProduct, myName, myPrice, myImage);
		genre = myGenre; 
		IMDb = myReview;
		MPA = myRating; 
		length = myLength; 
		release = myRelease;
		image = myImage;
	}

	
	public String toString()
	{
		String name = getName();
		return name; 
		
	}
	
	public String getLength()
	{
		return length;
	}
	
	public String getRating()
	{
		return MPA; 
	}
	
	public String getDate()
	{
		return release; 
	}
	
	public double getReview()
	{
		return IMDb; 
	}
	
	public String getGenre()
	{
		return genre; 
	}
	public String makeDescription()
	{
		String description = getProduct() + "\n" + getGenre() + "\n" + getRating() 
		+ "\n" + getPrice() + "\n" + getLength() + "\n" + toString() + "\n"
		 + getDate() + "\n" + getReview();
		return description; 
	}
	
	public static void main(String[] args)
	{
		Movies prod = new Movies("Movies", "horror", "Nightmares", 11.20, 7.2,"R", "3 hr 12 min", "Sept 2020", "ui/image.jpg");
		String description = prod.makeDescription();
		System.out.print(description);
	}
}
