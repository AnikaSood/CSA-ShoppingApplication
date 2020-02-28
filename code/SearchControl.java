package code;
import java.util.ArrayList;
import java.util.List;

import chn.util.*;
import chn.util.FileInput;
import chn.util.FileOutput;
public class SearchControl {
	
Storage store = new Storage();
List<FileOutput> allFiles = new ArrayList<FileOutput>();
List<Product> all = store.getProds(); 
List<FileInput> readFiles = new ArrayList<FileInput>();
	
	public SearchControl()
	{
		createFiles(); 
		
	}
	
	public void createFiles()
	{
		
		for(int index = 0; index<all.size(); index++)
		{
			allFiles.add(new FileOutput(all.get(index).getName()+ ".txt"));
		}
	
		for(int i = 0; i <allFiles.size(); i++)
		{
			allFiles.get(i).print(all.get(i).makeDescription().toLowerCase());
			allFiles.get(i).close();
		}
		
	
	}
	
	public List<Product> searchReturn(String entered)
	{
		createFiles();
		String check = "";
		List<Product> display = new ArrayList<Product>();
		
		for(int fileNum = 0; fileNum<all.size(); fileNum++)
		{
			readFiles.add(new FileInput(all.get(fileNum).getName()+ ".txt"));
		}
		
		for(int index = 0; index<allFiles.size(); index++)
		{
			while(readFiles.get(index).hasMoreLines())
			 check = readFiles.get(index).readLine();
			 if(check.indexOf(entered) >=0)
					 {
				 		display.add(all.get(index));
				 		break;
					 }
		}
		
		return display; 
		
		
	}
	
	public static void main(String[] args)
	{
		SearchControl search = new SearchControl();
		search.searchReturn("Catcher");
	}
	

}
