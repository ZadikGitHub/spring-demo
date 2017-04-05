package com.intellimed.spring_demo;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{
	
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



	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean afterPropertiesSet method called!");		
		
	}

	
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy method called!");		
	}
	
	public void myInit(){
			System.out.println("MyInit  method called!");		
	}
	
	public void myDestroy(){
		System.out.println("MyDestroy  method called!");		
}
		
	
}
