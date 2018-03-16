package com.websearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class GetUrl {
	public String ReturnUrl(String adress) throws IOException{
		 URL oracle = new URL(adress);
	        BufferedReader in = new BufferedReader(
	        new InputStreamReader(oracle.openStream()));
	        String inputLine;
	        String wholeLine = null;
	        //scan web page content
	        while ((inputLine = in.readLine()) != null){
	        
	        if(inputLine.contains("<p>")){
	        	
	        	wholeLine+=inputLine;
	
	        	
	        	
	        }
	        }
	        in.close();
		return wholeLine;
	}

}
