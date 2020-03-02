package code;

import java.util.*;

public class Storage {
	
	Product movie1, movie2, movie3, movie4;
	
	Product book1, book2, book3, book4; 
	
	Product shoe1, shoe2, shoe3, shoe4; 
	
	Product supply1, supply2, supply3, supply4; 
	
	private List<Product> products = new ArrayList<Product>(); 
	
	public Storage()
	{
		movie1 = new Movies("Movies", "Drama/Thriller", "A Quiet Place", 8.99, 7.5, "PG-13", "1 h 31 m", "2018");
		movie2 = new Movies("Movies", "Narrative/Fantasy", "Harry Potter: Sorcerer's Stone", 7.99, 7.6, "PG", "2 h 39 m", "2001");
		movie3 = new Movies("Movies", "Fantasy", "The Little Mermaid", 6.99, 7.6, "G", "1 h 25 m", "1989");
		movie4 = new Movies("Movies", "Teen/Comedy", "Mean Girls", 7.99, 7, "PG-13", "1 h 27 m", "2004");
		
		book1 = new Books("Books", "Catcher in the Rye", "J.D. Salinger", 6.99, "Coming-of-Age Fiction", "new", "paperback", 196, "May 1, 1991"); 
		book2 = new Books("Books", "Percy Jackson: The Lightning Thief", "Rick Riordan", 6.99, "Fantasy-Adventure", "like new", "hardcover", 428, "June 28, 2005");
		book3 = new Books("Books", "Hunger Games", "Suzanne Collins", 10.19, "Science Fiction", "used poor", "paperback", 374, "September 14 2008");
		book4 = new Books("Books", "Flat Stanley: His Orginal Adventure", "Jeff Brown", 4.79, "Children's Literature", "new", "kindle", 89, "May 18th, 1964");
		
		shoe1 = new Shoes("Shoes", "The Classic Clog", 9.99, "Puke Green", "Crocs", "Clogs"); //
		shoe2 = new Shoes("Shoes", "Men's Slip-on Skate Shoe", 46.70, "White", "Vans", "Slip-ons");
		shoe3 = new Shoes("Shoes", "Air Force 1", 90.00, "Black", "Nike", "Sneakers");
		shoe4 = new Shoes("Shoes", "Christian Louboutins", 1195.01, "Gold", "Christian Louboutins", "Pumps");
		
		supply1 = new SchoolSupplies("Office Supply, School Supply", "Binder", 5.99, "Staples", "Green", "3-ring"); 
		supply2 = new SchoolSupplies("Office Supply, School Supply", "10 Ream Copy Paper", 43.99, "HP", "Plain White", "8.5x11"); 
		supply3 = new SchoolSupplies("Office Supply, School Supply", "Notebook", 2.99, "Office Depot", "Navy Blue", "College-Ruled"); 
		supply4 = new SchoolSupplies("Office Supply, School Supply", "Stapler", 12.00, "Target", "Black", "Mini");
		
		products.add(movie1);
		products.add(movie2);
		products.add(movie3);
		products.add(movie4);
		products.add(book1);
		products.add(book2);
		products.add(book3);
		products.add(book4);
		products.add(shoe1);
		products.add(shoe2);
		products.add(shoe3);
		products.add(shoe4); 
		products.add(supply1);
		products.add(supply2);
		products.add(supply3);
		products.add(supply4); 
		
		
	}
	
	public List<Product> getProds()
	{
		return products;
	}
	
	
	public static void main(String[]args)
	{
		Storage store = new Storage();
				
				List<Product> prods = new ArrayList<Product>();
		
		prods = store.getProds();
		
		for(int i = 0; i<5; i++)
		{
			System.out.println(prods.get(i).makeDescription());
		}
				
	}

}
