package com.web.spring.main;

import java.util.List;

public class PointsList
{
	
	private List<Point> points;
	
	

	
	public List<Point> getPoints() {
		return points;
	}




	public void setPoints(List<Point> points) {
		this.points = points;
	}




	public void points ()
	{
		for(Point point: points)
		{
			System.out.println(point.getX()+ " " + point.getY());
			
		}
	}
	

}