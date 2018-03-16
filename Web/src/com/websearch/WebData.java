package com.websearch;

public class WebData {
	private float[] AB;
	private String adres;
	public float[] getAB() {
		return AB;
	}
	public void setAB(float[] aB2) {
		AB = aB2;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public double getWordNumber() {
		return wordNumber;
	}
	public void setWordNumber(double wordNumber) {
		this.wordNumber = wordNumber;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	private String content;
	private double wordNumber;
	private String language;

}
