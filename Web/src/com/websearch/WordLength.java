package com.websearch;

public class WordLength {
public WordLength(){
	System.out.println("wordlength");
}
public float WordCountter(String text){
	int spaceCountter=0;
	int letterCountter=0;
	
	for(int i=0;i<text.length();i++)
	{
		
		
		if(text.charAt(i)==' '){
			spaceCountter++;

			}
		
		
		else if(text.charAt(i)!=' '&&text.charAt(i)!=','&&text.charAt(i)!='.')letterCountter++;
		
	}
	System.out.println(letterCountter+" "+spaceCountter);
	return letterCountter/spaceCountter;
}
}
