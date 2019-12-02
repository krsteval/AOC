package com.aoc.helpers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Common<T> {

	private final String FILE_DIRECTORY = "src/com/aoc/assets/";
	private final String INPUT = "input_";
	
    private static Common instance = null; 
    
    public static Common getInstance() 
    { 
        if (instance == null) 
        	instance = new Common(); 
  
        return instance; 
    } 
    
	public Set<T> readInput(Integer taskNo) throws IOException {
		File file = new File(FILE_DIRECTORY + INPUT + taskNo + ".txt"); 
		  
		BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath())); 
		  
		String row; 
		Set<T> input = new HashSet<T>();
		while ((row = br.readLine()) != null) 
	    {
			if(row.contains(",")) {
				String []items = row.split(",");
				for (int i = 0; i < items.length; i++) {
					input.add((T) Integer.valueOf(items[i]));
				}
			} else {
				input.add((T) Integer.valueOf(row.trim()));	
			}
	    }
		
		return input;
	} 
	
}
