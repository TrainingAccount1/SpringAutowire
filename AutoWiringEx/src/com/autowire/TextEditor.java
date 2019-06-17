package com.autowire;

public class TextEditor {

	private SpellChecker word;
	private String textmessage;
	
     public SpellChecker getWord() {
		return word;
	} 
	
	public void setWord(SpellChecker word) { 
		this.word = word; // we use this setter menthod when using autowiring concept on byName and byType and if using constructor autowire then you need to comment this
	}
	
    /* public TextEditor(SpellChecker word) {
 		super();
 		this.word = word; // use this code when you are using autowiring concept by Constructor mechanism and comment the above setter method  
 	}
     */
     
   
	public String getTextmessage() {
		return textmessage;
	}
	
	public void setTextmessage(String textmessage) {
		this.textmessage = textmessage;
	}
	
	public void checker()
	{
		word.getchecking();
	}
	
	
	
}
