package com.web.spring.main;

import java.util.List;

public class Names_list 
{

	private List<Names> names;

	public List<Names> getNames()
	{
		return names;
	}

	public void setNames(List<Names> names) 
	{
		this.names = names;
	}
	
	public void print_names ()
	{
		for(Names name: names)
		{
			System.out.println(name.getX());
			
		}
	}
	
}
