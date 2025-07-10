//package com.app.geometry;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public String getDetails() {
		return "Point("+x+"," +y+")";
	}
	public boolean isEqual(Point2D otherPoint) {
	     return this.x == otherPoint.x && this.y == otherPoint.y;
	  }	   
	    public double calculateDistance(Point2D otherPoint) {
	       return Math.sqrt(Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2));
	    }
	

}
