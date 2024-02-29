package com.dxc.demo;
import java.lang.FunctionalInterface; //For interface class

	 interface Shape {
		   double calculateArea();
		   double calculatePerimeter();
		}

	 class Circle implements Shape {
		   private double radius;

		   public Circle(double radius) {
		      this.radius = radius;
		   }

		   @Override
		   public double calculateArea() {
		      return Math.PI * radius * radius;
		   }

		   @Override
		   public double calculatePerimeter() {
		      return 2 * Math.PI * radius;
		   }
		}
		public class p9 {
			   public static void main(String[] args) {
			      Shape[] shapes = new Shape[2];
			      shapes[0] = new Circle(5.0);

			      for (Shape shape : shapes) {
			         System.out.println("Area: " + shape.calculateArea());
			         System.out.println("Perimeter: " + shape.calculatePerimeter());
			      }
			   }
}
