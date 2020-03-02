package code;
import java.util.ArrayList;
import java.io.*;
import java.util.List;

import java.util.Scanner;
import chn.util.*;
//import chn.util.FileInput;
//import chn.util.FileOutput;
public class SearchControl {
	
Storage store = new Storage();
List<File> allFiles = new ArrayList<File>();
List<PrintWriter> printer = new ArrayList<PrintWriter>(); 
List<Product> all = store.getProds(); 
	
	public SearchControl()
	{
		createFiles(); 
		
	}
	
	
	public void createFiles()
	
	{
		
	for(int i =0; i<all.size(); i++)
		{
			allFiles.add(new File(all.get(i).getName() + ".txt"));
		}
		
	for(int x = 0; x<all.size(); x++)
		{
			try 
			{
				printer.add(new PrintWriter(allFiles.get(x)));
				printer.get(x).print(all.get(x).makeDescription().toLowerCase());
				printer.get(x).close();
			}
			catch(IOException ex)
			{
				System.out.printf("ERROR: %s\n", ex);
			}
			
		}
		
	
	}
	
	
	
	public List<Product> searchReturn(String entered)
	{
		String enter = entered.toLowerCase();
		String check = "";
		List<Product> display = new ArrayList<Product>();
		
	for(int fileNum = 0; fileNum<allFiles.size(); fileNum++)
		{
		
		try
		{
			Scanner p = new Scanner(allFiles.get(fileNum));
			
			while(p.hasNext())
				
			{
				
				check = p.nextLine(); 

				if(check.indexOf(enter) >=0)
				 {
			 		display.add(all.get(fileNum));
			 		break;
				 }
				
			}
		}
		
		catch(FileNotFoundException ex)
		{
			System.out.printf("ERROR: %s\n", ex);
		}
				
		}
				
		return display; 
		
		
	}



	
	public static void main(String[] args)
	{
		SearchControl search = new SearchControl();
		


		List<Product> results = search.searchReturn("green"); 
		
		
		for(int i = 0; i<results.size(); i ++)
		{
			System.out.println(results.get(i).getName());

		}
	}
	

}
	

