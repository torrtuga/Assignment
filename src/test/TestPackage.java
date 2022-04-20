package test;

import shape.Triangle;

public class TestPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base = 10;
		int height = 20;
		Triangle triangle = new Triangle();
		double area = triangle.calculateHeight(base, height);
		System.out.println("Area = " + area);
	}

}
