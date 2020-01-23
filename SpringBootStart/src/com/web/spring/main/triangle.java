package com.web.spring.main;

public class triangle 
{
	private String text;
	private int height;

	//getter for height and will set the value using constructor
	public int getHeight() 
	{
		return height;
	}

	
	//**************************** Method Overloading Start **************************** 
	
	//constructor just to initialize text
	public triangle (String text)
	{
		this.text = text;
	
	}
	
	//another constructor to initialize text and height both
	public triangle (String text, int height)
	{
		this.text = text;
		this.height = height;
		
	}
	
	//**************************** Method Overloading End ****************************** 
	
	//getter for text
	public String getText() 
	{
		return text;
	}

	//setter for text
	public void setText(String text)
	{
		this.text = text;
	}

	//method
	public void draw()
	{
	/*	//to print for SpringBeanFactory 
		System.out.println(" Triangle drawn ");
	*/
	
	/*	//to print for ApplicationContext Setter
		System.out.println(getText() +" Triangle drawn ");
	*/
		
	/*	//to print for  ApplicationContext Constructor
		System.out.println(getText() +" Triangle drawn ");
	*/
		
		//to print for ApplicationCOntext multiple Constructors
		System.out.println(getText() + " Triangle drawn " + getHeight());
	}
}
