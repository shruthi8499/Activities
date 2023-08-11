package com.functional;
public class Shape {
	public void calculateshapearea(Area areacal,int sides)
	{
		areacal.calculateArea(sides);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape=new Shape();
		shape.calculateshapearea((sides)->{
			int area=sides*sides;
			System.out.println("Area is "+area);
		}, 7);

	}

}
