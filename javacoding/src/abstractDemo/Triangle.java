package abstractDemo;

public class Triangle extends Shape {
	private double h,a,b,c;
	
	public Triangle(double height, double base, double a, double c) {
		this.h = height;
		this.a = a;
		this.c = c;
		this.b = base;	
	}
	
	public double calcArea(){
		return ((0.5)*b*h);
	}
	public double calcPerimeter(){
		return a+b+c;
	}
}	
