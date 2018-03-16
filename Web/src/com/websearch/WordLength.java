package com.websearch;

public class WordLength {
public WordLength(){
	System.out.println("wordlength");
}
public float WordCountter(String text){
	float spaceCountter=0;
	float letterCountter=0;
	
	for(int i=0;i<text.length();i++)
	{
		if(text.charAt(i)==' '){
			spaceCountter++;
			}
		
		
		if(Character.isLetter(text.charAt(i)))letterCountter++;
		
	}
	System.out.println(letterCountter+" "+spaceCountter);
	return letterCountter/spaceCountter;
}
}
