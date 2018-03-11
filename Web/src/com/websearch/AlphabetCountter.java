package com.websearch;


public class AlphabetCountter {
	public AlphabetCountter() {System.out.println("alphabet");
	}
	public float[] AB= new float[40];//aray of alphabet
	
	
private int letterCounter(String text, char letter){
	int countter=0;
	
	for(int i=0;i<text.length();i++)if(text.charAt(i)==letter)countter++;
		
	
	return countter;
	
}
public float[] alphabet(String text){
	int j=0;//countter
	int sum=0;

for(char ch='a';ch<='z';ch++){

	AB[j]=letterCounter(text,ch);
	
	sum+=AB[j];
	j++;
	}
for(int i=0;i<AB.length;i++)AB[i]=AB[i]/sum;
return AB;

}
public String lettersStatiscits(float[] array){
	System.out.println("a "+array[0]+ "e "+array[4]+"i "+array[8]+"s "+array[18]);
	if(array[0]>0.08 && array[8]>0.06 && array[4]<0.1&&array[0]>array[4]) return "Polish";
	else if (array[4]>0.09&&array[4]<0.15&&array[19]>0.08) return "English";
	else if (array[4]>0.12&&array[16]>0.005) return "French";
	else if (array[4]>0.14&&array[14]<0.04) return "German";
	else return "Unknown";
	
}
}
