package com.web.spring.main;

public class InjectingObjects
{
	
	private Point PointA;
	private Point PointB;
	private Point PointC;
	
	
	public Point getPointA() 
	{
		return PointA;
	}


	public void setPointA(Point pointA)
	{
		PointA = pointA;
	}


	public Point getPointB() 
	{
		return PointB;
	}


	public void setPointB(Point pointB) 
	{
		PointB = pointB;
	}


	public Point getPointC()
	{
		return PointC;
	}


	public void setPointC(Point pointC) {
		PointC = pointC;
	}


	public void points ()
	{
		System.out.println(getPointA().getX() + " " + getPointA().getY() );
		System.out.println(getPointB().getX() + " " + getPointB().getY() );
		System.out.println(getPointC().getX() + " " + getPointC().getY() );

		
	}
}
