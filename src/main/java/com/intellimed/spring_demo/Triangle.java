package com.intellimed.spring_demo;

import java.util.List;

public class Triangle {
	
	public Triangle(String type){
		this.type=type;
	}
	private String type;
	private List<Point> points;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw(){
		System.out.println(getType() + " triangle is drawn! The coordinates are " + getPoints());
	}

}
